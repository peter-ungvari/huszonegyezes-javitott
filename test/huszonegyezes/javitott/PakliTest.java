/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package huszonegyezes.javitott;

import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author jupi
 */
public class PakliTest {

    private Pakli pakli = new Pakli();
    private static final int LAPOK_SZAMA = Szin.values().length * Szam.values().length;

    @Test
    public void testLapokSzama() {
        System.out.println("A pakli " + LAPOK_SZAMA + " db. kulonbozo lapot vissza tud adni.");
        Set<Kartya> lapok = new HashSet<Kartya>(LAPOK_SZAMA);
        for (int i = 0; i < LAPOK_SZAMA; ++i) {
            Kartya lap = pakli.lapotAd();
            if (lap == null) {
                fail("A pakli null lapot adott");
            } else if (lapok.contains(lap)) {
                fail("Tobb egyezo lapot adott a pakli.");
            } else {
                lapok.add(lap);
            }
        }
    }

    @Test(expected = NincsTobbLapException.class)
    public void testLapokSzama2() {
        System.out.println("A pakli nem tud " + LAPOK_SZAMA + " db. lapnal tobbet visszaadni.");
        for (int i = 0; i < LAPOK_SZAMA; ++i) {
            pakli.lapotAd();
        }
        pakli.lapotAd();
    }

    @Test
    public void testVanLap() {
        System.out.println("A pakliban " + LAPOK_SZAMA + " lap van.");
        for (int i = 0; i < LAPOK_SZAMA; ++i) {
            assertTrue(pakli.vanLap());
            pakli.lapotAd();
        }
        assertFalse(pakli.vanLap());
    }
}
