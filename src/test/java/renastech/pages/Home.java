package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.stepDefinitions.Steps;
import renastech.utils.BrowseUtils;

public class Home extends BrowseUtils {
    public Home(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@type='submit']")
    private WebElement buyNow;

    public void setBuyNow() {
        staticWait(2);
        buyNow.click();
    }
}
