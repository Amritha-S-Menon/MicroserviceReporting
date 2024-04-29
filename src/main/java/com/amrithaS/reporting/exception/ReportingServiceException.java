package com.amrithaS.reporting.exception;

public class ReportingServiceException extends Exception{
    public ReportingServiceException() {
        super("Reporting Service Exception");
    }
    public ReportingServiceException(String message) {
        super(message);
    }
    public ReportingServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
