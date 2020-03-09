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
public class RowIncrease extends PositivePower {

  public void SetPowers(int currPos) {
        int ladderEnd,endPos;
        do{
            endPos = currPos + 30;
            ladderEnd = (int)Math.random() * endPos;
        }while(!(ladderEnd >currPos));
        
       PowerMap.put(currPos,endPos);
    }

    @Override
    int GivePower(int currPos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
