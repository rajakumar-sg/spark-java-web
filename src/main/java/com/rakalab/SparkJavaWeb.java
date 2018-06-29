package com.rakalab;

import spark.Spark;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SparkJavaWeb {
    public static void main(String[] args) {
        setupLogger();
        Spark.get("/hello",
                (req, res) -> String.format("Hello, %s",
                        req.queryMap().toMap()
                        .entrySet()
                        .stream()
                        .map(e -> e.getKey() + "=" + Arrays.toString(e.getValue()))
                        .collect(Collectors.toList())
                ));

    }

    private static void setupLogger() {

    }
}
