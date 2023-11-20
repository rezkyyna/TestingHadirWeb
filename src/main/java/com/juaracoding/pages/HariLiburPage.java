package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HariLiburPage {
    private WebDriver driver;
    private EventDatePage eventDatePage;

    public HariLiburPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//p[text()=\"Management\"]")
    private WebElement clickMenuManagement;
    @FindBy(xpath = "//p[contains(@class, 'MuiTypography-root') and contains(@class, 'MuiTypography-body1') and contains(@class, 'css-aqx7sf') and text() = 'Hari Libur']")
    private WebElement menuHoliday;
    @FindBy(xpath = "//button[normalize-space()='Tambahkan']")
    private WebElement buttonTambahkan;
    @FindBy(xpath = "//div[@class=\"MuiInputBase-root MuiOutlinedInput-root MuiInputBase-colorPrimary MuiInputBase-fullWidth MuiInputBase-formControl MuiInputBase-sizeSmall css-1qa4sqw\"]/input[@id=\"hdate\"]")
    private WebElement inputDateHoliday;
    @FindBy(xpath = "//*[@id=\"type\"]")
    private WebElement typeHoliday;
    @FindBy(xpath = "//*[@id=\"remark\"]")
    private WebElement inputDescriptionHoliday;
    @FindBy(xpath = "//button[text()=\"Tambah\"]")
    private WebElement buttonTambah;
    @FindBy(xpath = "//button[text()='Batal']")
    private WebElement buttonCancelFormHoliday;
    @FindBy(xpath = "//div[@class=\"MuiSnackbarContent-message css-1w0ym84\" and text()=\"Berhasil Menambahkan Hari Libur\"]")
    private WebElement txtSuccessAddHoliday;
    @FindBy(xpath = "//div[@class=\"MuiSnackbarContent-message css-1w0ym84\"]")
    private WebElement txtInvalidAddHoliday;

    //edit data holiday
    @FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]//*[name()='svg']")
    private WebElement buttonVertical;
    @FindBy(xpath = "//div[@id='card-actions-menu']/div[3]/ul/li")
    private WebElement editHolidayMenu;
    @FindBy(xpath = "//li[text()='Delete' and contains(@class, 'css-1fh5cnl')]")
    private WebElement menuDeleteHoliday;
    @FindBy(xpath = "//button[contains(@class, 'MuiButton-containedPrimary') and contains(@class, 'MuiButton-sizeMedium') and contains(@class, 'MuiButton-root') and contains(@class, 'MuiButton-contained') and contains(@class, 'css-4075ia') and @tabindex='0' and @type='submit' and text()='Simpan']")
    private WebElement saveEditHoliday;
    @FindBy(xpath = "//div[@class=\"MuiSnackbarContent-message css-1w0ym84\"]")
    private WebElement txtEditSuccess;

    @FindBy(xpath = "//button[text() = 'Batal']")
    private WebElement cancelFormEdit;
    @FindBy(xpath = "//div[@class=\"MuiPaper-root MuiPaper-elevation MuiPaper-elevation6 MuiSnackbarContent-root css-c352pn\"]")
    private WebElement txtInvalidEditHoliday;
    @FindBy(xpath = "//button[text()=\"Ya\"]")
    private WebElement yesDeleteHoliday;
    @FindBy(xpath = "//button[text()='Tidak']")
    private WebElement noDeleteHoliday;
    @FindBy(xpath = "//div[@class=\"MuiSnackbarContent-message css-1w0ym84\"]")
    private WebElement txtSuccessDeleteHoliday;

    //public void selectTypeHoliday(){
    //Select dateHoliday =new Select(driver.findElement(By.xpath("//*[@id=\"type\"]")));
    // dateHoliday.selectByVisibleText("Cuti Bersama");
    //}


    //method add hari libur
    public void menuHariLibur(){
        menuHoliday.click();
    }

    public void buttonAddFormHoliday(){
        buttonTambahkan.click();
    }
    public void inputDateHoliday(String inputDateHoliday){
        this.inputDateHoliday.sendKeys(inputDateHoliday);
    }
    public void inputDescriptionHoliday(String inputDescriptionHoliday){
        this.inputDescriptionHoliday.sendKeys(inputDescriptionHoliday);
    }
    public void buttonAddHoliday(){
        buttonTambah.click();
    }
    public void cancelButtonHoliday(){
        buttonCancelFormHoliday.click();
    }
    public void addHoliday(String inputDateHoliday, String inputDescriptionHoliday){
        buttonTambahkan.click();
        this.inputDateHoliday.sendKeys(inputDateHoliday);
        this.inputDescriptionHoliday.sendKeys(inputDescriptionHoliday);
        buttonTambah.click();
    }

    public void clearDateHoliday(){
        inputDateHoliday.sendKeys(Keys.CONTROL+"a");
        inputDateHoliday.sendKeys(Keys.DELETE);
    }
    public void clearDescriptionHoliday(){
        inputDescriptionHoliday.sendKeys(Keys.CONTROL+"a");
        inputDescriptionHoliday.sendKeys(Keys.DELETE);
    }
    public void cancelFormHoliday(){
        buttonTambahkan.click();
        buttonCancelFormHoliday.click();
    }


    public void emptyFormAddHoliday(){
        buttonTambahkan.click();
        DriverSingleton.delay(1);
        buttonTambah.click();
        DriverSingleton.delay(2);
        buttonCancelFormHoliday.click();
    }

    //edit


    public void goToMenuEditHoliday(){
        buttonVertical.click();
        DriverSingleton.delay(1);
        editHolidayMenu.click();
    }
    public void menuEditHoliday(){
        editHolidayMenu.click();
    }
    public void inputEditDateHoliday(String inputDateHoliday){
        this.inputDateHoliday.sendKeys(inputDateHoliday);
    }
    public void inputEditDescriptionHoliday(String inputDescriptionHoliday){
        this.inputDescriptionHoliday.sendKeys(inputDescriptionHoliday);
    }
    public void buttonSaveEditHoliday(){
        saveEditHoliday.click();
    }
    public void editHoliday(String inputDate, String inputDescription){
        editHolidayMenu.click();
        this.inputDateHoliday.sendKeys(inputDate);
        inputDescriptionHoliday.sendKeys(Keys.CONTROL+"a");
        inputDescriptionHoliday.sendKeys(Keys.DELETE);
        this.inputDescriptionHoliday.sendKeys(inputDescription);
        saveEditHoliday.click();

    }
    public void cancelFormEditHoliday(){
        buttonVertical.click();
        DriverSingleton.delay(2);
        editHolidayMenu.click();
        cancelFormEdit.click();
    }

    public void menuDeleteHoliday(){
        menuDeleteHoliday.click();
    }
    public void yesDeleteHoliday(){
        yesDeleteHoliday.click();
    }
    public void noDeleteHoliday(){
        noDeleteHoliday.click();
    }
    public void deleteHoliday(){
        buttonVertical.click();
        menuDeleteHoliday.click();
        yesDeleteHoliday.click();
    }
    public void cancelDeleteHoliday(){
        buttonVertical.click();
        menuDeleteHoliday.click();
        noDeleteHoliday.click();
    }

    //validasi
    public String getTxtSuccessAddHoliday(){
        return txtSuccessAddHoliday.getText();
    }

    public String getTxtInvalidAddHoliday(){

        return txtInvalidAddHoliday.getText();
    }
    public String getTxtEditSuccess(){
        return txtEditSuccess.getText();
    }

    public String getTxtInvalidEditHoliday(){
        return txtInvalidAddHoliday.getText();
    }
    public String getTxtSuccessDeleteHoliday(){
        return txtSuccessDeleteHoliday.getText();
    }

    public String getTxtFailInputDateHoliday(){
        return inputDateHoliday.getAttribute("required");

    }
    public String getTextFail(){
        return inputDescriptionHoliday.getAttribute("required");

    }

}
