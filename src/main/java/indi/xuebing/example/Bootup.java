/**
 * Bootup.java   2016年9月19日 上午11:18:58 by LIXUEBING 
 *
 * Copyright (c) 2010 - 2016 xuebing.Li. All rights reserved.
 * 
 */
package indi.xuebing.example;

import java.util.Arrays;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableAutoConfiguration
public class Bootup {

    public static void main(String[] args) {

        /**
         * 此种方式直接启动
         */
        // SpringApplication.run(Bootup.class, args);
        /**
         * 启动后打印出来加载的Bean信息
         */
        ApplicationContext ctx = SpringApplication.run(Bootup.class, args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }

    }

}
