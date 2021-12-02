package com.aiguigu.boot.config;

import com.aiguigu.boot.bean.Car;
import com.aiguigu.boot.bean.Pet;
import com.aiguigu.boot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jndi.JndiAccessor;

@Import({User.class, JndiAccessor.class})
@Configuration(proxyBeanMethods = false)
@ImportResource("classpath:beans.xml")
//@EnableConfigurationProperties(Car.class)
public class MyConfig {

    @Bean("xiumao")
    public Pet cat(){
        return new Pet("tomcat");
    }

    @Bean
    @ConditionalOnBean(name = "xiumao")
    public User user01(){
        User zzz = new User("nidie", 18);
        zzz.setPet(cat());
        return zzz;
    }




}
