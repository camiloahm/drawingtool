package com.hugeinc.drawingtool.draw.figure;

import com.hugeinc.drawingtool.draw.canvas.DrawableContainer;

/**
 * Created by CamiloH on 01/08/2015.
 */
public interface Drawable {

    void draw(DrawableContainer drawableContainer);

    boolean containsPoints(int x, int y);

}
