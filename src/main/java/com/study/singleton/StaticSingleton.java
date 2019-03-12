package com.study.singleton;

public class StaticSingleton {

    private StaticSingleton(){

    }

    public static StaticSingleton instance = null;

    static {
        instance = new StaticSingleton();
    }

    public StaticSingleton getInstance(){
        return  instance;
    }
}
