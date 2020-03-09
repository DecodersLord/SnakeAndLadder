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
class PowerManager {

    PositivePower[] positivePower = {new Ladder(), new PlusMove(), new RowIncrease()};
    NegativePower[] negativePower = {new Snake(), new MinusCell()};
    
    

    public State DecidePower(int currPos) {
        int random;
        do {
            random = (int) (Math.random() * State.values().length - 1) + 1;

            if (State.values()[random] == State.LADDER && currPos< Config.InitCells - 30) {
                positivePower[0].SetPowers(currPos);
                break;
            } else if (State.values()[random] == State.PLUSCELL && currPos < Config.InitCells - 5) {
                positivePower[1].SetPowers(currPos);
                break;
            } //        else if(State.values()[random] == State.ROWINC)
            //            positivePower[2].SetPowers(currPos);
            else if (State.values()[random] == State.SNAKE && currPos > 31) {
                negativePower[0].SetPowers(currPos);
                break;
            } else if (State.values()[random] == State.MINUSCELL && currPos > 6) {
                negativePower[1].SetPowers(currPos);
                break;
            }

        } while (true);

        return State.values()[random];

    }

    int givePower(State powerUp,int currPos) {
        int newPos=0;
        if(powerUp == State.LADDER){
           newPos = positivePower[0].GivePower(currPos);
           return newPos;
        }
        else if(powerUp == State.PLUSCELL){
            newPos = positivePower[1].GivePower(currPos);
            return newPos;
        }
        else if(powerUp == State.ROWINC){
            newPos = positivePower[2].GivePower(currPos);
            return newPos;
        }
        else if(powerUp == State.SNAKE){
            newPos = negativePower[0].GivePower(currPos);
            return newPos;
        }
        else if(powerUp == State.MINUSCELL){
            newPos = negativePower[1].GivePower(currPos);
            return newPos;
        }
        return newPos;
    }
    
   

}
