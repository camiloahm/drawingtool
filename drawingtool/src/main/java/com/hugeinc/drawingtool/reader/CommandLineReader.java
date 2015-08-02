package com.hugeinc.drawingtool.reader;


import com.hugeinc.drawingtool.draw.figure.Drawable;
import com.hugeinc.drawingtool.CommandOption;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 * Created by CamiloH on 01/08/2015.
 */
public class CommandLineReader {

    private CommandLineParser parser;
    private Options options;

    public CommandLineReader(Options options, CommandLineParser parser) {
        this.options = options;
        this.parser = parser;
    }

    public Drawable getCommand(String[] instructions) throws ParseException {

        CommandLine commandLine = parser.parse(options, instructions);
        for (CommandOption commandOption : CommandOption.values()) {
            if (commandOption.getOptionName().equals(commandOption.getOptionName())) {
                Class<Drawable> command = commandOption.getCommandClazz();

            }
        }
        return null;
    }

}
