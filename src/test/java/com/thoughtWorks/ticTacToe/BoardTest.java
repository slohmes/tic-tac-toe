package com.thoughtworks.ticTacToe;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BoardTest {

    PrintStream printStream;
    Board board;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        board = new Board(printStream);

    }


    @Test
    public void shouldDisplayMoveOnBoardWhenUserEntersMove() throws IOException {

        board.addMove(1);
        board.draw();

        verify(printStream).println(
                "X|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9\n");

    }


}
