package com.trycloud.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        }, // for reports
        features = "src/test/resources/features",// path from content root to copy this path
        glue = "com/trycloud/step_definitions",// we use glue in order to define our step_definitions//path from source root
        dryRun = false,// in order to get snippets
        tags = "@mix3",
        publish = true //generating a report with public link//in order to generate public link for reports
)

public class CukesRunnerZN {

}
