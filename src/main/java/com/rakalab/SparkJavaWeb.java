package com.rakalab;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class SparkJavaWeb {

    public static void main(String[] args) {
        new AnnotationConfigApplicationContext(SparkJavaWeb.class);
    }
}
