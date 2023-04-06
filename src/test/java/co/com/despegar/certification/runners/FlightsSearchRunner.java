package co.com.despegar.certification.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/flights_search.feature",
        glue="co.com.despegar.certification.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)

public class FlightsSearchRunner {
}
