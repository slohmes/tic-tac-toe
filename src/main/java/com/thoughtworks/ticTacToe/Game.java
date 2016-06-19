package com.thoughtworks.ticTacToe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static java.lang.Integer.parseInt;

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
        move(true);
        move(false);
    }

    private void move(boolean isFirstPlayer) {
        if (isFirstPlayer) {
            printStream.println("\nFirst player, pick your move: ");
        } else {
            printStream.println("\nSecond player, pick your move: ");
        }
        int moveSelection = parseInt(readLine());

        if (isFirstPlayer) {
            board.addMove(moveSelection, "X");
        } else {
            board.addMove(moveSelection, "O");
        }
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
