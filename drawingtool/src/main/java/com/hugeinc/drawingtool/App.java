package com.hugeinc.drawingtool;

import com.hugeinc.drawingtool.draw.canvas.Canvas;
import com.hugeinc.drawingtool.draw.canvas.DrawableContainer;
import com.hugeinc.drawingtool.draw.figure.Line;
import com.hugeinc.drawingtool.draw.figure.Rectangle;

/**
 * Created by CamiloH on 01/08/2015.
 */
public class App {

    public static void main(String args[])
    {

        DrawableContainer drawableContainer=new Canvas(20,4);
        drawableContainer.add(new Line(1,2,6,2));
        drawableContainer.add(new Line(6,3,6,4));
        drawableContainer.add(new Rectangle(16, 1, 20, 3));


        drawableContainer.repaint();
        System.out.print(drawableContainer.toString());

    }

}
