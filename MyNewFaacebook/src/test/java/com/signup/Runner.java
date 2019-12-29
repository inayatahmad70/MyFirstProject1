package com.signup;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",tags= {"@Test"},
plugin= {"html:target/cucmber.html.reporty"},
dryRun=false)


public class Runner {

}
