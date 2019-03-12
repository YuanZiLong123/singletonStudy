package com.study.singleton;

import java.util.Objects;

public class LazySingleton {


    private LazySingleton(){}

    private LazySingleton instance = null;

    public LazySingleton getInstance(){
        if (Objects.isNull(instance)){
            instance = new LazySingleton();
        }
        return  instance;
    }
}
