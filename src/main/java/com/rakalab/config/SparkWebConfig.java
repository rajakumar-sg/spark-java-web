package com.rakalab.config;

import com.rakalab.web.SparkController;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
@AllArgsConstructor
public class SparkWebConfig implements ApplicationListener<ContextRefreshedEvent> {

    private final List<SparkController> sparkControllers;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        sparkControllers.forEach(SparkController::init);

        log.info(">> SpringWebConfig >> application context initialized!");
    }
}
