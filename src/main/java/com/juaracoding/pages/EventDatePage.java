package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventDatePage {
    private WebDriver driver;

    public EventDatePage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    //locator
    @FindBy(xpath = "//input[@id='email']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement buttonLogin;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/div/button[2]/svg/g/line[2]")
    private WebElement menuHadir;
    @FindBy(xpath = "//p[text()=\"Management\"]")
    private WebElement menuManagement;
    @FindBy(xpath = "//p[contains(@class, 'MuiTypography-body1') and text()='Event Date']")
    private WebElement menuEventDate;
    @FindBy(xpath = "//button[normalize-space()='Tambahkan']")
    private WebElement addTableEventDate;
    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement namaAcara;
    @FindBy(xpath = "//*[@id=\"date\"]")
    private WebElement tanggalAcara;
    @FindBy(xpath = "//*[@id=\"start_date\"]")
    private WebElement tanggalMulai;
    @FindBy(xpath = "//*[@id=\"start_end\"]")
    private WebElement tanggalAkhir;
    @FindBy(xpath = "//button[@type='submit']")
    //
    private WebElement buttonAdd;
    @FindBy(xpath = "//button[contains(@class, 'MuiButton-text') and text()='Batal']")
    private WebElement buttonCancel;
    @FindBy(xpath = "//h6[contains(@class, 'MuiTypography-h6') and text()='Hari Kartini']")
    private WebElement txtAddSuccess;
    @FindBy(xpath = "//div[@class=\"MuiSnackbarContent-message css-1w0ym84\" and text()=\"Gagal Menambahkan Event Date\"]")
    private WebElement txtFailAddEventDate;
    @FindBy(xpath = "//div[@class=\"MuiSnackbarContent-message css-1w0ym84\" and text()=\"Berhasil Menambahkan Event Date\"]")
    private WebElement txtSuccessAddEvent;

    //locator update edit & delete
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[1]/div/div/div/div[2]/div/table/tbody/tr[1]/td[5]/div/div/button")
    private WebElement verticalButton;
    @FindBy(xpath = "//li[contains(@class, 'MuiButtonBase-root') and contains(@class, 'MuiMenuItem-root') and contains(@class, 'css-1fh5cnl') and text() = 'Edit']")
    private WebElement menuEdit;
    @FindBy(xpath = "//*[@id=\"name\"]")
    private WebElement nameEdit;
    @FindBy(xpath = "//*[@id=\"date\"]")
    private WebElement dateEdit;
    @FindBy(xpath = "//button[text()='Simpan']")
    private WebElement simpanEdit;
    @FindBy(xpath = "//button[@type='button' and text()='Batal']")
    private WebElement batalEdit;
    @FindBy(xpath = "//h6[normalize-space()='Peringatan Hari Kartini']")
    private WebElement txtSuccessEditEventDate;
    @FindBy(xpath = "//li[contains(text(), 'Delete')]")
    private WebElement menuDelete;
    @FindBy(xpath = "//button[contains(@class, 'MuiButton-containedPrimary') and @type='submit' and text()='Ya']")
    private WebElement yesDeleteEvent;
    @FindBy(xpath = "//button[contains(@class, 'MuiButton-root') and contains(@class, 'MuiButton-textSecondary') and contains(@class, 'MuiButton-sizeMedium') and contains(@class, 'css-18ozr2e') and text()='Tidak']")
    private WebElement noDeleteEvent;
    @FindBy(xpath = "//*[@id=\"mui-2\"]")
    private WebElement showPage;
    @FindBy(xpath = "//*[@id=\"mui-1\"]/li[2]")
    private WebElement showPageTwo;
    @FindBy(xpath = "//p[@class='MuiTablePagination-displayedRows css-kim0d']")
    private WebElement txtShowPage;

    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/div/button[3]/div/div[2]/svg")
    private WebElement buttonProfile;
    @FindBy(xpath = "//*[@id=\"profile-menu\"]/div[3]/ul/div/button[2]")
    private WebElement buttonlogout;

    public void logout(){
        buttonProfile.click();
        buttonlogout.click();
    }


    //method
    public void loginForm() {
        email.sendKeys("admin@hadir.com");
        password.sendKeys("admin@hadir");
        buttonLogin.click();
    }

    public void goToMenuManagement(){
        menuManagement.click();
    }
    public void buttonAddTableEvent(){
        addTableEventDate.click();
    }
    public void inputEventName(String namaAcara){
        this.namaAcara.sendKeys(namaAcara);
    }
    public void inputEventDate(String tanggalAcara){
        this.tanggalAcara.sendKeys(tanggalAcara);
    }
    public void inputStartDate(String tanggalMulai){
        this.tanggalMulai.sendKeys(tanggalMulai);
    }
    public void inputEndDate(String tanggalAkhir){
        this.tanggalAkhir.sendKeys(tanggalAkhir);
    }
    public void clickButtonAddEvent(){
        buttonAdd.click();
        DriverSingleton.delay(2);
    }
    public void goToMenuEventDate(){
        menuManagement.click();
        menuEventDate.click();
    }
    public void closeFormEventDate(){
        addTableEventDate.click();
        buttonCancel.click();
    }
    public void cancelForm(){
        buttonCancel.click();
    }
    public void addEventDate(String namaAcara, String tanggalAcara, String tanggalMulai, String tanggalAkhir){
        addTableEventDate.click();
        this.namaAcara.sendKeys(namaAcara);
        this.tanggalAcara.sendKeys(tanggalAcara);
        this.tanggalMulai.sendKeys(tanggalMulai);
        this.tanggalAkhir.sendKeys(tanggalAkhir);
        buttonAdd.click();

    }

    //edit
    public void goToMenuEdit(){
        verticalButton.click();
        menuEdit.click();
    }
    public void clickMenuEdit(){
        menuEdit.click();
    }
    public void clearNameEdit(){
        nameEdit.sendKeys(Keys.CONTROL+"a");
        nameEdit.sendKeys(Keys.DELETE);
    }
    public void clearDateEdit(){
        dateEdit.sendKeys(Keys.CONTROL+"a");
        dateEdit.sendKeys(Keys.DELETE);
    }
    public void buttonSaveEdit(){
        simpanEdit.click();
    }

    public void cancelFormEdit(){
        batalEdit.click();
    }
    public void editEventDate(String nameEdit, String dateEdit){
        this.nameEdit.sendKeys(nameEdit);
        this.dateEdit.sendKeys(dateEdit);
        simpanEdit.click();

    }

    //delete
    public void clickMenuDelete(){
        menuDelete.click();
    }
    public void cancelDeleteEvent(){
        noDeleteEvent.click();
    }
    public void deleteEvent(){
        yesDeleteEvent.click();
    }
    public void yesDeleteEventDate(){
        yesDeleteEvent.click();
    }
    public void noDeleteEventDate(){
        noDeleteEvent.click();
    }

    //show page
    public void showPage(){
        showPage.click();
    }
    public void showPageTwo(){
        showPageTwo.click();
    }

    //validasi
    public String getTxtAddSuccess(){

        return txtAddSuccess.getText();
    }
    public String getTxtSuccessEditEventDate(){

        return txtSuccessEditEventDate.getText();
    }
    public String getTxtFailAddEventDate(){
        return txtFailAddEventDate.getText();
    }
    public String getTxtShowPage(){
        return txtShowPage.getText();
    }

    public String getTxtFailInputNameEvent(){
        return namaAcara.getAttribute("required");

    }

}
