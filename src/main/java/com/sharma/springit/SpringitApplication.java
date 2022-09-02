package com.sharma.springit;

import com.sharma.springit.domain.Comment;
import com.sharma.springit.domain.Link;
import com.sharma.springit.repository.CommentRepository;
import com.sharma.springit.repository.LinkRepository;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {

    private static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(SpringitApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository){
        return args -> {
            Link link = new Link("Getting Started with Spring Boot 2", "https://therealdanvega.com/spring-boot-2");
            linkRepository.save(link);

            Comment comment = new Comment("This Spring Boot 2 link is awesome!", link);
            commentRepository.save(comment);
            link.addComment(comment);

            System.out.println("Inserted a link & a comment");
            System.out.println("========================================");

            Link firstLink = linkRepository.findByTitle("Getting Started with Spring Boot 2");
            System.out.println(firstLink.getTitle());

        };
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