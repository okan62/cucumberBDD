package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowseUtils;
import renastech.utils.ConfigurationsReader;

public class OrangeHRMLogin extends BrowseUtils {
    public OrangeHRMLogin(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "txtUsername")
    private WebElement username;
    @FindBy(id = "txtPassword")
    private WebElement password;
    @FindBy(id = "btnLogin")
    private WebElement login;


    public void setUsername() {
        username.sendKeys(ConfigurationsReader.getProperties("username"));
    }

    public void setPassword() {
        password.sendKeys(ConfigurationsReader.getProperties("password"));
    }
    public void setLogin(){
        login.click();
    }


    public void setDataFromExcel(String UserName,String Password){
        username.sendKeys(UserName);
        password.sendKeys(Password);
        login.click();
    }
}
