package renastech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowseUtils;
import renastech.utils.Driver;

public class Admin extends BrowseUtils {
    public Admin(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id="menu_admin_viewAdminModule")
    private WebElement adminmodule;
    @FindBy(id="menu_admin_nationality")
    private WebElement nationality;
    @FindBy(id="btnAdd")
    private WebElement addButton;
    @FindBy(id="nationality_name")
    private WebElement nationalityBox;
    @FindBy(id = "btnSave")
    private WebElement savebtn;

    public void setAdminmodule(){clickWithWait(adminmodule);}

    public void setNationality() {
    clickWithWait(nationality);
    }
    public void setAddButton(){
    clickWithWait(addButton);
    }
    public void setNationalityBox(String nationName){
        enterText(nationalityBox,nationName);
    }
    public void setSavebtn()
    {
        clickWithWait(savebtn);
    }
}
