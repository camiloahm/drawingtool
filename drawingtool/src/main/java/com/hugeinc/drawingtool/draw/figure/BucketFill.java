package com.hugeinc.drawingtool.draw.figure;

import com.hugeinc.drawingtool.draw.canvas.DrawableContainer;

import java.util.List;

/**
 * Created by CamiloH on 01/08/2015.
 */
public class BucketFill implements Drawable {

    private int x, y;
    private String color;

    public BucketFill(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void draw(DrawableContainer drawableContainer) {

        List<Drawable> list=drawableContainer.containsPoint(x,y);

        if (list.isEmpty()) {
          drawableContainer.fill(color);
        }

    }

    public boolean containsPoints(int x, int y) {
        return false;
    }
}
