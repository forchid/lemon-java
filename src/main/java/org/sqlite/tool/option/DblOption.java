package org.sqlite.tool.option;

/**
 * @author little-pan
 * @since 2019-08-04
 *
 */
public class DblOption extends Option<Double> {
    
    public DblOption(String label, double arg, String message) {
        super(label, arg, message);
    }
    
    @Override
    public void parse(String s) {
        super.arg = Double.valueOf(s);
    }

}
