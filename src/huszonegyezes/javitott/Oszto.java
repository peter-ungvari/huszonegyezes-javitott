/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package huszonegyezes.javitott;

/**
 *
 * @author kirkova
 */
public class Oszto extends Jatekos {

    private Kartya elsoLap;
    boolean elsoHuzas;

    public Oszto() {
        super("Oszto");
    }
    
    @Override
    protected void huz() throws HuzasException {
        if(elsoHuzas) {
            elsoLap = jatek.getPakli().lapotAd();
            elsoHuzas = false;
        } else {
            super.huz();
        }
    }

    @Override
    public void jatekotKezd(Jatek jatek) {
        super.jatekotKezd(jatek);
        elsoHuzas = true;
    }

    @Override
    public int getPontSzam() {
        if(jatek != null && jatek.isJatekVege()) {
            pontSzamNo(elsoLap);
        }
        return super.getPontSzam();
    }
    
}
