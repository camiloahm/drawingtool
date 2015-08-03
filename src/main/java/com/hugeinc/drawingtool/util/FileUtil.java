package com.hugeinc.drawingtool.util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileUtil {

	public static List<String> readLinesUsingFileReader(String filePath) throws IOException
	{		
		List<String> lines = Files.readAllLines(Paths.get(filePath));			
        return lines;	    
 	}
	
	public static void writeOutput(String output,String filePath) throws IOException
	{
		 Files.write(Paths.get(filePath), output.getBytes());
	}
	
}
