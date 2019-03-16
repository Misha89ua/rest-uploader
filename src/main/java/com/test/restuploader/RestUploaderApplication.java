package com.test.restuploader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RestUploaderApplication extends SpringBootServletInitializer {

    private static Class applicationClass = RestUploaderApplication.class;

    public static void main(String[] args) {
        SpringApplication.run(RestUploaderApplication.class, args);
    }

}
