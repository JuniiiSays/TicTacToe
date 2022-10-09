package com.example.tictactoe;

class GameLogic {

   private int [][] gameBoard;

   GameLogic(){
      gameBoard = new int[3][3];
      for (int r = 0; r < 3; r++){
         for (int c = 0; c < 3; c++){
            gameBoard[r][c] = 0;
         }
      }
   }

   public int[][] getGameBoard() {
      return gameBoard;
   }
}
