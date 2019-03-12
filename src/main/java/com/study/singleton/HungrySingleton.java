package com.study.singleton;

public class HungrySingleton {


    private HungrySingleton(){}

    private HungrySingleton instance = new HungrySingleton();

    public HungrySingleton getInstance(){
        return  instance;
    }

}
