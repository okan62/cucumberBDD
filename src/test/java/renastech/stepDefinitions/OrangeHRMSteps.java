package renastech.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import renastech.pages.Admin;
import renastech.pages.OrangeHRMHome;
import renastech.pages.OrangeHRMLogin;
import renastech.utils.BrowseUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class OrangeHRMSteps extends BrowseUtils {

    Admin admin=new Admin();
    OrangeHRMHome orangeHRMHome=new OrangeHRMHome();
    @Given("The user wants to go to orangeHRM application")
    public void the_user_wants_to_go_to_orange_hrm_application() {
        System.out.println("Browser is launched");

    }
    @When("The user wants to enter username and password")
    public void the_user_wants_to_enter_username_and_password() {
        OrangeHRMLogin orangeHRMLogin =new OrangeHRMLogin();
        orangeHRMLogin.setUsername();
        orangeHRMLogin.setPassword();

    }
    @Then("The user wants to click login")
    public void the_user_wants_to_click_login() {
        OrangeHRMLogin orangeHRMLogin =new OrangeHRMLogin();
        orangeHRMLogin.setLogin();

    }
    @Then("The user should be able to navigate dashboard")
    public void the_user_should_be_able_to_navigate_dashboard() {
        orangeHRMHome.setDashboardMessage();
    }
    @Then("The user wants to go to PIM page")
    public void the_user_wants_to_go_to_pim_page() {
        orangeHRMHome.setPIM();
    }
    @Then("The user wants to see add employee page")
    public void the_user_wants_to_see_add_employee_page() {
        orangeHRMHome.setAddEmployee();

    }
    @Then("The user wants to add user name as {string}")
    public void the_user_wants_to_add_user_name_as(String name) {
        orangeHRMHome.setName(name);

    }
    @Then("The user wants to add last name as {string}")
    public void the_user_wants_to_add_last_name_as(String lastName) {
        orangeHRMHome.setLastName(lastName);
    }
    @Then("The user wants to save the information")
    public void the_user_wants_to_save_the_information() {
        orangeHRMHome.setSave();
    }
    @Then("The user should be able to see {string}")
    public void the_user_should_be_able_to_see(String string) {
        orangeHRMHome.setProfile(string);
    }
    @Then("The User wants to see add employee page")
    public void the_user_wants_to_see_add_employee_page(Map<String,String> dataTable) {
        orangeHRMHome.setAddEmployee();
        orangeHRMHome.setName(dataTable.get("FirstName"));
        orangeHRMHome.setLastName(dataTable.get("LastName"));
    }
    @Then("The user wants to add login details")
    public void the_user_wants_to_add_login_details(Map<String,String> dataTable) {
        orangeHRMHome.setDetailsBox();
        orangeHRMHome.setName2(dataTable.get("User Name"));
        orangeHRMHome.setPassword2(dataTable.get("Password"));
        orangeHRMHome.setRePassword(dataTable.get("Password"));
        orangeHRMHome.setStatus(dataTable.get("Status"));
    }

    @Then("The user wants to add an employee in a list way")
    public void the_user_wants_to_add_an_employee_in_a_list_way(List<List<String>> dataTable) {
            orangeHRMHome.setAddEmployee();
            orangeHRMHome.setName(dataTable.get(0).get(0));
            orangeHRMHome.setLastName(dataTable.get(0).get(1));
    }
    @Then("The user wants to add login details in a list way")
    public void the_user_wants_to_add_login_details_in_a_list_way(List<List<String>> dataTable) {
            orangeHRMHome.setDetailsBox();
            orangeHRMHome.setName2(dataTable.get(2).get(0));
            orangeHRMHome.setLastName(dataTable.get(2).get(1));

    }


    @Then("The user wants to go to Admin page")
    public void the_user_wants_to_go_to_admin_page() {
        admin.setAdminmodule();
    }
    @Then("The user wants to go to Nationalities section")
    public void the_user_wants_to_go_to_nationalities_section() {
        admin.setNationality();
    }
    @Then("The user wants to add new nationalities")
    public void the_user_wants_to_add_new_nationalities() {
        admin.setAddButton();
    }
    @Then("The user wants to add nationalities as {string}")
    public void the_user_wants_to_add_nationalities_as(String string) {
        staticWait(3);
        admin.setNationalityBox(string);
        staticWait(2);
        admin.setSavebtn();
    }

    @Given("The user wants to login Orange HRM with excel")
    public void the_user_wants_to_login_orange_hrm_with_excel() throws IOException {
       String filePath="C:\\Users\\okans\\IdeaProjects\\src\\test\\resources\\Book1.xlsx";
        FileInputStream fileInputStream = new FileInputStream(filePath);
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
        XSSFSheet sheet = workbook.getSheet("Sheet1");

        int rows=sheet.getLastRowNum();
        int cols=sheet.getRow(0).getLastCellNum();
        XSSFRow row=sheet.getRow(1);
        System.out.println(row.getCell(0));
        System.out.println(row.getCell(1));
        System.out.println("total row number"+rows);
        System.out.println("total column number"+cols);

        OrangeHRMLogin orangeHRMLogin=new OrangeHRMLogin();
        orangeHRMLogin.setDataFromExcel(row.getCell(0).toString(),row.getCell(1).toString());

    }


}
