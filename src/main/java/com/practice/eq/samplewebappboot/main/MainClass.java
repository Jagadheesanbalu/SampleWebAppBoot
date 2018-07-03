/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practice.eq.samplewebappboot.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Jagadheesan Balu
 */
@SpringBootApplication
@RestController
@ComponentScan( basePackages = {"com.practice.eq.samplewebappboot.*"})
public class MainClass {
    
    public static void main(String[] args) {
        SpringApplication.run(MainClass.class, args);
    }
 
}
