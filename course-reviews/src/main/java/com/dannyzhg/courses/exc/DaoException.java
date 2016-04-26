package com.dannyzhg.courses.exc;

/**
 * Created by Dannyzju on 4/18/16.
 */
public class DaoException extends Exception {

    private final Exception originalException;

    public DaoException(Exception originalException, String msg){
        super(msg);
        this.originalException = originalException;

    }
}
