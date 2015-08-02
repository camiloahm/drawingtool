package com.hugeinc.drawingtool.draw.canvas;

import com.hugeinc.drawingtool.draw.figure.Drawable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CamiloH on 01/08/2015.
 */
public abstract class DrawableContainer {

    protected List<Drawable> drawables;
    protected String[][] background;
    protected int width, height;

    public DrawableContainer(int width, int height) {
        this.width = width+2;
        this.height = height+2;
        background = new String[this.width][this.height];
        drawables = new ArrayList<Drawable>();
    }

    public abstract void add(Drawable drawable);

    public abstract List<Drawable> containsPoint(int x, int y);

    public abstract void paintPoint(int x, int y, String color);

    public abstract void fill(String color);

    public abstract void repaint();

    @Override
    public String toString() {

        String content = "";

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (background[j][i] == null) {
                    content += " ";
                } else {
                    content += background[j][i];
                }
            }
            content += "\n";
        }

        return content;
    }



}
