package com.hugeinc.drawingtool.draw.figure;

import com.hugeinc.drawingtool.draw.canvas.DrawableContainer;

/**
 * Created by CamiloH on 01/08/2015.
 */
public class Rectangle implements Drawable {

    private Line lines[];
    private int xMinor, yMinor, xMajor, yMajor;

    public Rectangle(int x1, int y1, int x2, int y2) {

        lines = new Line[4];
        lines[0] = new Line(x1, y1, x2, y1);
        lines[1] = new Line(x2, y1, x2, y2);
        lines[2] = new Line(x2, y2, x1, y2);
        lines[3] = new Line(x1, y2, x1, y1);

        if (x1 > x2) {
            xMajor = x1;
            xMinor = x2;
        } else {
            xMajor = x2;
            xMinor = x1;
        }

        if (y1 > y2) {
            xMajor = y1;
            xMinor = y2;
        } else {
            xMajor = y2;
            xMinor = y1;
        }

    }


    public void draw(DrawableContainer drawableContainer) {
        for (Line line : lines) {
            line.draw(drawableContainer);
        }
    }


    public boolean containsPoints(int x, int y) {

        if (x >= xMinor && x <= xMajor && y >= yMinor && y <= yMajor) {
            return true;
        } else {
            return false;
        }
    }


}
