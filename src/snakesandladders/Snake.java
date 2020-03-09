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
public class Snake extends NegativePower {

    @Override
    public void SetPowers(int currPos) {
        int ladderEnd,endPos;
        do{
            endPos = currPos - Config.SnakeSize;
            ladderEnd = (int)Math.random() * endPos;
        }while(!(ladderEnd < currPos));
        
       PowerMap.put(currPos,endPos);
    }

    @Override
    int GivePower(int currPos) {
         return PowerMap.get(currPos);

    }
    
}
