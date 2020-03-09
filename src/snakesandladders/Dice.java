/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snakesandladders;

import java.util.Scanner;

/**
 *
 * @author Priyank Sevak
 */
class Dice {
    Scanner sc = new Scanner(System.in);
    int RollDice(){
        return (int)((Math.random()*6)+1);
    }
}
