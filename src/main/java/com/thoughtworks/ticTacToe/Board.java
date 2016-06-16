package com.thoughtworks.ticTacToe;

import java.io.PrintStream;

public class Board {
    private PrintStream printStream;
    private String[][] layout = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

    public Board(PrintStream printStream) {
        this.printStream = printStream;

    }

    public void draw() {
        printStream.println(boardToString());
    }


    public void addMove(int move) {
        int rowIndexOfMove = (int) Math.ceil((move - 1)/ 3);
        int columnIndexOfMove = (move - 1) % 3;

        layout[rowIndexOfMove][columnIndexOfMove] = "X";

    }

    private String boardToString() {
        String layoutString = "";

        for (String[] subarray : layout) {
            layoutString += RowToString(subarray);
            layoutString += "\n-----\n";
        }
        String layoutStringWithoutFinalBottomDivider = layoutString.substring(0, layoutString.length() - 6);

        return layoutStringWithoutFinalBottomDivider;
    }

    private String RowToString(String[] subarray) {
        String subarrayString = "";
        for (String number : subarray) {
            subarrayString = subarrayString + number + "|";
        }
        String subarrayStringWithoutFinalVerticalDivider = subarrayString.substring(0, subarrayString.length()-1);

        return subarrayStringWithoutFinalVerticalDivider;
    }

}
