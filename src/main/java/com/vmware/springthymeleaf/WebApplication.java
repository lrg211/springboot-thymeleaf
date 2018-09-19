/*
 *******************************************************************************
 * Copyright, VMware, Inc. All Rights Reserved. -- VMware Confidential
 *******************************************************************************
 */

package com.vmware.springthymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * This class is the initial class of springboot service.
 */
@SpringBootApplication(scanBasePackages = { "com.vmware.springthymeleaf" })
@EnableScheduling
@ServletComponentScan("com.vmware.springthymeleaf")
public class WebApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WebApplication.class);
    }

    /**
     * The entrance to start the springboot application.
     *
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebApplication.class, args);
    }
}