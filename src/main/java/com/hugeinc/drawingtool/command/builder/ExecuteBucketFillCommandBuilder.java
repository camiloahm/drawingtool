package com.hugeinc.drawingtool.command.builder;

import com.hugeinc.drawingtool.command.Command;
import com.hugeinc.drawingtool.command.ExecuteBucketFillCommand;
import com.hugeinc.drawingtool.command.exception.InvalidCommandException;

public class ExecuteBucketFillCommandBuilder extends CommandBuilder {

	private int x;
	private int y;
	private char color;

	public ExecuteBucketFillCommandBuilder(String[] params)
			throws InvalidCommandException {
		super(params);
	}

	@Override
	public void validateParams() throws InvalidCommandException {
		try {
			x = Integer.parseInt(params[1]);
			y = Integer.parseInt(params[2]);
			color = params[3].charAt(0);
		} catch (Exception e) {
			throw new InvalidCommandException(
					"Invalid params in Execute Bucket Fill Command "
							+ params.toString());
		}
	}

	@Override
	public Command getCommand() {
		return new ExecuteBucketFillCommand(x, y, color);
	}
}
