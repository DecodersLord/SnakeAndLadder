/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakesandladders;

/**
 *
 * @author Priyank Sevak
 */
public class MinusCell extends NegativePower {

    public void SetPowers(int currPos) {
        
       PowerMap.put(currPos,currPos-5);
    }

    @Override
    int GivePower(int currPos) {
      return PowerMap.get(currPos);

    }
    
}
