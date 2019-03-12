package com.study.singleton;

import java.security.PrivateKey;

public class InnerClassSingleton {

    private InnerClassSingleton(){}

    public InnerClassSingleton getInstance(){
        return  Instance.innerClassSingleton;
    }

    private static  class Instance{
        private static  InnerClassSingleton innerClassSingleton = new InnerClassSingleton();
    }
}
