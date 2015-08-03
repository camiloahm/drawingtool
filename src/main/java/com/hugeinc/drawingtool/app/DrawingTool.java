package com.hugeinc.drawingtool.app;

import com.hugeinc.drawingtool.app.exception.CanvasNotFoundException;
import com.hugeinc.drawingtool.container.Canvas;

/**
 * Created by CamiloH on 01/08/2015.
 */
 public interface DrawingTool {

	 void createCanvas(int width, int height) ;

	 void createLine(int x1,int y1,int x2,int y2) throws CanvasNotFoundException;		
	
	 void createRectangle(int x1,int y1, int x2, int y2) throws CanvasNotFoundException;
	
	 void executeBucketFill(int x, int y, char color) throws CanvasNotFoundException;
	 
	 void paint();
	 
	 Canvas getCanvas();

}
