package renastech.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import renastech.pages.Home;
import renastech.pages.Payment;
import renastech.pages.Verification;
import renastech.utils.BrowseUtils;
import renastech.utils.ConfigurationsReader;
import renastech.utils.Driver;

import java.util.Map;

public class Steps extends BrowseUtils {
    @Given("The user wants to see payment gateway website")
    public void the_user_wants_to_see_payment_gateway_website() {
        Driver.getDriver();
        driver.get(ConfigurationsReader.getProperties("url"));
        BrowseUtils.setWaitTIme();
        driver.manage().window().maximize();
        System.out.println("The Website is launched ");
    }

    @When("The user wants to buy elephant toy")
    public void the_user_wants_to_buy_elephant_toy() {
        Home home=new Home();
        home.setBuyNow();
    }

    @Then("The user wants to enter payment information as")
    public void the_user_wants_to_enter_payment_information_as(Map<String,String> dataTable) {
        Payment payment=new Payment();
        payment.setCardNumber(dataTable.get("CNumber"));
        payment.setMonth(dataTable.get("EMonth"));
        payment.setYear(dataTable.get("EYear"));
        payment.setCvvCode(dataTable.get("CVV"));

    }

    @Then("The user wants to pay now")
    public void the_user_wants_to_pay_now() {
        Payment payment=new Payment();
        payment.setPayBtn();

    }

    @Then("The user wants to verify  message as {string}")
    public void the_user_wants_to_verify_message_as(String expected) {
        Verification verification=new Verification();

        verification.setVerificationText(expected);
    }
}
