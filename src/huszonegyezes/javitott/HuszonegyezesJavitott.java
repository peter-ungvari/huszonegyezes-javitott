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
public class HuszonegyezesJavitott {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Jatek jatek = new Jatek(null);
        Pakli pakli = jatek.getPakli();
        while(pakli.vanLap()) {
            System.out.println(pakli.lapotAd());
        }
        
        List<Jatekos> jatekosok = new ArrayList<Jatekos>();
        jatekosok.add(new Jatekos("Gizike"));
        jatekosok.add(new Jatekos("Jozsi"));
        jatekosok.add(new Oszto());
        
        for(Jatekos j : jatekosok) {
            System.out.println(j.getNev() + " " + j.getPontSzam());
        }
        
        Jatek jatek2 = new Jatek(jatekosok);
        
        
        //pakli.getKartyak().add(new Kartya(Szin.PIKK, Szam._2));
//        Set<Jatekos> jatekosok = new HashSet<Jatekos>();
//        jatekosok.add(new Jatekos("Gizike"));
//        jatekosok.add(new Jatekos("Jozsi"));
//        jatekosok.add(new Jatekos("Micike"));
//        jatekosok.add(new Oszto());
//        Jatek jatek = new Jatek(jatekosok);
//        jatek.start();
        
    }
}
