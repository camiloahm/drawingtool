package com.hugeinc.drawingtool.core.draw.component;

import com.hugeinc.drawingtool.container.Canvas;

/**
 * Created by CamiloH on 01/08/2015.
 */
public class BucketFill implements Drawable {

	private int x, y;
	private char color;

	public BucketFill(int x, int y, char color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public void draw(Canvas canvas) {
		fill(canvas, x, y, new boolean[canvas.getWidth()][canvas.getHeight()],
				color, canvas.colorAt(x, y));
	}

	private void fill(Canvas canvas, int x, int y, boolean[][] mark,
			char newColor, char oldColor) {

		if (x < 1)
			return;
		if (y < 1)
			return;
		if (x > canvas.getWidth() - 1)
			return;
		if (y > canvas.getHeight() - 1)
			return;

		if (mark[x][y])
			return;

		if (canvas.colorAt(x, y) != oldColor) {
			return;
		}

		canvas.setColor(x, y, newColor);
		// Save the point that was evaluated to avoid repeat it
		mark[x][y] = true;

		if (x > 1)
			fill(canvas, x - 1, y, mark, newColor, oldColor);

		if (y > 1)
			fill(canvas, x, y - 1, mark, newColor, oldColor);

		if (x < canvas.getWidth() - 2)
			fill(canvas, x + 1, y, mark, newColor, oldColor);

		if (y < canvas.getHeight() - 2)
			fill(canvas, x, y + 1, mark, newColor, oldColor);
	}

	public boolean containsPoints(int x, int y) {
		return false;
	}
}
