package renastech.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowseUtils;

import org.apache.log4j.Logger;


public class OrangeHRMHome extends BrowseUtils {
    public OrangeHRMHome(){ PageFactory.initElements(driver,this); }

    private static final Logger logger= Logger.getLogger(OrangeHRMHome.class);

    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    private WebElement dashboardMessage;
    @FindBy(xpath = "//b[.='PIM']")
    private WebElement PIM;
    @FindBy(xpath = "//a[.='Add Employee']")
    private WebElement addEmployee;
    @FindBy(id = "firstName")
    private WebElement Name;
    @FindBy(id = "lastName")
    private WebElement LastName;
    @FindBy(id = "btnSave")
    private WebElement save;
    @FindBy(xpath = "//h1[.='Personal Details']")
    private WebElement Profile;
    @FindBy(id = "chkLogin")
    private WebElement detailsBox;
    @FindBy(id = "user_name")
    private WebElement name2;
    @FindBy(id = "user_password")
    private WebElement password2;
    @FindBy(id = "re_password")
    private WebElement rePassword;
    @FindBy(id = "status")
    private WebElement status;

    public void setDashboardMessage(){ Assert.assertEquals("Dashboard",dashboardMessage.getText()); }
    public void setPIM(){
        PIM.click();
    }
    public void setAddEmployee(){
        addEmployee.click();
    }
    public void setName(String name){
        Name.sendKeys(name);
    }
    public void setLastName(String lastname){
        LastName.sendKeys(lastname);
    }
    public void setSave(){
        save.click();
    }
    public void setProfile(String expected){ Assert.assertEquals(expected,Profile.getText()); }
    public void setDetailsBox(){ clickWithWait(detailsBox); }
    public void setName2(String Name2) { name2.sendKeys(Name2); }
    public void setPassword2(String Password2){ password2.sendKeys(Password2); }
    public void setRePassword(String RePassword){ rePassword.sendKeys(RePassword); }
    public void setStatus(String Status){
        BrowseUtils.selectFromDropDown(status,Status);

    logger.info("status is passed");}
}
