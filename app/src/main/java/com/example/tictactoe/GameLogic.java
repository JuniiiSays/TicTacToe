package com.example.tictactoe;

import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;

class GameLogic {

   private int [][] gameBoard;
   private int player = 1;

   String[] playerNames = {"Player 1" , "Player 2"};

   private Button playAgainBTN;
   private Button homeBTN;
   private TextView playerTurn;

   GameLogic(){
      gameBoard = new int[3][3];
      for (int r = 0; r < 3; r++){
         for (int c = 0; c < 3; c++){
            gameBoard[r][c] = 0;
         }
      }
   }

   public boolean updateGameBoard(int row, int col){
      if (gameBoard[row -1][col - 1] == 0){
         gameBoard[row -1][col - 1] = player;

         if (player == 1){
            playerTurn.setText((playerNames[1] + "'s Turn"));
         } else {
            playerTurn.setText((playerNames[0] + "'s Turn"));
         }

         return true;

      } else {
         return false;
      }
   }

   public void resetGame(){
      for (int r = 0; r < 3; r++){
         for (int c = 0; c < 3; c++){
            gameBoard[r][c] = 0;
         }
      }
   }

   public int[][] getGameBoard() {
      return gameBoard;
   }

   public void setPlayAgainBTN(Button playAgainBTN) {
      this.playAgainBTN = playAgainBTN;
   }

   public void setHomeBTN(Button homeBTN) {
      this.homeBTN = homeBTN;
   }

   public void setPlayerTurn(TextView playerTurn) {
      this.playerTurn = playerTurn;
   }

   public void setPlayerNames(String[] playerNames) {
      this.playerNames = playerNames;
   }

   public void setPlayer(int player) {
      this.player = player;
   }

   public int getPlayer() {
      return player;
   }
}
