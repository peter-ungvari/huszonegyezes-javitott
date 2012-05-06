/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package huszonegyezes.javitott;

/**
 *
 * @author kirkova
 */
public enum Szin {
    
    PIKK("pikk"), 
    TREFF("treff"), 
    KOR("kör"), 
    KARO("káró");

    private String nev;

    private Szin(String nev) {
        this.nev = nev;
    }    
    
    @Override
    public String toString() {
        return nev;
    }
    
}
