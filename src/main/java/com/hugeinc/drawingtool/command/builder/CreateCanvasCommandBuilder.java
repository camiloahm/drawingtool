package com.hugeinc.drawingtool.command.builder;

import com.hugeinc.drawingtool.command.Command;
import com.hugeinc.drawingtool.command.CreateCanvasCommand;
import com.hugeinc.drawingtool.command.exception.InvalidCommandException;

public class CreateCanvasCommandBuilder extends CommandBuilder {

	private int width;
	private int height;

	public CreateCanvasCommandBuilder(String[] params) throws InvalidCommandException {
		super(params);
	}

	@Override
	public void validateParams() throws InvalidCommandException {
		try {
			width = Integer.parseInt(params[1]);
			height = Integer.parseInt(params[2]);
		} catch (Exception e) {
            throw new InvalidCommandException("Invalid params in Create Canvas Command "+params.toString());
		}
	}

	@Override
	public Command getCommand() {
		return new CreateCanvasCommand(width, height);
	}
}
