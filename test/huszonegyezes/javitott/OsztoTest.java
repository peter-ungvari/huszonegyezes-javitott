/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package huszonegyezes.javitott;

import java.util.Arrays;
import junit.framework.Assert;
import org.junit.Test;

/**
 *
 * @author jupi
 */
public class OsztoTest {
    
    private Oszto oszto = new Oszto();
    
    @Test
    public void testGetPontszam() {
        System.out.println("Kezdetben 0 a pontszam.");
        Assert.assertEquals(0, oszto.getPontSzam());
    }
    
    @Test
    public void testHuzElsoLap() {
        System.out.println("Az elso lapot az oszto nem latja, ezert kihuzasa nem valtoztatja meg a pontszamot.");
        Jatek jatek = new Jatek(Arrays.asList((Jatekos)oszto));
        oszto.jatekotKezd(jatek);
        oszto.huz();
        Assert.assertEquals(0, oszto.getPontSzam());
    }
    
    @Test
    public void testJatekotKezd() {
        
    }
}
