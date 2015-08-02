package com.hugeinc.drawingtool;

import com.hugeinc.drawingtool.draw.figure.BucketFill;
import com.hugeinc.drawingtool.draw.figure.Line;
import com.hugeinc.drawingtool.draw.figure.Rectangle;
import com.hugeinc.drawingtool.draw.figure.Drawable;

/**
 * Created by CamiloH on 01/08/2015.
 */
public enum CommandOption {

    L("Create Line",Line.class),
    R("Create Rectangle",Rectangle.class),
    B("BucketFill",BucketFill.class);

    String optionName;
    Class commandClazz;

    CommandOption(String optionName,Class commandClass) {
        this.optionName = optionName;
        this.commandClazz= commandClass;
    }

    public String getOptionName() {
        return optionName;
    }

    public Class getCommandClazz() {
        return commandClazz;
    }
}
