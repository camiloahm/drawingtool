package com.hugeinc.drawingtool.core.draw.component;

import com.hugeinc.drawingtool.container.Canvas;

/**
 * Created by CamiloH on 02/08/2015.
 */
public class Rectangle implements Drawable {

    private Line lines[];
    private int xSmallest, ySmallest, xBiggest, yBiggest;

    public Rectangle(int x1, int y1, int x2, int y2) {
        initRectangle(x1, y1, x2, y2);
    }


	private void initRectangle(int x1, int y1, int x2, int y2) {
		lines = new Line[4];
        lines[0] = new Line(x1, y1, x2, y1);
        lines[1] = new Line(x2, y1, x2, y2);
        lines[2] = new Line(x2, y2, x1, y2);
        lines[3] = new Line(x1, y2, x1, y1);

        if (x1 > x2) {
            xBiggest = x1;
            xSmallest = x2;
        } else {
            xBiggest = x2;
            xSmallest = x1;
        }

        if (y1 > y2) {
            xBiggest = y1;
            xSmallest = y2;
        } else {
            xBiggest = y2;
            xSmallest = y1;
        }
	}


    public void draw(Canvas drawableContainer) {
        for (Line line : lines) {
            line.draw(drawableContainer);
        }
    }


    public boolean containsPoints(int x, int y) {
        if (x >= xSmallest && x <= xBiggest && y >= ySmallest && y <= yBiggest) {
            return true;
        } else {
            return false;
        }
    }


}
