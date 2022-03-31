package renastech.pages;

import io.cucumber.java.an.Y;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import renastech.utils.BrowseUtils;

public class Payment extends BrowseUtils {
    public Payment(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "card_nmuber")
    private WebElement cardNumber;
    @FindBy(id = "month")
    private WebElement month;
    @FindBy(id = "year")
    private WebElement year;
    @FindBy(id = "cvv_code")
    private WebElement cvvCode;
    @FindBy(name = "submit")
    private WebElement payBtn;


    public void setCardNumber(String CardNumber){
        staticWait(1);
        cardNumber.sendKeys(CardNumber);
    }
    public void setMonth(String Month){
        staticWait(3);
        month.sendKeys(Month);
    }
    public void setYear(String Year){
        staticWait(3);
        year.sendKeys(Year);
    }
    public void setCvvCode(String CVV){
        staticWait(1);
        year.sendKeys(CVV);
    }
    public void setPayBtn()
    {
        staticWait(1);
        payBtn.click();
    }
}
