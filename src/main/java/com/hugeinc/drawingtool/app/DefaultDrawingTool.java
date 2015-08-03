package com.hugeinc.drawingtool.app;

import com.hugeinc.drawingtool.app.exception.CanvasNotFoundException;
import com.hugeinc.drawingtool.container.Canvas;
import com.hugeinc.drawingtool.container.CommandLineCanvas;
import com.hugeinc.drawingtool.core.draw.component.BucketFill;
import com.hugeinc.drawingtool.core.draw.component.Line;
import com.hugeinc.drawingtool.core.draw.component.Rectangle;

/**
 * Created by CamiloH on 01/08/2015.
 */
public class DefaultDrawingTool implements DrawingTool {

	private Canvas canvas;

	public DefaultDrawingTool() {
	}

	public void createCanvas(int width, int height) {
		canvas = new CommandLineCanvas(width, height);
	}

	public void createLine(int x1, int y1, int x2, int y2)
			throws CanvasNotFoundException {
		validateCanvas();
		canvas.add(new Line(x1, y1, x2, y2));
	}

	public void createRectangle(int x1, int y1, int x2, int y2)
			throws CanvasNotFoundException {
		validateCanvas();
		canvas.add(new Rectangle(x1, y1, x2, y2));
	}

	public void executeBucketFill(int x, int y, char color)
			throws CanvasNotFoundException {
		validateCanvas();
		canvas.add(new BucketFill(x, y, color));
	}

	private void validateCanvas() throws CanvasNotFoundException {
		if (canvas == null) {
			throw new CanvasNotFoundException(
					"you can only draw if a canvas has been created");
		}
	}

	public void paint() {
		canvas.repaint();
	}

	public Canvas getCanvas() {
		return canvas;
	}

}
