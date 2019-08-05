package org.sqlite.tool.option;

import java.util.ArrayList;
import java.util.List;

/**
 * The list of string option.
 * 
 * @author little-pan
 * @since 2019-08-05
 *
 */
public class StrsOption extends Option<List<String>> {
    
    public StrsOption(String label, String message) {
        this(label, new ArrayList<String>(2), message);
    }

    /**
     * @param label
     * @param arg
     * @param message
     */
    public StrsOption(String label, List<String> arg, String message) {
        super(label, arg, message);
    }

    @Override
    public void parse(String s) {
        super.arg.add(s);
    }

}
