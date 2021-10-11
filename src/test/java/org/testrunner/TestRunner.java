package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features\\adactin.feature", glue = "org.stepdefinition", monochrome = true)

public class TestRunner {

}
