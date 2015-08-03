package com.hugeinc.drawingtool.command.parser;

import com.hugeinc.drawingtool.command.Command;
import com.hugeinc.drawingtool.command.exception.InvalidCommandException;


public interface CommandParser {

	Command getCommand(String command) throws InvalidCommandException;

}
