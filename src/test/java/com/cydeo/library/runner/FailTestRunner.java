package com.cydeo.library.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "rerun:target/rerun.txt",
        features = "@target/rerun.txt",
        glue = "com/cydeo/library/step_definition"
)

public class FailTestRunner {
}
