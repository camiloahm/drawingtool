package com.hugeinc.drawingtool.command.builder;

import com.hugeinc.drawingtool.command.Command;
import com.hugeinc.drawingtool.command.CreateRectangleCommand;
import com.hugeinc.drawingtool.command.exception.InvalidCommandException;

public class CreateRectangleCommandBuilder extends CommandBuilder {

	private int x1, y1, x2, y2;

	public CreateRectangleCommandBuilder(String[] params)
			throws InvalidCommandException {
		super(params);
	}

	@Override
	public void validateParams() throws InvalidCommandException {
		try {
			x1 = Integer.parseInt(params[1]);
			y1 = Integer.parseInt(params[2]);
			x2 = Integer.parseInt(params[3]);
			y2 = Integer.parseInt(params[4]);
		} catch (Exception e) {
			throw new InvalidCommandException(
					"Invalid params in Create Rectangle Command "
							+ params.toString());
		}
	}

	@Override
	public Command getCommand() {
		return new CreateRectangleCommand(x1, y1, x2, y2);
	}
}
