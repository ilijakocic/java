package de.gymnasium.lisemeitner;

/**
 * Created by ilija on 21.10.16.
 */

//Chessboard.java
//Author: Ilija Kocich
//Draws a chessboard with exactly 64 squares.

//Imports necessary GPanel library
import ch.aplu.util.*;

//Main Class
public class Chessboard {
    //GPanel border size:

    //(0, y_axis)
    //  ^
    //  |
    //  |
    //  |
    //(0,0)-------->(x_axis, 0)
    GPanel gPanel;
    int border = 64;
    int x_axis = border;
    int y_axis = border;

    //Square dimension:
    int side_a = border / 8;

    //Constructor Method
    Chessboard() {
        //Creates canvas called "gPanel" on which the squares will be drawn.
        gPanel = new GPanel(0, x_axis, 0, y_axis);
    }

    //Draws square with starting position on the x/y-axis as parameters.
    // 1. _
    // 2. _|
    // 3. =|
    // 4.|=|
    private void drawSquare(int x, int y) {
        gPanel.line(x, y, (x + side_a), y);
        gPanel.line((x + side_a), y, (x + side_a), (y + side_a));
        gPanel.line((x + side_a), (y + side_a), x, (y + side_a));
        gPanel.line(x, (y + side_a), x, y);
    }

    //Draws series of rectangles in the y- or the x-axis.
    public void draw() {
        for (int x = 0; x <= border; x = x + side_a) {
            for (int y = 0; y <= border; y = y + side_a) {
                drawSquare(x, y);
            }
        }
    }

    //Executive Method
    public static void main(String[] args) {

        //GPanel panel = new GPanel(0, x_axis, 0, y_axis);
        //Constructor method that draws the chessboard on the canvas.
        Chessboard chessboard  = new Chessboard();
        chessboard.draw();



    }
}
