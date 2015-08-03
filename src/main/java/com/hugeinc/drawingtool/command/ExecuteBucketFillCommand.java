package com.hugeinc.drawingtool.command;

import com.hugeinc.drawingtool.app.DrawingTool;
import com.hugeinc.drawingtool.app.exception.CanvasNotFoundException;
import com.hugeinc.drawingtool.command.exception.InvalidCommandException;

public class ExecuteBucketFillCommand implements Command {

	private int x, y;
	private char color;

	public ExecuteBucketFillCommand(int x, int y, char color) {
		this.x = x;
		this.y = y;
		this.color = color;
	}

	public void execute(DrawingTool drawingTool) throws InvalidCommandException {
		try {
			drawingTool.executeBucketFill(x, y, color);
		} catch (CanvasNotFoundException e) {
			throw new InvalidCommandException(e.getMessage());
		}
	}

}
