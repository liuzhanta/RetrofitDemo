package com.tata.retrofitdemo;

/**
 * @Description:
 * @Author: Terry
 * @Date: 3/24/21 7:10 PM
 */
public class Result<T>{
    private int error_code;
    String reason;
    T result;

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }
}
