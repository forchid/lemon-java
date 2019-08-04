package org.sqlite.tool.option;

/**
 * @author little-pan
 * @since 2019-08-04
 *
 */
public abstract class Option<T> {
    
    public final String label;
    public final String message;
    public T arg;
    
    public Option(String label, T arg, String message) {
        this.label = label;
        this.arg   = arg;
        this.message = message;
    }
    
    public abstract void parse(String s);

}
