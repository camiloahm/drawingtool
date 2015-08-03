package com.hugeinc.drawingtool.command;

import com.hugeinc.drawingtool.app.DrawingTool;


public class CreateCanvasCommand implements Command{

	private int width,height;
	
	public CreateCanvasCommand(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public void execute(DrawingTool drawingTool) {
		drawingTool.createCanvas(width,height); 			
	}

}
