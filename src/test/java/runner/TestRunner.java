package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","html:reports/cucumber.html", "json:reports/cucumber.json"},
        glue = {"stepDef"},
        features = {"src/test/java/features"},
        tags = "api", // run all test case
        monochrome = true
)

public class TestRunner {
}
