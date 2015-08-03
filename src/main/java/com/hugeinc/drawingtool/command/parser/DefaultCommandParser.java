package com.hugeinc.drawingtool.command.parser;

import com.hugeinc.drawingtool.command.Command;
import com.hugeinc.drawingtool.command.builder.CommandBuilder;
import com.hugeinc.drawingtool.command.builder.CreateCanvasCommandBuilder;
import com.hugeinc.drawingtool.command.builder.CreateLineCommandBuilder;
import com.hugeinc.drawingtool.command.builder.CreateRectangleCommandBuilder;
import com.hugeinc.drawingtool.command.builder.ExecuteBucketFillCommandBuilder;
import com.hugeinc.drawingtool.command.exception.InvalidCommandException;

public class DefaultCommandParser implements CommandParser {

	
	public Command getCommand(String commandString)
			throws InvalidCommandException {

		String[] tokens = commandString.split(" ");
		String commandName = tokens[0];
		CommandOption commandOption =CommandOption.valueOf(commandName);
	
		switch (commandOption) {

		case C:
	        CommandBuilder createCanvasCommandBuilder=new CreateCanvasCommandBuilder(tokens);
			return createCanvasCommandBuilder.getCommand();
			
		case L:
			CommandBuilder createLineCommandBuilder=new CreateLineCommandBuilder(tokens);
			return createLineCommandBuilder.getCommand();
			
		case R:
			CommandBuilder createRectangleCommandBuilder=new CreateRectangleCommandBuilder(tokens);
			return createRectangleCommandBuilder.getCommand();
			
		case B:
			CommandBuilder executeBucketFillCommandBuilder=new ExecuteBucketFillCommandBuilder(tokens);
			return executeBucketFillCommandBuilder.getCommand();
			
		default:
			throw new InvalidCommandException("The commmand does not exists");
		}

	}

}
