package com.hugeinc.drawingtool.app;

import java.io.IOException;
import java.util.List;

import com.hugeinc.drawingtool.command.Command;
import com.hugeinc.drawingtool.command.exception.InvalidCommandException;
import com.hugeinc.drawingtool.command.parser.CommandParser;
import com.hugeinc.drawingtool.command.parser.DefaultCommandParser;
import com.hugeinc.drawingtool.container.Canvas;
import com.hugeinc.drawingtool.util.FileUtil;

/**
 * Created by CamiloH on 01/08/2015.
 */
public class App {

	public static void main(String args[]) throws IOException {

		try {
			
			DrawingTool drawingTool = new DefaultDrawingTool();
			
			List<String> lines = FileUtil.readLinesUsingFileReader("./input.txt");
			CommandParser commandParser = new DefaultCommandParser();

			for (String line : lines) {
				try {
					Command command=commandParser.getCommand(line);
					command.execute(drawingTool);
				} catch (InvalidCommandException e) {
					e.printStackTrace();
				}
			}

	        drawingTool.paint();
			Canvas canvas=drawingTool.getCanvas();
			System.out.print(canvas.toString());
			FileUtil.writeOutput(canvas.toString(),"./output.txt");
			
		} catch (IOException e) {
            throw e;
		}

	}

}
