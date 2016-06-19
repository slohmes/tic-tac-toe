package com.thoughtworks.ticTacToe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {


    public static void main(String[] args) {

        PrintStream printStream = new PrintStream(System.out);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        Board board = new Board(printStream);

        Game game = new Game(printStream, bufferedReader, board);

        game.start();

    }


}



