package com.juaracoding;

import com.juaracoding.drivers.DriverSingleton;
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

public class TestHariLiburPage {
    private static WebDriver driver;
    static ExtentTest extentTest;
    private static EventDatePage eventDatePage = new EventDatePage();
    private static HariLiburPage hariLiburPage = new HariLiburPage();

    public TestHariLiburPage() {

        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("User go to menu hari libur")
    public void user_go_to_menu_hari_libur(){
        hariLiburPage.menuHariLibur();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "User go to menu hari libur");
    }
    @When("User click button add form holiday")
    public void user_click_button_add_form_hari_libur(){
        hariLiburPage.buttonAddFormHoliday();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "User click button add form holiday");
    }
    @And("User input date holiday")
    public void user_input_date_holiday(){
        hariLiburPage.inputDateHoliday("22/12/2023");
        extentTest.log(LogStatus.PASS, "User input date holiday");
    }
    @And("User input description holiday")
    public void user_input_description_holiday() {
        hariLiburPage.inputDescriptionHoliday("Tahun Baru");
        extentTest.log(LogStatus.PASS, "User input description holiday");
    }
    @And("User click button add holiday")
    public void user_click_button_add_holiday() {
        hariLiburPage.buttonAddHoliday();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "User click button add holiday");
    }
    @Then("User get text add holiday success")
    public void user_get_text_add_holiday_success() {
        Assert.assertEquals(hariLiburPage.getTxtSuccessAddHoliday(), "Berhasil Menambahkan Hari Libur");
        extentTest.log(LogStatus.PASS, "User get text add holiday success");
    }

    //TCC.HW.020
    @Then("User click cancel form add holiday")
    public void user_click_cancel_form_add_holiday(){
        hariLiburPage.cancelButtonHoliday();
        extentTest.log(LogStatus.PASS, "User click cancel form add holiday");
    }

    //TCC.HW.022
    @And("User not input description holiday")
    public void user_not_input_description_holiday(){
        hariLiburPage.inputDescriptionHoliday("");
        extentTest.log(LogStatus.PASS, "User not input description holiday");
    }

    @Then("User get text please fill out this field")
    public void user_get_text_please_fill_out_this_field(){
        Assert.assertTrue(hariLiburPage.getTxtFailInputDateHoliday().contains("true"));
        hariLiburPage.cancelButtonHoliday();
        extentTest.log(LogStatus.PASS, "User get text please fill out this field");
    }

    //TCC.HW.023
    @And("User not input date holiday")
    public void user_not_input_date_holiday(){
        hariLiburPage.inputDateHoliday("");
        extentTest.log(LogStatus.PASS, "User not input date holiday");
    }
    @Then("User get text fail")
    public void user_get_text_fail(){
        Assert.assertTrue(hariLiburPage.getTextFail().contains("true"));
        hariLiburPage.cancelButtonHoliday();
        extentTest.log(LogStatus.PASS, "User get text fail");
    }

    //TCC.HW.024
    @When("User input invalid date holiday")
    public void user_input_invalid_date_holiday(){
        hariLiburPage.inputDateHoliday("22/12/20243");
        extentTest.log(LogStatus.PASS, "User input invalid date holiday");
    }

    @Then("User get text fail add holiday")
    public void user_get_text_fail_add_holiday(){
        Assert.assertEquals(hariLiburPage.getTxtInvalidAddHoliday(), "Gagal Menambahkan Hari Libur");
        hariLiburPage.cancelButtonHoliday();
        DriverSingleton.delay(2);
        extentTest.log(LogStatus.PASS, "User get text fail add holiday");
    }

    //TCC.HW.025
//    @Given("User go to menu edit holiday")
//    public void user_go_to_menu_edit_holiday(){
//        hariLiburPage.goToMenuEditHoliday();
//        extentTest.log(LogStatus.PASS, "User go to menu edit holiday");
//    }
//
//    @When("User input edit date holiday")
//    public void user_input_edit_date_holiday(){
//        hariLiburPage.inputEditDateHoliday("30/12/2023");
//        extentTest.log(LogStatus.PASS, "User input edit date holiday");
//    }
//    @And("User input edit description holiday")
//    public void user_input_edit_description_holiday(){
//        hariLiburPage.inputEditDescriptionHoliday("Liburan Tahun Baru");
//        extentTest.log(LogStatus.PASS, "User input edit description holiday");
//    }
//    @And("User click button save data holiday")
//    public void user_click_button_save_data_holiday(){
//        hariLiburPage.buttonSaveEditHoliday();
//        extentTest.log(LogStatus.PASS, "User click button save data holiday");
//    }
//    @Then("User get text edit data holiday success")
//    public void user_get_text_edit_data_holiday_success(){
//        Assert.assertEquals(hariLiburPage.getTxtEditSuccess(), "Berhasil Edit Hari Libur");
//        extentTest.log(LogStatus.PASS, "User get text edit data holiday success");
//    }
//
//    //TCC.HW.026
//    @Then("User click button cancel form edit holiday")
//    public void user_click_button_cancel_form_edit_holiday(){
//        hariLiburPage.cancelFormEditHoliday();
//        extentTest.log(LogStatus.PASS, "User click button cancel form edit holiday");
//    }
//
//    //TCC.HW.027
//    @Given("User click menu edit holiday")
//    public void user_click_menu_edit_holiday(){
//        hariLiburPage.menuEditHoliday();
//        extentTest.log(LogStatus.PASS, "User click menu edit holiday");
//    }
//    @When("User delete description")
//    public void user_delete_description(){
//        hariLiburPage.clearDescriptionHoliday();
//        extentTest.log(LogStatus.PASS, "User delete description");
//    }
//
//    //TCC.HW.028
//    @Then("User get text fail edit data holiday")
//    public void user_get_text_fail_edit_data_holiday(){
//        Assert.assertEquals(hariLiburPage.getTxtInvalidEditHoliday(), "Gagal Edit Hari Libur");
//        extentTest.log(LogStatus.PASS, "User get text fail edit data holiday");
//    }
//
//    //TCC.HW.029
//    @Given("User click menu delete holiday")
//    public void user_click_menu_delete_holiday(){
//        hariLiburPage.menuDeleteHoliday();
//        extentTest.log(LogStatus.PASS, "User click menu delete holiday");
//    }
//
//    @Then("User click button yes delete holiday")
//    public void user_click_button_yes_delete_holiday(){
//        hariLiburPage.yesDeleteHoliday();
//        extentTest.log(LogStatus.PASS, "User click button yes delete holiday");
//
//    }
//    @Then("User click button no delete holiday")
//    public void user_click_button_no_delete_holiday(){
//        hariLiburPage.noDeleteHoliday();
//        extentTest.log(LogStatus.PASS, "User click button no delete holiday");
//
//    }


}
