package com.trycloud.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {
                "pretty",
                "html:target/cucumber-reports.html",          // this is to generate a report
                "rerun:target/rerun.txt",                      // this is to rerun failed tests
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"
        },
        features = "src/test/resources/features",               // this is features folder's path
        glue = "com/trycloud/step_definitions",                    // this is step_definitions folder path
        dryRun = false,                                         // in order to get snippets
        tags = "@wip_HA",                                          // it will run only tags of our choice
        publish = true                                          // generating a report with public link
        //monochrome = true,                                      // it turns the color from green to monochrome

)

public class CukesRunner_HA {}
