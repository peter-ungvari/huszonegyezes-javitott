/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package huszonegyezes.javitott;

/**
 *
 * @author kirkova
 */
public enum Szam {
    _2(2),
    _3(3),
    _4(4),
    _5(5),
    _6(6),
    _7(7),
    _8(8),
    _9(9),
    _10(10),
    BUBI("bubi"),
    DAMA("dáma"),
    KIRALY("király"),
    ASZ("ász", 11);
        
    private int ertek;
    private String nev;

    private Szam(int ertek) {
        this.ertek = ertek;
        this.nev = String.valueOf(ertek);
    }
    
    private Szam(String nev) {
        this.ertek = 10;
        this.nev = nev;
    }
    
    private Szam(String nev, int ertek) {
        this.ertek = ertek;
        this.nev = nev;
    }

    @Override
    public String toString() {
        return nev;
    }

    public int getErtek() {
        return ertek;
    }
    
}
