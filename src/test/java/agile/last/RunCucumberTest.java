package agile.last;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/agile/last/resources/dojo", strict = true, monochrome = true, plugin = {"pretty", "junit:target/cucumber.xml"})
public class RunCucumberTest { }
