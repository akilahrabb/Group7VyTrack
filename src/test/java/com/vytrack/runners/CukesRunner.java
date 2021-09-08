package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
    plugin = {
            "html:target/cucumber-report.html",
            "json:target/cucumber.json",
            "rerun:target/rerun.txt"
    },
    features = "src/test/resources/features",
        glue = "steps",
        dryRun = true,
        tags = ""

)


public class CukesRunner {
}
