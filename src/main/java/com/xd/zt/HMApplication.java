package com.xd.zt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class HMApplication {
    public static void main(String[] args) {
        SpringApplication.run(HMApplication.class, args);
    }
}
