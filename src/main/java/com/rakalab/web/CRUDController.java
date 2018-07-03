package com.rakalab.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class CRUDController implements SparkController {

    @Override
    public void init() {
        log.info(">> CRUDController >> initialized.");
    }
}
