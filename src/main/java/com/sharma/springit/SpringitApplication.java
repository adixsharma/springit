package com.sharma.springit;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class SpringitApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
    }




//    @Bean
//    CommandLineRunner runner(){
//        return args -> {
//            log.error("CommandLineRunner.run()");
//            log.warn( "CommandLineRunner.run()");
//            log.info("CommandLineRunner.run()");
//            log.debug("CommandLineRunner.run()");
//            log.trace("CommandLineRunner.run()");
//        };
//    }





//
//    @Bean
//    CommandLineRunner runner(){
//        return args -> {
//            System.out.println("Printing out all the bean names in the application context.");
//            System.out.println("------------------------------------------------------------");
//            String[] beans = applicationContext.getBeanDefinitionNames();
//
//            Arrays.sort(beans);
//            for (String bean: beans){
//                System.out.println(bean);
//            }
//        };
//    }
//


}