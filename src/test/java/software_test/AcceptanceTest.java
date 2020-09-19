package software_test;




import org.junit.runner.RunWith;
import org.junit.runner.RunWith.*;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;




@RunWith(Cucumber.class)
@CucumberOptions(features="use_case",
plugin= {"html:target/cucumber/wikipedia.html"},
monochrome=true,
snippets = SnippetType.CAMELCASE ,
glue= {"software_test"},
strict=true
)
public class AcceptanceTest {

}
