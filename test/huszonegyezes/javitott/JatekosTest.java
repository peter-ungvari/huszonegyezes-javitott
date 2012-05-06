/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package huszonegyezes.javitott;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author jupi
 */
public class JatekosTest {

    private Jatekos jatekos = new Jatekos("Valami");

    @Test(expected = IllegalArgumentException.class)
    public void testNevNelkuliJatekos() {
        jatekos = new Jatekos(null);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNevNelkuliJatekos2() {
        jatekos = new Jatekos("  \t \r \n ");
    }

    @Test(expected = HuzasException.class)
    public void testHuzJatekKezdetElott() {
        System.out.println("Jatek kezdete elott nem lehet huzni.");
        jatekos.huz();
    }

    @Test
    public void testHuzPontszam() {
        System.out.println("A huzas utan no a pontszam a kihuzott lap ertekevel.");
        Jatek jatek = new Jatek(Arrays.asList(jatekos));
        jatekos.jatekotKezd(jatek);
        jatekos.huz();
        Assert.assertTrue(jatekos.getPontSzam() > 0 && 
                jatekos.getPontSzam() == jatekos.getLathatoKartyak().get(0).getSzam().getErtek());
    }

    @Test
    public void testToString() {
        System.out.print("A jatekos neve es lapjai: ");
        System.out.println(jatekos);
    }

    @Test
    public void testJatekotKezd() {
        System.out.println("Jatek kezdetekor 0 a pontszam es nincs a jatekosnak kartyaja.");
        Jatek jatek = new Jatek(Arrays.asList(jatekos));
        jatekos.jatekotKezd(jatek);
        Assert.assertEquals(0, jatekos.getPontSzam());
        Assert.assertTrue(jatekos.getLathatoKartyak().isEmpty());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testJatekotKezdJatekNelkul() {
        System.out.println("Nem lehet null jatekot elkezdeni.");
        jatekos.jatekotKezd(null);
    }
}
