package com.eh.testob.testobpongservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class TestobPongServiceApplication {

   public static void main(String[] args) {
      SpringApplication.run(TestobPongServiceApplication.class, args);
   }

}