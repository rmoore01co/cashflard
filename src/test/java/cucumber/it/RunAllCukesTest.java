package cucumber.it;


import cucumber.api.SnippetType;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        features = "classpath:features",
        glue = "cucumber.steps",
        snippets = SnippetType.CAMELCASE,
        tags = "@wine")
public class RunAllCukesTest {
}