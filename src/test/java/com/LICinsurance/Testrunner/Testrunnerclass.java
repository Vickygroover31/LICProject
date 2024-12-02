package com.LICinsurance.Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\aswin\\eclipse-workspace\\LICInsuranceProject\\src\\test\\resources\\Productmodule.feature",
glue = "com.LICinsurance",
dryRun = false,
monochrome = true,
plugin = {"html:target/html", "json:target/report.json"})
              

public class Testrunnerclass {

}
