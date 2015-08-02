package com.hugeinc.drawingtool.draw.figure;

import com.hugeinc.drawingtool.draw.canvas.DrawableContainer;

/**
 * Created by CamiloH on 01/08/2015.
 */
public class Line implements Drawable {

    private int x1, x2, y1, y2;
    private int m, b;
    private boolean isInclineIndetermined;

    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;

        if ((x2 - x1) != 0) {
            m = (y2 - y1) / (x2 - x1);
            b = y1 - (m * x1);
            isInclineIndetermined = false;
        } else {
            isInclineIndetermined = true;
        }

    }

    public void draw(DrawableContainer drawableContainer) {

        int major, minor;

        if (!isInclineIndetermined) {
            if (x1 > x2) {
                major = x1;
                minor = x2;
            } else {
                major = x2;
                minor = x1;
            }

            for (; minor <= major; minor++) {
                int y = m * minor + b;
                drawableContainer.paintPoint(minor, y, "X");
            }
        } else {

            if (y1 > y2) {
                major = y1;
                minor = y2;
            } else {
                major = y2;
                minor = y1;
            }

            for (; minor <= major; minor++) {
                drawableContainer.paintPoint(x1, minor, "X");
            }
        }
    }


    public boolean containsPoints(int x, int y) {
        if (isInclineIndetermined) {
            if(x==x1)
            {
                return true;
            }
        }

        if (((m * x) + b) == y) {
            return true;
        } else {
            return false;
        }

    }


}
