package ui;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
    
	private static Logger demologger = LogManager.getLogger(Logging.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	

		demologger.info("Click successfull"); 
		demologger.error("DB Conection failed");
		demologger.debug("This is debug"); 
		demologger.fatal ("This is fatal");

	}

}
