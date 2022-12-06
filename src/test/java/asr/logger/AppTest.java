package asr.logger;


import com.aventstack.extentreports.Status;
import asr.reporting.Reporting;

public class AppTest 
{

	public static void main(String[] args){  
		Reporting.logReporter(Status.DEBUG,"Hello this is a trace message");
		Reporting.logReporter(Status.DEBUG, "Hello this is a debug message");
		Reporting.logReporter(Status.INFO, "Hello this is an info message");
		Reporting.logReporter(Status.WARNING, "Hello this is an warn message");
		Reporting.logReporter(Status.ERROR, "Hello this is an error message");
		Reporting.logReporter(Status.FATAL, "Hello this is an fatal message");
	}  
}
