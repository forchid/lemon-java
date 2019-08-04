package org.sqlite.tool.option;

/**
 * @author little-pan
 * @since 2019-08-04
 *
 */
public class IntOption extends Option<Integer> {
    
    public IntOption(String label, int arg, String message) {
        super(label, arg, message);
    }
    
    @Override
    public void parse(String s) {
        super.arg = Integer.valueOf(s);
    }
    
}
