package renastech.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.text",//This is for future files path
        glue = "renastech/stepDefinitions", //this is for steps path
        dryRun = false, //it will check if there is any undefined steps
        plugin={"pretty","html:target/default-cucumber-reports.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        }
)
public class FailedRunner {

}
