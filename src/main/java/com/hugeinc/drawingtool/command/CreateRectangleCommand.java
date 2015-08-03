package com.hugeinc.drawingtool.command;

import com.hugeinc.drawingtool.app.DrawingTool;
import com.hugeinc.drawingtool.app.exception.CanvasNotFoundException;
import com.hugeinc.drawingtool.command.exception.InvalidCommandException;

public class CreateRectangleCommand implements Command {

	private int x1, y1, x2, y2;

	public CreateRectangleCommand(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public void execute(DrawingTool drawingTool) throws InvalidCommandException {
		try {
			drawingTool.createRectangle(x1, y1, x2, y2);
		} catch (CanvasNotFoundException e) {
			throw new InvalidCommandException(e.getMessage());
		}
	}

}
