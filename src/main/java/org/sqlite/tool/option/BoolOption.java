package org.sqlite.tool.option;

/**
 * @author little-pan
 * @since 2019-08-04
 *
 */
public class BoolOption extends Option<Boolean> {
    
    public BoolOption(String label, String message) {
        this(label, false, message);
    }
    
    public BoolOption(String label, boolean arg, String message) {
        super(label, arg, message);
    }
    
    @Override
    public void parse(String s) {
        super.arg = Boolean.valueOf(s);
    }

}
