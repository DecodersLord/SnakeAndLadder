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
class Game {
    Board gameBoard;
    Scanner sc = new Scanner(System.in);
    Player[] player;
    Dice dice;
    int numOfPlayers;
    String winner="";
    boolean winFlag = false;
    PowerManager powerManager;
    
    void StartGame() {
        gameBoard = new Board();
        powerManager = new PowerManager();
        gameBoard.ShowBoard();
        
        InitializePlayer();
        dice = new Dice();
        
        PlayGame();

    }

    private void InitializePlayer() {
        System.out.println("Enter how many players are playing");
        numOfPlayers = sc.nextInt();
        player = new Player[numOfPlayers];
        sc.nextLine();
        
        for(int i=0;i<numOfPlayers;i++){
            player[i] = new Player();
            System.out.println("Enter your name");
            player[i].setName(sc.nextLine());
        }
    }

    private void PlayGame() {
        do {
            for (int i = 0; i < numOfPlayers; i++) {
                do {
                    System.out.println("Press R to roll the dice");
                    if (sc.next().equalsIgnoreCase("R")) {
                        break;
                    }
                } while (true);
                int diceMoves = dice.RollDice();
                System.out.println(player[i].getName() + " rolled: " + diceMoves);
                player[i].setPos(player[i].getPos() + diceMoves);
                
                State powerUp = CheckPower(player[i].getPos());
                if(powerUp != State.$){
                    System.out.println(player[i].getName() + " got PowerUp: " + powerUp); 
                   int newPos = powerManager.givePower(powerUp,player[i].getPos());
                    player[i].setPos(newPos);
                }
                System.out.println(player[i].getName() + " is at: " + player[i].getPos());
                if (CheckWinner(player[i])) {
                    winner = player[i].getName();
                    DeclareWinner(winner);
                    winFlag = true;
                    break;
                }
            }
        } while (!winFlag);

    }

    private boolean CheckWinner(Player player) {
        
            if(player.getPos() >= Config.InitCells-1 ){
                return true;
            }
        
        return false;
    }

    private State CheckPower(int pos) {
       for(int i=0;i<Config.InitRows;i++){
          for(int j=0;j<Config.InitColls;j++){
                 if(gameBoard.getGameBoard()[i][j].getPosition() == pos){
                     if(gameBoard.getGameBoard()[i][j].getPower() != State.$){
                         return gameBoard.getGameBoard()[i][j].getPower();
                     }
                 }
          }
            
        }
       return State.$;
    }

    public void DeclareWinner(String winner) {
        System.out.println("Congratulations: " + winner);
    }
    
}
