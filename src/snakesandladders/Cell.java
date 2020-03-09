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
class Cell {
    int position;
    State Power;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public State getPower() {
        return Power;
    }
    
   
    public void setPower(State Power) {
        this.Power = Power;
    }
    
    
}
