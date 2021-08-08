package com.uitest.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// RunWith comes from JUnit
@RunWith(Cucumber.class)
@CucumberOptions(
        // creating cucumber.json file THAT will be used to create a report.
        plugin={"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        // writing feature files location to connect feature files with CukesRunner class
        features = "src/test/resources/features",
        glue = "com/uitest/step_definitions",  // glue connects step_definitons with CukesRunner class

        // "dryRun = true" It checks if there are  undefined steps before execution the steps.
        // if there is an undefined step, it willNOT execute the codes.
        dryRun = false,
        tags = "@wip" // it will run just scenario under @store_manager label
)
public class CukesRunner {
}
