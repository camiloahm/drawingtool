package com.hugeinc.drawingtool.container;


import java.util.ArrayList;
import java.util.List;

import com.hugeinc.drawingtool.core.draw.component.Drawable;

/**
 * Created by CamiloH on 01/08/2015.
 */
public abstract class Canvas {

    protected List<Drawable> drawables;
    protected char[][] pixels;
    protected int width, height;

    public Canvas(int width, int height) {
        this.width = width+2;
        this.height = height+2;
        pixels = new char[this.width][this.height];
        drawables = new ArrayList<Drawable>();
    }

    public abstract void add(Drawable drawable);

    public abstract void paintPoint(int x, int y, char color);

    public abstract void repaint();

    public abstract char colorAt(int x,int y);
    
    public abstract void setColor(int x, int y,char color);
     
    
    @Override
    public String toString() {

        String content = "";

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if (pixels[j][i] == '\u0000') {
                    content += " ";
                } else {
                    content += pixels[j][i];
                }
            }
            content += "\n";
        }

        return content;
    }

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
 
}
