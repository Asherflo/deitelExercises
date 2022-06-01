package Assignment;

import static Assignment.Element.E;

public class Board {
//    public static void main(String[] args) {
//        Board board = new Board();
//        System.out.println(board.toString());
//    }


    Element[][] board = new Element[3][3];

    public Board() {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board[row].length; column++) {
                board[row][column] = E;
            }

        }
    }


    public void setElement(int row, int column, Element element) {
        board[row][column] = element;

    }
    @Override
    public String toString(){
        return board[0][0] + " | " + board[0][1] + " | " + board[0][2] + "\n" +
                "--+---+---"+"\n"+
             board[1][0] + " | " + board[1][1] + " | " + board[1][2] + "\n" +
                "--+---+---"+"\n" +
             board[2][0] + " | " + board[2][1] + " | " + board[2][2] ;
   }

    public Element getPostion(int row, int column) {
        return board[row][column];
    }
}
