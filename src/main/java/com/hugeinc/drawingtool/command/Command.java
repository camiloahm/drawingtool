package com.hugeinc.drawingtool.command;

import com.hugeinc.drawingtool.app.DrawingTool;
import com.hugeinc.drawingtool.command.exception.InvalidCommandException;

public interface Command {

	public void execute(DrawingTool drawingTool) throws InvalidCommandException;

}
