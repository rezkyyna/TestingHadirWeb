package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
import com.juaracoding.pages.DayOffPage;
import com.juaracoding.pages.EventDatePage;
import com.juaracoding.pages.LaporanSemuaPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestLaporanSemuaPage {
    private static WebDriver driver;
    static ExtentTest extentTest;
    private static EventDatePage eventDatePage = new EventDatePage();
    private static LaporanSemuaPage laporanSemuaPage = new LaporanSemuaPage();

    public TestLaporanSemuaPage() {

        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    //TCC.HW.032
    @Given("User go to menu laporan semua")
    public void user_go_menu_laporan_semua(){
        laporanSemuaPage.goToMenuSemua();
        extentTest.log(LogStatus.PASS, "User go to menu laporan semua");
    }
    @When("User input name")
    public void user_input_name(){
        laporanSemuaPage.searchInputName("Rezky");
        extentTest.log(LogStatus.PASS, "User input name");
    }
    @And("User click button search")
    public void user_click_button_save(){
        laporanSemuaPage.buttonSearch();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "User click button search");
    }
    @Then("User get data name")
    public void user_get_data_name(){
        Assert.assertEquals(laporanSemuaPage.getTxtSearchByName(), "Rezky Karunia");
        extentTest.log(LogStatus.PASS, "User get data name");
    }

    //TCC.HW.033
    @Given("User click button filter")
    public void user_click_button_filter(){
        laporanSemuaPage.buttonFilter();
        extentTest.log(LogStatus.PASS, "User click button filter");
    }
    @When("User input job department")
        public void user_input_job_department() {
        laporanSemuaPage.inputJobDepartment("BCA");
        extentTest.log(LogStatus.PASS, "User input job department");
    }
    @Then("User click button terapkan")
    public void user_click_button_terapkan(){
        laporanSemuaPage.buttonTerapkan();
        extentTest.log(LogStatus.PASS, "User click button terapkan");
    }

    //TCC.HW.034
    @Given("User click icon calendar")
    public void user_click_icon_calendar(){
        laporanSemuaPage.buttonCalendar();
        extentTest.log(LogStatus.PASS, "User click icon calendar");
    }
    @When("User click start date")
    public void user_click_start_date(){
        laporanSemuaPage.startDate();
        extentTest.log(LogStatus.PASS, "User click start date");
    }
    @And("User click end date")
    public void user_click_end_date(){
        laporanSemuaPage.endDate();
        extentTest.log(LogStatus.PASS, "User click end date");
    }
    @And("User click button save calendar")
    public void user_click_button_save_calendar(){
        laporanSemuaPage.buttonSaveCalendar();
        extentTest.log(LogStatus.PASS, "User click button save calendar");
    }
    @Then("User get data calendar")
    public void user_get_data_calendar(){
        Assert.assertEquals(laporanSemuaPage.getTxtSearchByCalendar(), "13 Nov 2023");
        extentTest.log(LogStatus.PASS, "User get data calendar");
    }

    //TCC.HW.035
    @Given("User click button reset")
    public void user_click_button_reset(){
        laporanSemuaPage.buttonReset();
        extentTest.log(LogStatus.PASS, "User click button reset");
    }
    @Then("User get text success reset calendar")
    public void user_get_text_success_reset_calendar(){
        Assert.assertEquals(laporanSemuaPage.txtHeaderSemua(), "Semua");
        extentTest.log(LogStatus.PASS, "User get text success reset calendar");
    }

    //TCC.HW.036
    @When("User input invalid name")
    public void user_input_invalid_name(){
        laporanSemuaPage.searchInputName("Rezki");
        extentTest.log(LogStatus.PASS, "User input invalid name");
    }
    @Then("User did not get data")
    public void user_did_not_get_data(){
        Assert.assertEquals(laporanSemuaPage.getTxtInvalidSearchByName(), "0-0 of 0");
        extentTest.log(LogStatus.PASS, "User did not get data");
    }


}
