package StepDefinitions;

import org.junit.runner.RunWith;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue= {"StepDefinitions"},
monochrome=true,
//to use html reports for the project use below
//plugin={"pretty","html:target/HtmlReports"}
//to use json reports for the project use below
//plugin={"pretty","json:target/JsonReports/report.json"}
//to use junit reports for the project use below
plugin={"pretty","junit:target/JunitReports/report.xml",
                   "html:target/HtmlReports",
                   "json:target/JsonReports/report.json"},
tags="@smoketest"
)

public class TestRunner {

}
