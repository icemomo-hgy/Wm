package com.wm.common;

public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();
    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }
    public  static  Long getCurrentId(){
        return  threadLocal.get();
    }
}
