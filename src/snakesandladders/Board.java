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
class Board {
    Cell[][] gameBoard;
    BoardHelper boardHelper = new BoardHelper();
     int pos;
    
    public Cell[][] getGameBoard() {
        return gameBoard;
    }

    public void setGameBoard(Cell[][] gameBoard) {
        this.gameBoard = gameBoard;
    }
    PowerManager powerManager = new PowerManager() ;
    State power;
    
    Board(){
        gameBoard = new Cell[Config.InitRows][Config.InitColls];
         pos =0;
        InitialiseBoard();
    }

    public void InitialiseBoard() {
       int curr = Config.InitCells;
       
       for(int i=0;i<Config.InitRows;i++){
           for(int j=0;j<Config.InitColls;j++){
               gameBoard[i][j] = new Cell();
               if(i % 2 == 0){
                   pos = --curr;
                   gameBoard[i][j].setPosition(pos);
                   
               }    
               else{
                   pos = curr++;
                   gameBoard[i][j].setPosition(pos);
               }
                   gameBoard[i][j].setPower(power.$); 
                
                
                int random = (int)(Math.random()*100);
                if(random < Config.PowerPercentage){
                    power = powerManager.DecidePower(pos);
                    gameBoard[i][j].setPower(power);
                } 
                                
                
           }
           curr -= Config.InitColls;
           
           
       }
       boardHelper.ShowMap();
    }
    
    public void ShowBoard() {
       
        for(int i=0;i<Config.InitRows;i++){
          for(int j=0;j<Config.InitColls;j++){
                  System.out.print(gameBoard[i][j].getPosition() + ""  + gameBoard[i][j].getPower()+ "\t");
          }
            System.out.println();
        }
    }
    
    
    
    
}
