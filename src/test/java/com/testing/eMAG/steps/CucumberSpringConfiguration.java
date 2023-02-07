package com.testing.eMAG.steps;

import com.testing.eMAG.SpringBasicApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = SpringBasicApplication.class)
public class CucumberSpringConfiguration {
}
