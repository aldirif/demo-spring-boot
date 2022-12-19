package com.rapidtech.springdasar.lifeCycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class LifeCycleConfigurationTest {
    @Test
    void lifeCycleTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);

        Connection connection = context.getBean(Connection.class);
    }
}
