package com.hugeinc.drawingtool.core.draw.component;

import com.hugeinc.drawingtool.container.Canvas;

/**
 * Created by CamiloH on 01/08/2015.
 */
public class Line implements Drawable {

	private int x1, x2, y1, y2;
	private int m, b;
	private boolean undeterminedSlope;

	public Line(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;

		solveLineEquation(x1, y1, x2, y2);
	}

	private void solveLineEquation(int x1, int y1, int x2, int y2) {
		// Line equation: y= mx+b
		if ((x2 - x1) != 0) {
			m = (y2 - y1) / (x2 - x1);
			b = y1 - (m * x1);
			undeterminedSlope = false;
		} else {
			undeterminedSlope = true;
		}
	}

	public boolean containsPoints(int x, int y) {
		if (undeterminedSlope) {
			if (x == x1) {
				return true;
			} else {
				return false;
			}
		} else {
			if (((m * x) + b) == y) {
				return true;
			} else {
				return false;
			}
		}
	}

	public void draw(Canvas drawableContainer) {
		if (!undeterminedSlope) {
			drawLine(drawableContainer);
		} else {
			drawVerticalLine(drawableContainer);
		}
	}

	private void drawVerticalLine(Canvas drawableContainer) {
		int biggest;
		int smallest;
		if (y1 > y2) {
			biggest = y1;
			smallest = y2;
		} else {
			biggest = y2;
			smallest = y1;
		}
        
		//X could be x1 or x2
		for (; smallest <= biggest; smallest++) {
			drawableContainer.paintPoint(x1, smallest, 'X');
		}
	}

	private void drawLine(Canvas drawableContainer) {
		int biggest;
		int smallest;
		if (x1 > x2) {
			biggest = x1;
			smallest = x2;
		} else {
			biggest = x2;
			smallest = x1;
		}

		for (; smallest <= biggest; smallest++) {
			int y = m * smallest + b;
			drawableContainer.paintPoint(smallest, y, 'X');
		}
	}

}
