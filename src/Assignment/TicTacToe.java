package Assignment;



import static Assignment.Element.*;

public class TicTacToe {
    Board board = new Board();
    private int move ;
    private  boolean isPlayer1Won;
    private boolean isPlayer2Won;


    public void position(int row, int column) {

    }

    public Element getPostion(int row, int column) {
        return board.getPostion(row, column);
    }

    public void playAt(int row, int column) {
        if(board.getPostion(row, column) == E) {
            board.setElement(row, column, changePlayer());
            move++;
        }
    }
    private Element changePlayer(){
        if(move % 2 == 0) return X;
        if(move % 2 == 1) return O;
        return E;
    }
    public String displayBoard(){
        return board.toString();
    }
    public boolean isFirstPlayer(){
        return move % 2 == 0;

    }
    public String currentPlayer(){
        if(isFirstPlayer()) return"player 1(X)";
        return"player 2 (O)";
    }
    public boolean isDraw(){
        return move == 9;
    }
    public void conditionforwin1(){
        if(board.getPostion(0,0) == X && board.getPostion(0,1) == X && board.getPostion(0,2)==X) isPlayer1Won =true;
        else if (board.getPostion(0,0)==O && board.getPostion(0,1) == O && board.getPostion(0,2)==O) isPlayer2Won =true;
    }
    public void conditionforwin2(){
        if(board.getPostion(1,0) == X && board.getPostion(1,1) == X && board.getPostion(1,2)==X) isPlayer1Won =true;
        else if (board.getPostion(1,0)==O && board.getPostion(1,1) == O && board.getPostion(1,2)==O) isPlayer2Won =true;
    }
    public void conditionforwin3(){
        if(board.getPostion(2,0) == X && board.getPostion(2,1) == X && board.getPostion(2,2)==X) isPlayer1Won =true;
        else if (board.getPostion(2,0)==O && board.getPostion(2,1) == O && board.getPostion(2,2)==O) isPlayer2Won =true;
    }
    public void conditionforwin4(){
        if(board.getPostion(0,0) == X && board.getPostion(1,0) == X && board.getPostion(2,0)==X) isPlayer1Won =true;
        else if (board.getPostion(0,0)==O && board.getPostion(1,0) == O && board.getPostion(1,0)==O) isPlayer2Won =true;
    }
    public void conditionforwin5(){
        if(board.getPostion(0,2) == X && board.getPostion(1,2) == X && board.getPostion(2,2)==X) isPlayer1Won =true;
        else if (board.getPostion(0,2)==O && board.getPostion(1,2) == O && board.getPostion(2,2)==O) isPlayer2Won =true;
    }
    public void conditionforwin6(){
        if(board.getPostion(0,0) == X && board.getPostion(1,1) == X && board.getPostion(2,2)==X) isPlayer1Won =true;
        else if (board.getPostion(0,0)==O && board.getPostion(1,1) == O && board.getPostion(2,2)==O) isPlayer2Won =true;
    }
    public void conditionforwin7(){
        if(board.getPostion(2,0) == X && board.getPostion(1,1) == X && board.getPostion(0,2)==X) isPlayer1Won =true;
        else if (board.getPostion(2,0)==O && board.getPostion(1,1) == O && board.getPostion(0,2)==O) isPlayer2Won =true;
    }
    public void conditionforwin8(){
        if(board.getPostion(0,1) == X && board.getPostion(1,1) == X && board.getPostion(2,1)==X) isPlayer1Won =true;
        else if (board.getPostion(0,1)==O && board.getPostion(1,1) == O && board.getPostion(2,1)==O) isPlayer2Won =true;
    }
    public void conditions(){
        conditionforwin1();
        conditionforwin2();
        conditionforwin3();
        conditionforwin4();
        conditionforwin5();
        conditionforwin6();
        conditionforwin7();
        conditionforwin8();
    }
    public boolean player1Won(){
        conditions();
        return isPlayer1Won;
    }
    public boolean player2Won(){
        conditions();
        return isPlayer2Won;
    }







}
