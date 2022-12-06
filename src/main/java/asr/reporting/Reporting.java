package asr.reporting;


import org.apache.log4j.Logger;

import com.aventstack.extentreports.Status;

public class Reporting {
	private static final Logger LOGGER = Logger.getLogger("log4j");
	private static final String PRINT_MESSAGE = "- ";

	public static void logReporter(Status status, String message) {
		reporterLog4J(status, message);
	}
	
	public static void reporterLog4J(Status status, String message) {
        switch (status) {
            case PASS:
                LOGGER.info(PRINT_MESSAGE +message);
                break;
            case FAIL:
                LOGGER.error(PRINT_MESSAGE + message);
                break;
            case ERROR:
                LOGGER.error(PRINT_MESSAGE + message);
                break;
            case WARNING:
                LOGGER.warn(PRINT_MESSAGE + message);
                break;
            case INFO:
                LOGGER.info(PRINT_MESSAGE + message);
                break;
            case FATAL:
                LOGGER.fatal(PRINT_MESSAGE + message);
                break;
            case DEBUG:
                LOGGER.debug(PRINT_MESSAGE + message);
                break;
            default:
                LOGGER.info(PRINT_MESSAGE + message);
                break;
        }
    }


}
