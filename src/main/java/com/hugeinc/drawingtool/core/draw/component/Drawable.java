package com.hugeinc.drawingtool.core.draw.component;

import com.hugeinc.drawingtool.container.Canvas;


/**
 * Created by CamiloH on 01/08/2015.
 */
public interface Drawable {

    void draw(Canvas drawableContainer);

    boolean containsPoints(int x, int y);

}
