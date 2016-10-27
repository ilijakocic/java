package de.gymnasium.lisemeitner;

/**
 * Created by ilija on 21.10.16.
 */

import ch.aplu.util.*;

public class Chessboard {
    private GPanel canvas;
    private int canvasSize = 360;
    private int squareSize;

    private int getSquareSize() {
        return canvasSize / 8;
    }

    private Chessboard(int inputDimension, int inputSizePercentage) {
        int sizeMultiplier = inputSizePercentage / 100;
        canvasSize = inputDimension;
        canvas = new GPanel(0, canvasSize, 0, canvasSize);
        squareSize = getSquareSize() * sizeMultiplier;
    }

    private void drawSquare(int x, int y) {
        canvas.line(x, y, (x + squareSize), y);
        canvas.line((x + squareSize), y, (x + squareSize), (y + squareSize));
        canvas.line((x + squareSize), (y + squareSize), x, (y + squareSize));
        canvas.line(x, (y + squareSize), x, y);
    }

    private void drawGrid() {
        for (int x = 0; x <= canvasSize - squareSize; x = x + squareSize) {
            for (int y = 0; y <= canvasSize - squareSize; y = y + squareSize) {
                drawSquare(x, y);
            }
        }
    }

    public static void main(String[] args) {
        Chessboard aChessboard  = new Chessboard(360, 100);
        aChessboard.drawGrid();
    }
}