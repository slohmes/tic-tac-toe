package com.thoughtworks.ticTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Game {

    private final PrintStream printStream;
    private BufferedReader bufferedReader;
    private Board board;

    public Game(PrintStream printStream, BufferedReader bufferedReader, Board board) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.board = board;
    }

    public void start() {
        board.draw();
        askForFirstPlayersMove();
    }

    private void askForFirstPlayersMove() {
        printStream.println("First player, pick your move: ");
        String move = readLine();
        board.draw();
    }
    private String readLine() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
