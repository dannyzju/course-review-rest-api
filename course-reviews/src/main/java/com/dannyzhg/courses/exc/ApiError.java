package com.dannyzhg.courses.exc;

/**
 * Created by Dannyzju on 4/24/16.
 */
public class ApiError extends RuntimeException {
    private final int status;

    public ApiError(int status, String msg){
        super(msg);
        this.status = status;
    }

    public int getStatus(){
        return status;
    }
}
