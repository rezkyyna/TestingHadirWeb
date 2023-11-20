package com.juaracoding;

import com.juaracoding.pages.DayOffPage;
import com.juaracoding.pages.EventDatePage;
import com.juaracoding.pages.HariLiburPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestDayOffPage {
    private static WebDriver driver;
    static ExtentTest extentTest;
    private static EventDatePage eventDatePage = new EventDatePage();
    private static DayOffPage dayOffPage = new DayOffPage();

    public TestDayOffPage() {

        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User enter URL Hadir")
    public void user_enter_url_hadir() {

        driver.get(Constants.URL);
        extentTest.log(LogStatus.PASS, "User enter URL Hadir");
    }
    @When("User login")
    public void user_login(){
        eventDatePage.loginForm();
        extentTest.log(LogStatus.PASS, "User login");
    }
    @And("User go to menu management")
    public void user_go_to_menu_management(){
        eventDatePage.goToMenuManagement();
        extentTest.log(LogStatus.PASS, "User go to menu management");
    }

    @And("User go to menu day off")
    public void user_go_to_menu_day_off(){
        dayOffPage.goToMenuDayOff();
        extentTest.log(LogStatus.PASS, "User go to menu day off");
    }
    @Then("User get text data of day off")
    public void user_get_text_data_of_day_off(){
        Assert.assertEquals(dayOffPage.getTxtHeaderDayOff(), "Day Off");
        extentTest.log(LogStatus.PASS, "User get text data of day off");
    }
}
