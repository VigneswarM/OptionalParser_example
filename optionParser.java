import joptsimple.OptionException; 
import joptsimple.OptionParser; 
import joptsimple.OptionSet; 
import joptsimple.OptionSpec; 
import java.util.*;


public class optionParser {
	
	public static void main(String[] args)
	{
				
		OptionParser parser = new OptionParser();
		final String[] portOptions = {"port", "p"};
		parser.acceptsAll(Arrays.asList(portOptions), "EchoServer listening port")
        	  .withOptionalArg()
        	  .defaultsTo("8080");
		
		String cwd = System. getProperty("user.dir");
		final String[] directoryOptions = {"directory", "d"};	
		parser.acceptsAll(Arrays.asList(directoryOptions), "opening directory")
			  .withOptionalArg()
			  .defaultsTo(cwd);
		
		final String[] verboseOptions = {"verbose","v"};  
		parser.acceptsAll(Arrays.asList(verboseOptions), "Verbose logging - Print debugging messages.");  
		
		OptionSet opts = parser.parse(args);
		int port = Integer.parseInt((String) opts.valueOf("port"));
		String dir = (String) opts.valueOf("directory");
		Boolean isverbose = opts.has("verbose");
		
		System.out.println(isverbose);
		System.out.println(port);
		System.out.println(dir);
		
		Boolean verbose = false;

	}

}
