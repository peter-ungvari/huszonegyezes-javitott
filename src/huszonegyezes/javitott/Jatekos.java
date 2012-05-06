/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package huszonegyezes.javitott;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kirkova
 */
public class Jatekos implements Comparable<Jatekos> {

    @Override
    public int compareTo(Jatekos o) {
        return getNev().compareTo(o.getNev());
    }
    
    private int pontSzam;
    private String nev;
    protected Jatek jatek;
    private List<Kartya> lathatoKartyak;

    public Jatekos(String nev) {
        if(nev == null) {
            throw new IllegalArgumentException("A jatekos neve nem lehet null.");
        } else if(nev.trim().isEmpty()) {
            throw new IllegalArgumentException("A jatekos neve nem lehet ures.");
        }
        this.nev = nev.trim();
    }

    protected void huz() throws HuzasException {
        if(jatek == null || jatek.isJatekVege()) {
            throw new HuzasException("A jatekos nincs jatekban.");
        }
        if (pontSzam >= 21) {
            throw new HuzasException("A lapok erteke mar nagyobb, mint 21, ujabb lap nem huzhato.");
        }
        Kartya ujKartya = jatek.getPakli().lapotAd();
        pontSzamNo(ujKartya);
        lathatoKartyak.add(ujKartya);
    }

    protected void pontSzamNo(Kartya ujKartya) {
        if (Szam.ASZ.equals(ujKartya.getSzam()) && pontSzam + 11 > 21) {
            pontSzam++;
        } else {
            pontSzam += ujKartya.getSzam().getErtek();
        }
//        Integer i = 5;
//        Integer j = new Integer(5);
//        Integer k = null;
//        try {
//            Integer.parseInt("a");
//        } catch(NumberFormatException e) {
//            System.out.println("Ez nem szam");
//        }
    }

    public void jatekotKezd(Jatek jatek) {
        if(jatek == null) {
            throw new IllegalArgumentException("A jatek nem lehet null.");
        }
        this.jatek = jatek;
        lathatoKartyak = new ArrayList<Kartya>();
        pontSzam = 0;
    }

    public String getNev() {
        return nev;
    }

    @Override
    public String toString() {
        String kartyak;
        if(lathatoKartyak == null) {
            kartyak = "Nincs jatekban.";
        } else {
            kartyak = lathatoKartyak.toString();
        }
        return getNev() + ": " + kartyak;
    }

    public int getPontSzam() {
        return pontSzam;
    }

    /**
     * A lathato kartyak lista masolataval ter vissza, hogy ne lehessen modositani a visszateresi erteken keresztul a jatekos kartyait.
     * @return A lathato kartyak lista masolata.
     */
    public List<Kartya> getLathatoKartyak() {
        return new ArrayList(lathatoKartyak);
    }
    
}
