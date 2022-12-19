package com.rapidtech.springdasar.singleton;

public class TrySingleton {
    private static TrySingleton trySingleton;

    public static TrySingleton getInstance(){
        if(trySingleton == null){
            trySingleton = new TrySingleton();
        }
        return trySingleton;
    }
    private TrySingleton(){
    }
}
