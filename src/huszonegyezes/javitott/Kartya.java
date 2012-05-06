/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package huszonegyezes.javitott;

/**
 *
 * @author kirkova
 */
public class Kartya {

    private Szin szin;
    private Szam szam;

    public Kartya(Szin szin, Szam szam) {
        this.szin = szin;
        this.szam = szam;
    }

    @Override
    public String toString() {
        //return getSzin() + " " + getSzam();
        //StringBuilder sb = new StringBuilder();
//        sb.append(getSzin());
//        sb.append(' ');
//        sb.append(getSzam());
//        String eredmeny = sb.toString();
        return new StringBuilder().append(getSzin()).append(' ').append(getSzam()).toString();
    }

    public Szin getSzin() {
        return szin;
    }

    public Szam getSzam() {
        return szam;
    }
}
