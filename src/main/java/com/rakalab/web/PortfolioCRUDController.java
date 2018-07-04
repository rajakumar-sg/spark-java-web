package com.rakalab.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import spark.Request;
import spark.Response;
import spark.Spark;

@Slf4j
@Component
public class PortfolioCRUDController implements SparkController {

    @Override
    public void init() {
        log.info(">> CRUDController >> initialized.");
        Spark.path("/api/portfolio", () -> {
            Spark.get("/:id", this::getPortfolio);
            Spark.post("/:id", this::savePortfolio);
        });
    }

    private String savePortfolio(Request request, Response response) {
        return null;
    }

    private String getPortfolio(Request request, Response response) {
        return "Portfolio {" + request.params("id") + "}";
    }
}
