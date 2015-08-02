package com.hugeinc.drawingtool.draw.canvas;

import com.hugeinc.drawingtool.draw.figure.Drawable;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by CamiloH on 01/08/2015.
 */
public class Canvas extends DrawableContainer {

    public Canvas(int width, int height) {
        super(width, height);
    }


    @Override
    public void add(Drawable drawable) {
        drawables.add(drawable);
        drawable.draw(this);
    }

    @Override
    public List<Drawable> containsPoint(int x, int y) {

        List<Drawable> drawables = new ArrayList<Drawable>();

        for (Drawable drawable : drawables) {
            if (drawable.containsPoints(x, y)) {
                drawables.add(drawable);
            }
        }

        return drawables;
    }

    @Override
    public void paintPoint(int x, int y, String color) {
        background[x][y] = color;
    }

    @Override
    public void fill(String color) {
        for(int y=1; y<height-1;y++)
        {
            for(int x=1;x<width-1;x++)
            {
                if(containsPoint(x,y).isEmpty())
                {
                    background[x][y] = color;
                }
            }
        }
    }

    @Override
    public void repaint() {
        paintCanvas();
        paintDraws();
    }



    private void paintDraws() {
        for (Drawable drawable : drawables) {
            drawable.draw(this);
        }
    }

    private void paintCanvas() {

        for (int i = 0; i < width; i++) {
            background[i][0] = "-";
        }

        for (int i = 0; i < width; i++) {
            background[i][height - 1] = "-";
        }

        for (int i = 1; i < height - 1; i++) {
            background[0][i] = "|";
        }

        for (int i = 1; i < height - 1; i++) {
            background[width - 1][i] = "|";
        }
    }


}
