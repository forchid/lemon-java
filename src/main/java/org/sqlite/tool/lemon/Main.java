package org.sqlite.tool.lemon;

import org.sqlite.tool.option.BoolOption;
import org.sqlite.tool.option.Option;
import org.sqlite.tool.option.StrOption;
import org.sqlite.tool.option.StrsOption;

/**
 * The main program.  Parse the command line and do it。
 * 
 * @author little-pan
 * @since 2019-08-04
 *
 */
public class Main {
    // options definition
    static final BoolOption version       = new BoolOption("x", "Print the version number.");
    static final BoolOption rpflag        = new BoolOption("g", "Print grammar without actions.");
    static final BoolOption basisflag     = new BoolOption("b", "Print only the basis in report.");
    static final BoolOption compress      = new BoolOption("c", "Don't compress the action table.");
    static final BoolOption quiet         = new BoolOption("q", "(Quiet) Don't print the report file.");
    static final BoolOption statistics    = new BoolOption("s", "Print parser stats to standard output.");
    static final BoolOption mhflag        = new BoolOption("m", "Output a makeheaders compatible file.");
    static final BoolOption nolinenosflag = new BoolOption("l", "Do not print #line statements.");
    static final BoolOption noresort      = new BoolOption("r", "Do not sort or renumber states");
    static final StrOption handledOption  = new StrOption( "d", ".", "Output directory.  Default '.'");
    static final StrsOption handleDOption = new StrsOption("D", "Define an %ifdef macro.");
    static final StrOption foption        = new StrOption( "f", "Ignored.  (Placeholder for -f compiler options.)"); 
    static final StrOption IOption        = new StrOption( "I", "Ignored.  (Placeholder for '-I' compiler options.)");
    static final StrOption OOption        = new StrOption( "O", "Ignored.  (Placeholder for '-O' compiler options.)");
    static final BoolOption showPreCnflict= new BoolOption("p", "Show conflicts resolved by precedence rules");
    static final StrOption handleTOption  = new StrOption( "T", "Specify a template file.");
    static final StrOption WOption        = new StrOption( "W", "Ignored.  (Placeholder for '-W' compiler options.)");
    
    static final Option<?>[] options = {
            basisflag,      compress, handledOption, handleDOption, foption,
            rpflag,         IOption,  mhflag,        nolinenosflag, OOption,
            showPreCnflict, quiet,    noresort,      statistics,    version,
            handleTOption,  WOption,
    };
    
    public static void main(String[] args) {
        int i;
        int exitcode;
        Lemon lemon;
        Rule rp;
        
    }

}
