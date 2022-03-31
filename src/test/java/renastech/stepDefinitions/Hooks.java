package renastech.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import renastech.utils.BrowseUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

public class Hooks extends BrowseUtils {
    @Before
    public void setup(){
        Driver.getDriver();
        BrowseUtils.setWaitTIme();
        driver.manage().window().maximize();
        driver.get(ConfigurationsReader.getProperties("urlHRM"));
    }

    @After
    public void tearDown(Scenario scenario){
        if(scenario.isFailed()){
            byte[] data=((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(data,"image/png",scenario.getName());
        }
    }
}
