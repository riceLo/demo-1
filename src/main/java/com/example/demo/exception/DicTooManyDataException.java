package com.example.demo.exception;

public class DicTooManyDataException  extends Exception{
    static final String ERROR_MSG = "对应的数据字典的值有多个";

    public DicTooManyDataException() {
        super(ERROR_MSG);
    }
}
