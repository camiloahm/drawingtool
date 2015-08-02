package com.hugeinc.drawingtool;

import com.hugeinc.drawingtool.reader.CommandLineReader;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;


/**
 * Created by CamiloH on 01/08/2015.
 */
public class DrawingTool {

    private Options options;
    private CommandLineReader commandLineParser;

    public DrawingTool() {
        options = getOptions();
        CommandLineParser parser=new DefaultParser();
        commandLineParser=new CommandLineReader(options,parser);
    }


    public Options getOptions() {

        Options options = new Options();


        options.addOption(Option.builder(CommandOption.L.toString())
                .required(false)
                .longOpt(CommandOption.L.getOptionName())
                .build());

        options.addOption(Option.builder(CommandOption.R.toString())
                .required(false)
                .longOpt(CommandOption.R.getOptionName())
                .build());

        options.addOption(Option.builder(CommandOption.B.toString())
                .required(false)
                .longOpt(CommandOption.B.getOptionName())
                .build());

        return options;
    }
}
