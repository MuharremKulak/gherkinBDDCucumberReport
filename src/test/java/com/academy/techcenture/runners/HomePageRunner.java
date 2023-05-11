package com.academy.techcenture.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        tags = "@test",
        features = "src/test/java/com/academy/techcenture/features" ,
        glue = "com/academy/techcenture/step_definitions",
        plugin = { "summary", "pretty", "html:target/cucumber-reports.html",
                    "json:target/cucumber-reports"},
        monochrome = true)

public class HomePageRunner {
}
