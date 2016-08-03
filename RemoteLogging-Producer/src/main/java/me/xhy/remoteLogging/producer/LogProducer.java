
package me.xhy.remoteLogging.producer;

import org.apache.log4j.Logger;

public class LogProducer{
	
    private static final Logger logger = Logger.getLogger(LogProducer.class);
    
    public void printLogUseLogger() {
    	
        // just log a message
        logger.info("Info Log.");
        logger.warn("Warn Log");
        logger.error("Error Log.");
        
    }
    
    public void printLogUseLogger(String param) {
    	if(null == param || "".equals(param)) {
    		this.printLogUseLogger();
    	}
    	
    	logger.info(param);
        logger.warn(param);
        logger.error(param);
    	
    }
}