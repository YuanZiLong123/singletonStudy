package com.study.singleton;

import java.util.HashMap;

public class ContainerSingleton {

    private ContainerSingleton(){}

    private static HashMap<String,Object> ioc = new HashMap<>();

    public static Object getInstance(String className){
       synchronized (ioc){
           if (ioc.containsKey(className)){
               return  ioc.get(className);
           }else {
               Object obj = null;
               try {
                   obj = ioc.put(className, Class.forName(className).newInstance());
                   ioc.put(className, obj);
               } catch (InstantiationException e) {
                   e.printStackTrace();
               } catch (IllegalAccessException e) {
                   e.printStackTrace();
               } catch (ClassNotFoundException e) {
                   e.printStackTrace();
               }
               return  obj;
           }
       }
    }

}
