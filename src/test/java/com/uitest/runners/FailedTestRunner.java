package com.uitest.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) // this makes "FailedTestRunner.java" class as a runner class
@CucumberOptions(
                plugin = {"html:target/failed-html-report"},
                features = "@target/rerun.txt",
                glue = "com/uitest/step_definitions"
)

public class FailedTestRunner {
}
