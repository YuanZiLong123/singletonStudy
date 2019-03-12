package com.study.singleton;

import java.util.Objects;

public class DoubleCheckSingleton {


    private DoubleCheckSingleton(){}

    private static  DoubleCheckSingleton doubleCheckSingleton = null;


    public DoubleCheckSingleton getInstance(){
        if (Objects.isNull(doubleCheckSingleton)){
            synchronized (this){
                if (Objects.isNull(doubleCheckSingleton)){
                    doubleCheckSingleton = new DoubleCheckSingleton();
                }
            }
        }
        return  doubleCheckSingleton;
    }
}
