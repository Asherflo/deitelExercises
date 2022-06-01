package Assignment;

import java.util.Scanner;

public class Console {
    Scanner scanner = new Scanner(System.in);
    TicTacToe ticTacToe = new TicTacToe();
 public void play(){
     System.out.println(ticTacToe.displayBoard());
     Scanner input = new Scanner(System.in);
      int  userResponse = promptsUser();
      switch (userResponse){
          case 1:ticTacToe.playAt(0,0);
          if(winChances()) break;
          if(draw()) break;
          play();

          case 2 :ticTacToe.playAt(0,1);
          if(winChances()) break;
          if(draw()) break;
          play();

          case 3:ticTacToe.playAt(0,2);
          if(winChances()) break;
          if(draw()) break;
          play();
          case 4:ticTacToe.playAt(1,0);
          if(winChances()) break;
          if(draw()) break;
          play();
          case 5 :ticTacToe.playAt(1,1);
          if(winChances()) break;
          if(draw()) break;
          play();
          case 6 :ticTacToe.playAt(1,2);
          if(winChances()) break;
          if(draw()) break;
          play();
          case 7 :ticTacToe.playAt(2,0);
          if(winChances()) break;
          if(draw()) break;
          play();
          case 8 :ticTacToe.playAt(2,1);
          if(winChances()) break;
          if(draw()) break;
          play();
          case 9 :ticTacToe.playAt(2,2);
          if(winChances()) break;
          if(draw()) break;
          play();
          default:
      }



 }
 private int input(String input){
     print(input);
     return scanner.nextInt();

 }
 private void print(String input){
     System.out.println(input);

 }
 private int promptsUser(){
     print("""
             Player 1 play first
             enter number between 1 to 9;
     
             """);
     String display = ticTacToe.displayBoard();
     return input(ticTacToe.currentPlayer());
 }
 private boolean draw(){
     if( ticTacToe.isDraw()){
         print("Oops!The game is a draw");
         return true;
     }
     return false;

 }
 private boolean winChances(){
     if(ticTacToe.player1Won()){
         print("player 1 has won");
     print(ticTacToe.displayBoard());
     return true;
     }else if(ticTacToe.player2Won()){
         print("player 2 has won");
         print(ticTacToe.displayBoard());
         return true;
     }
     return false;

 }

}


