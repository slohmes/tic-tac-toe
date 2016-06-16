package com.thoughtworks.ticTacToe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class GameTest {

    PrintStream printStream;
    BufferedReader bufferedReader;
    Game game;
    Board board;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        board = mock(Board.class);

        game = new Game(printStream, bufferedReader, board);

    }

    @Test
    public void shouldPrintBoardWhenGameStarts() {
        game.start();

        verify(board, atLeastOnce()).draw();
    }
    
    @Test
    public void shouldGetFirstPlayersMoveWhenGameStarts() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");

        game.start();

        verify(printStream).println("First player, pick your move: ");
    }

    @Test
    public void shouldRedrawBoardWhenUserEntersMove() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");

        game.start();

        verify(board, times(2)).draw();

    }
}
