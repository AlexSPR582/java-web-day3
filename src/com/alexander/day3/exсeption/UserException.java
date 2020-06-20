package com.alexander.day3.exсeption;

public class UserException extends Exception {
    public UserException() {
        super();
    }

    public UserException(String message) {
        super(message);
    }

    public UserException(Throwable exception) {
        super(exception);
    }

    public UserException(String message, Throwable exception) {
        super(message, exception);
    }
}
