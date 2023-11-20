package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.EventDatePage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.testng.Assert.assertTrue;

public class TestEventDatePage {
    private static WebDriver driver;
    static ExtentTest extentTest;
    private static EventDatePage eventDatePage = new EventDatePage();

    public TestEventDatePage() {

        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    //TCC.HW.001

    @Given("User go to menu event date")
    public void user_go_to_menu_event_date(){
        eventDatePage.goToMenuEventDate();
        extentTest.log(LogStatus.PASS, "User go to menu event date");
    }
    @When("User click button add event")
    public void user_click_button_add_event(){
        eventDatePage.buttonAddTableEvent();
        extentTest.log(LogStatus.PASS, "User click button add event");
    }
    @And("User input name event")
    public void user_input_name_event() {
        eventDatePage.inputEventName("Hari Kartini");
        extentTest.log(LogStatus.PASS, "User input name event");
    }
    @And("User input date event")
    public void user_input_date_event() {
        DriverSingleton.delay(1);
        eventDatePage.inputEventDate("21");
        extentTest.log(LogStatus.PASS, "User input date event");
    }
    @And("User input start date event")
    public void user_input_start_date_event() {
        DriverSingleton.delay(1);
        eventDatePage.inputStartDate("21/4/2021");
        extentTest.log(LogStatus.PASS, "User input start date event");
    }
    @And("User input end date event")
    public void user_input_end_date_event() {
        DriverSingleton.delay(1);
        eventDatePage.inputEndDate("22/4/2023");
        extentTest.log(LogStatus.PASS, "User input end date event");
    }
    @And("User click button add")
    public void user_click_button_add(){
        DriverSingleton.delay(1);
        eventDatePage.clickButtonAddEvent();
        extentTest.log(LogStatus.PASS, "User click button add");
    }
    @Then("User get text add event date success")
    public void user_get_text_add_event_date_success(){
        Assert.assertEquals(eventDatePage.getTxtAddSuccess(),"Hari Kartini");
        extentTest.log(LogStatus.PASS, "User get text add event date success");
    }

    //TCC.HW.002
    @Then("User click button cancel form add")
    public void user_click_button_cancel_form_add(){
        eventDatePage.cancelForm();
        extentTest.log(LogStatus.PASS, "User click button cancel form add");
    }

    //TCC.HW.003
    @When("User not input name event")
    public void user_not_input_name_event(){
        eventDatePage.inputEventName("");
        extentTest.log(LogStatus.PASS, "User not input name event");
    }
    @Then("User get text Please fill out this field")
    public void user_get_text_please_fill_out_this_field(){
        Assert.assertTrue(eventDatePage.getTxtFailInputNameEvent().contains("true"));
        eventDatePage.cancelForm();
        extentTest.log(LogStatus.PASS, "true");
    }

    //TCC.HW.004
    @And("User not input date event")
    public void user_not_input_date_event(){
        eventDatePage.inputEventDate("");
        extentTest.log(LogStatus.PASS, "User not input date event");
    }

    //TCC.HW.005
    @And("User not input start date event")
    public void user_not_input_start_date_event(){
        eventDatePage.inputStartDate("");
        extentTest.log(LogStatus.PASS, "User not input start date event");
    }

    //TCC.HW.006
    @And("User not input end date event")
    public void user_not_input_end_date_event(){
        eventDatePage.inputEndDate("");
        extentTest.log(LogStatus.PASS, "User not input end date event");
    }

    //TC.HW.008
    @And("User input wrong start date event")
    public void user_input_wrong_start_date_event(){
        eventDatePage.inputStartDate("21/4/20321");
        extentTest.log(LogStatus.PASS, "User input wrong start date event");
    }
    @Then("User get text fail add event date")
    public void user_get_text_fail_add_event_date(){
        Assert.assertEquals(eventDatePage.getTxtFailAddEventDate(), "Gagal Menambahkan Event Date");
       eventDatePage.cancelForm();
        extentTest.log(LogStatus.PASS, "User get text fail add event date");
    }

    //TCC.HW.009
    @And("User input wrong end date event")
    public void user_input_wrong_end_date_event(){
        eventDatePage.inputEndDate("22/4/20321");
        extentTest.log(LogStatus.PASS, "User input wrong end date event");
    }

    //TCC.HW.010

    //TCC.HW.011
    @And("User input invalid start date event")
    public void user_input_invalid_start_date_event(){
        eventDatePage.inputStartDate("22/4/2023");
        extentTest.log(LogStatus.PASS, "User input invalid start date event");
    }
    @And("User input invalid end date event")
    public void user_input_invalid_end_date_event(){
        eventDatePage.inputEndDate("21/4/2023");
        extentTest.log(LogStatus.PASS, "User input invalid end date event");
    }
    @Then("User get text add event date fail")
    public void user_get_text_add_event_date_fail(){
        Assert.assertEquals(eventDatePage.getTxtAddSuccess(),"");
        extentTest.log(LogStatus.PASS, "User get text add event date fail");
    }

    //TCC.HW.012
    @Given("User go to menu edit")
    public void user_go_to_menu_edit(){
        eventDatePage.goToMenuEdit();
        extentTest.log(LogStatus.PASS, "User go to menu edit");
    }
    @When("User clear name event")
    public void user_clear_name_event(){
        eventDatePage.clearNameEdit();
        extentTest.log(LogStatus.PASS, "User clear name event");
    }
    @And("User clear date event")
    public void user_clear_date_event(){
        eventDatePage.clearDateEdit();
        extentTest.log(LogStatus.PASS, "User clear date event");
    }
    @And("user input edit name event")
    public void user_input_edit_name_event(){
        eventDatePage.inputEventName("Peringatan Hari Kartini");
        extentTest.log(LogStatus.PASS, "user input edit name event");
    }
    @And("User input edit date event")
    public void user_input_edit_date_event(){
        eventDatePage.inputEventDate("22");
        extentTest.log(LogStatus.PASS, "User input edit date event");
    }
    @And("User click button save")
    public void user_click_button_save(){
        eventDatePage.buttonSaveEdit();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "User click button save");
    }
    @Then("User get text edit event date success")
    public void user_get_text_edit_event_date_success(){
        Assert.assertEquals(eventDatePage.getTxtSuccessEditEventDate(), "Peringatan Hari Kartini");
        DriverSingleton.delay(1);
        extentTest.log(LogStatus.PASS, "User get text edit event date success");
    }

    //TCC.HW.013
    @Then("User click button cancel form edit")
    public void user_click_button_cancel_form_edit(){
        eventDatePage.cancelFormEdit();
        extentTest.log(LogStatus.PASS, "User click button cancel form edit");
    }

    //TCC.HW.014
    @Given("User click menu edit")
    public void user_click_menu_edit(){
        eventDatePage.clickMenuEdit();
        extentTest.log(LogStatus.PASS, "User click menu edit");
    }

    @And("User not input edit date Event")
    public void user_not_input_edit_date_event(){
        eventDatePage.inputEventDate("");
        extentTest.log(LogStatus.PASS, "User not input edit date Event");
    }

    //TCC.HW.016
    @Given("User click menu delete")
    public void user_click_menu_delete(){
        eventDatePage.clickMenuDelete();
        DriverSingleton.delay(1);
        extentTest.log(LogStatus.PASS, "User click menu delete");
    }

    @Then("User click button no")
    public void user_click_button_no(){
        eventDatePage.noDeleteEventDate();
        extentTest.log(LogStatus.PASS, "User click button no");
    }

    //TCC.HW.017
    @Then("User click button yes")
    public void user_click_button_yes(){
        eventDatePage.yesDeleteEventDate();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "User click button yes");
    }

    //TCC.HW.018
    @Given("User click button show page")
    public void user_click_button_show_page(){
        eventDatePage.showPage();
        extentTest.log(LogStatus.PASS, "User click button show page");
    }
    @When("User click button show page two")
    public void user_click_button_show_page_two(){
        eventDatePage.showPageTwo();
        extentTest.log(LogStatus.PASS, "User click button show page two");
    }
    @Then("User get data event date")
    public void user_get_data_event_date(){
        Assert.assertEquals(eventDatePage.getTxtShowPage(),"1-10 of 10");
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "User get data event date");
    }

}

