package org.sqlite.tool.option;

/**
 * @author little-pan
 * @since 2019-08-04
 *
 */
public class StrOption extends Option<String> {
    
    public StrOption(String label, String value, String message) {
        super(label, value, message);
    }
    
    @Override
    public void parse(String s) {
        super.arg = s;
    }

}
