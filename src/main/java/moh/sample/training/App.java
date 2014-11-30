package moh.sample.training;

import org.apache.log4j.BasicConfigurator;
import org.s2n.ddt.util.FileUtils;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final String COMMA_SEPERATED= "####.00";
    public static void main( String[] args )
    {
    	
        System.out.println( "Hello World!" );
        new App();
       // formatNumber(12345.000);
    }


static double formatNumber(double d) {
	//NumberFormat nf = NumberFormat.getNumberInstance( COMMA_SEPERATED);
	DecimalFormat df= new DecimalFormat(COMMA_SEPERATED);
	System.out.println("number "+df.format(d));
	return d;
	
	
	}


public App(){
	BasicConfigurator.configure();
	FileUtils.fileCopy("D:/Apps/dat/avimy_text","D:/Apps/dat/avimy_text11");
}

}