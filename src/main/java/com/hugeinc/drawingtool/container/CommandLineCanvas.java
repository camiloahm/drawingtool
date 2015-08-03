package com.hugeinc.drawingtool.container;

import com.hugeinc.drawingtool.core.draw.component.Drawable;

/**
 * Created by CamiloH on 01/08/2015.
 */
public class CommandLineCanvas extends Canvas {

	public CommandLineCanvas(int width, int height) {
		super(width, height);
	}

	@Override
	public void add(Drawable drawable) {
		drawables.add(drawable);
		drawable.draw(this);
	}


	@Override
	public void paintPoint(int x, int y, char color) {
		pixels[x][y] = color;
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
			pixels[i][0] = '-';
		}

		for (int i = 0; i < width; i++) {
			pixels[i][height - 1] = '-';
		}

		for (int i = 1; i < height - 1; i++) {
			pixels[0][i] = '|';
		}

		for (int i = 1; i < height - 1; i++) {
			pixels[width - 1][i] = '|';
		}
	}

	@Override
	public char colorAt(int x, int y) {
		return pixels[x][y];
	}

	@Override
	public void setColor(int x, int y,char color) {	
		pixels[x][y]=color;
	}

}
