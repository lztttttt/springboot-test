package com.aiguigu.boot;

import com.aiguigu.boot.bean.Pet;
import com.aiguigu.boot.bean.User;
import com.aiguigu.boot.config.MyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.jndi.JndiAccessor;

import javax.security.auth.login.Configuration;
import java.util.jar.JarEntry;

@SpringBootApplication

public class MainApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class,args);

//        String[] names = run.getBeanDefinitionNames();
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i]);
//        }
//
//        Pet tom1 = run.getBean("cat", Pet.class);
//        Pet tom2 = run.getBean("cat", Pet.class);
//        System.out.println("一不一样？  " + (tom1 == tom2));
//
//        MyConfig bean1 = run.getBean(MyConfig.class);
//        System.out.println(bean1);
//
//        User user111 = bean1.user01();
//        User user222 = bean1.user01();
//        System.out.println((user111 == user222));
//
//        System.out.println("有没有把宠物拿对？  " + (user111.getPet() == tom1));
//        System.out.println("===========");
//        String[] beanNamesForType = run.getBeanNamesForType(User.class);
//        for (int i = 0; i < beanNamesForType.length; i++) {
//            System.out.println(beanNamesForType[i]);
//        }
//
//        String[] beanNamesForType1 = run.getBeanNamesForType(JndiAccessor.class);
//        System.out.println(beanNamesForType1);

        boolean user01 = run.containsBean("user01");
        System.out.println("哟没有人" + user01);

        boolean user02 = run.containsBean("xiumao");
        System.out.println("有没有修猫" + user02);

        boolean haha = run.containsBean("haha");
        boolean hehe = run.containsBean("hehe");
        System.out.println("哈不哈？**********************" + haha);
        System.out.println("呵不呵？" + hehe);


    }


}
