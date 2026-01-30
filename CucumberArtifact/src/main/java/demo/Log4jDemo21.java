package demo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4jDemo21 {

    private static final Logger logger = LogManager.getLogger(Log4jDemo21.class);

    public static void main(String[] args) {
    	System.out.println("hi");
        logger.info("1");
        logger.debug("debug");
        
    }
}