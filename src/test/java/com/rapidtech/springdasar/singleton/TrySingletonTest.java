package com.rapidtech.springdasar.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrySingletonTest {
    @Test
    void singletonTest(){
        TrySingleton trySingleton1 = TrySingleton.getInstance();
        TrySingleton trySingleton2 = TrySingleton.getInstance();
        Assertions.assertSame(trySingleton1, trySingleton2);
    }
}