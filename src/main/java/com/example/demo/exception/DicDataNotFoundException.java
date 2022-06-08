package com.example.demo.exception;

public class DicDataNotFoundException extends Exception{
    static final String ERROR_MSG = "无法找到对应的数据字典的值";

    public DicDataNotFoundException() {
        super(ERROR_MSG);
    }

    /*
    * 继承关系初始化顺序
    *1.父类静态代码区和父类静态成员
    *2.子类静态代码区和子类静态成员
    *3.父类非静态代码区和普通成员
    *4.父类构造函数
    *5.子类非静态代码区和普通成员
    *6.子类构造函数
    * */
}
