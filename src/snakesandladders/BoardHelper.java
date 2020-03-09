/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakesandladders;

import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author Priyank Sevak
 */
class BoardHelper implements IPower{

    @Override
    public void SetPowers(int currPos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void ShowMap(){
        System.out.println(Collections.singletonList(PowerMap));
    }
    
}
