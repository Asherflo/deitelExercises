package Assignment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static Assignment.Element.*;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {
    private  TicTacToe ticTacToe;
    private Board board;
    @BeforeEach
    public void setUp(){

        ticTacToe = new TicTacToe();
        board = new Board();
    }
    @Test
    public void TicTacToeCanBeCreated(){

        assertNotNull(ticTacToe);
    }
    @Test
    public void TicTacToeIsEmptyByDefault() {
        ticTacToe.position(0,0);
        assertEquals(E,ticTacToe.getPostion(0,0));
    }
    @Test
    public void ticTacToePLayAtXTest(){
        ticTacToe.playAt(0,0);
        assertEquals(X,ticTacToe.getPostion(0,0));

    }@Test
    public void  ticTacPlayAtyTest(){
        ticTacToe.playAt(0,0);
        ticTacToe.playAt(0,1);
        assertEquals(Element.O,ticTacToe.getPostion(0,1));

    }@Test
    public void testNotToOverride(){
        ticTacToe.playAt(0,0);
        ticTacToe.playAt(0,0);
        assertEquals(X,ticTacToe.getPostion(0,0));
    }

//    @Test
//    public void isEmpty() {
//        assertTrue(queue.isEmpty());
//
//    }


//    @Test
//    public void playerCanBeCreated(){
//        Board board = new Board();
//        ticTacToe.player1Move();
//        assertTrue(board.isNotEmpty());
//        assertEquals(Element.X,board.toString());
//    }

}
