/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package huszonegyezes.javitott;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author kirkova
 */
public class Jatek {
    
    private Pakli pakli = new Pakli();
    private boolean jatekVege;
    private Set<Jatekos> nyertesek = new HashSet<Jatekos>();
    private List<Jatekos> jatekosok = new ArrayList<Jatekos>();

    public Jatek(List<Jatekos> jatekosok) {
        this.jatekosok = jatekosok;
    }

    public Pakli getPakli() {
        return pakli;
    }
    
    public void start() {
        for(Jatekos jatekos : jatekosok) {
            jatekos.jatekotKezd(this);
            jatekosok.add(jatekos);
            // 2 kartyat kell mindenki huzzon
        }
    }
    
    public void kor() {
        // be kell allitani, a jatekVeget, ha vege van
    }

    boolean isJatekVege() {
        return jatekVege;
    }
    
}
