package com.hugeinc.drawingtool.command.builder;

import com.hugeinc.drawingtool.command.Command;
import com.hugeinc.drawingtool.command.exception.InvalidCommandException;

public abstract class CommandBuilder {

	protected String params[];
	protected Command command;

	public CommandBuilder(String[] params) throws InvalidCommandException
	{
		this.params=params;
		validateParams();
	}
	
	public abstract void validateParams() throws InvalidCommandException; 
	
	public abstract Command getCommand();

}
