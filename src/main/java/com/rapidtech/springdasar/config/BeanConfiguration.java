package com.rapidtech.springdasar.config;

import com.rapidtech.springdasar.model.Foo;
import com.rapidtech.springdasar.model.TryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public Foo foo(){
        Foo foo = new Foo();
        return foo;
    }

    @Bean
    public TryBean tryBean(){
        TryBean tryBean = new TryBean();
        return tryBean;
    }
}
