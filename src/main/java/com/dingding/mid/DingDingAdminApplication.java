package com.dingding.mid;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/**
 */
@SpringBootApplication(scanBasePackages = "com")
public class DingDingAdminApplication extends SpringBootServletInitializer implements
    CommandLineRunner {

    public static void main(String[] args)  {
        SpringApplication springApplication = new SpringApplication(DingDingAdminApplication.class);
        springApplication.run(args);
        System.out.println("DingDing启动完成");
    }


    @Override
    public void run(String... args) throws Exception {

    }



}
