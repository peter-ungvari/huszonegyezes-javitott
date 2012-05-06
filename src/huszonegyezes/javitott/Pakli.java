/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package huszonegyezes.javitott;

import java.util.*;

/**
 *
 * @author kirkova
 */
public class Pakli {

    private Queue<Kartya> kartyak;

    public Pakli() {
        List<Kartya> szuzPakli = new ArrayList<Kartya>(Szam.values().length * Szin.values().length);
        for (Szin szin : Szin.values()) {
            for (Szam szam : Szam.values()) {
                szuzPakli.add(new Kartya(szin, szam));
            }
        }
        Collections.shuffle(szuzPakli);
        kartyak = new LinkedList<Kartya>(szuzPakli);
    }

    public Kartya lapotAd() {
        try {
            return kartyak.remove();
        } catch(NoSuchElementException e) {
            throw new NincsTobbLapException(e);
        }
    }
    
    public boolean vanLap() {
        return !kartyak.isEmpty();
    }
}
