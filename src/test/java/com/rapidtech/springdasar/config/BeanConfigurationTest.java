package com.rapidtech.springdasar.config;

import com.rapidtech.springdasar.model.Foo;
import com.rapidtech.springdasar.model.TryBean;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class BeanConfigurationTest {

    @Test
    void beanTest() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);
        Foo foo3 = context.getBean(Foo.class);

        TryBean tryBean1 = context.getBean(TryBean.class);
        TryBean tryBean2 = context.getBean(TryBean.class);
        TryBean tryBean3 = context.getBean(TryBean.class);


        Assertions.assertSame(foo1,foo2);
        Assertions.assertSame(foo2,foo3);

        Assertions.assertSame(tryBean1, tryBean2);
        Assertions.assertSame(tryBean2, tryBean3);
    }
}
