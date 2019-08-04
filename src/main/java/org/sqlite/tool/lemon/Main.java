package org.sqlite.tool.lemon;

import org.sqlite.tool.option.BoolOption;

/**
 * The main program.  Parse the command line and do it。
 * 
 * @author little-pan
 * @since 2019-08-04
 *
 */
public class Main {
    
    public static void main(String[] args) {
        final BoolOption version = new BoolOption("x", "Print the version number.");
        final BoolOption rpflag = new BoolOption("g", "Print grammar without actions.");
        final BoolOption basisflag = new BoolOption("b", "Print only the basis in report.");
        final BoolOption compress = new BoolOption("c", "Don't compress the action table.");
        final BoolOption quiet = new BoolOption("q",  "(Quiet) Don't print the report file.");
        final BoolOption statistics = new BoolOption("s", "Print parser stats to standard output.");
        final BoolOption mhflag = new BoolOption("m", "Output a makeheaders compatible file.");
        final BoolOption nolinenosflag = new BoolOption("l", "Do not print #line statements.");
        final BoolOption noresort = new BoolOption("r", "Do not sort or renumber states");
        
    }

}
