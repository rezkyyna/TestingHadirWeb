package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LaporanSemuaPage {
    private WebDriver driver;

    public LaporanSemuaPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//p[contains(@class, 'MuiTypography-root MuiTypography-body1 css-1ub5lza') and text()='Laporan']")
    private WebElement menuLaporan;
    @FindBy(xpath = "//p[text()='Semua']")
    private WebElement menuSemua;
    @FindBy(xpath = "//input[@id='search']")
    private WebElement inputSearch;
    @FindBy(xpath = "//button[text()=\"Search\"]")
    private WebElement buttonSearch;
    @FindBy(xpath = "//button[normalize-space()='Reset']")
    private WebElement buttonReset;
    @FindBy(xpath = "//div[@class='MuiGrid-root MuiGrid-item MuiGrid-grid-xs-12 MuiGrid-grid-md-7 MuiGrid-grid-lg-8 css-kw2xn2']//div[1]//div[1]//div[1]//button[1]//*[name()='svg']")
    private WebElement buttonCalendar;
    @FindBy(xpath = "//span[contains(text(),'10')]")
    private WebElement startDate;
    @FindBy(xpath = "//span[contains(text(),'13')]")
    private WebElement endDate;
    @FindBy(xpath = "//button[normalize-space()='save']")
    private WebElement buttonSaveCalendar;
    @FindBy(xpath = "//button[normalize-space()='cancel']")
    private WebElement buttonCancelCalendar;
    @FindBy(xpath = "//button[@class='MuiButtonBase-root MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium MuiButton-root MuiButton-contained MuiButton-containedSecondary MuiButton-sizeMedium MuiButton-containedSizeMedium css-1k0lhp1']//*[name()='svg']")
    private WebElement buttonFilter;
    @FindBy(xpath = "//*[@id=\"job_departement\"]")
    private WebElement inputJobDepartment;
    @FindBy(xpath = "//button[text()=\"Terapkan\"]")
    private WebElement buttonTerapkan;
    @FindBy(xpath = "//button[text()='Batal']")
    private WebElement buttonBatalFilter;
    @FindBy(xpath = "//h6[normalize-space()='Rezky Karunia']")
    private WebElement txtSearchByName;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div/div[1]/div/div[2]/div/div[1]/div/table/tbody/tr[1]/td[4]/h6[1]")
    private WebElement txtSearchByCalendar;
    @FindBy(xpath = "//button[@class='rdrDay rdrDayHovered']//span[contains(text(),'7')]")
    private WebElement invalidStartDate;
    @FindBy(xpath = "//button[@class='rdrDay rdrDayHovered']//span[contains(text(),'8')]")
    private WebElement invalidEndDate;
    @FindBy(xpath = "//p[@class='MuiTablePagination-displayedRows css-kim0d']")
    private WebElement txtInvalidDate;

    @FindBy(xpath = "//p[@class='MuiTablePagination-displayedRows css-kim0d']")
    private WebElement txtInvalidSearchByName;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/header/div/p")
    private WebElement txtHeaderSemua;

    //method

    public void goToMenuSemua(){
        menuLaporan.click();
        menuSemua.click();
    }
    public void buttonCalendar(){
        buttonCalendar.click();
    }
    public void startDate(){
        startDate.click();
    }
    public void endDate(){
        endDate.click();
    }
    public void buttonSaveCalendar(){
        buttonSaveCalendar.click();
    }
    public void buttonSearch(){
        buttonSearch.click();
    }
    public void searchInputName(String inputSearch){
        this.inputSearch.sendKeys(inputSearch);
    }

    public void buttonFilter(){
        buttonFilter.click();
    }
    public void enterInputFilter(){
        inputJobDepartment.sendKeys(Keys.ENTER);
        buttonTerapkan.click();
    }
    public void buttonReset(){
        buttonReset.click();
    }

    public void buttonTerapkan(){
        buttonTerapkan.click();
    }
    public void resetButtonCalendar(){
        buttonReset.click();
        buttonCalendar.click();
        startDate.click();
        endDate.click();
        buttonSaveCalendar.click();
        DriverSingleton.delay(2);
        buttonReset.click();
    }

    //method awal
    public void inputJobDepartment( String inputJobDepartment){
        this.inputJobDepartment.sendKeys(inputJobDepartment);
    }
    public void searchFilter(String inputJobDepartment){
        buttonFilter.click();
        this.inputJobDepartment.sendKeys(inputJobDepartment);
        DriverSingleton.delay(3);
    }
    public void invalidDateCalendar(){
        buttonReset.click();
        DriverSingleton.delay(2);
        buttonCalendar.click();
        DriverSingleton.delay(1);
        invalidStartDate.click();
        invalidEndDate.click();
        buttonSaveCalendar.click();
        buttonSearch.click();
        DriverSingleton.delay(3);
    }



    public void inputJobDepartment() {
        //inputJobDepartment.sendKeys("BCA");
        Select inputJobDepartment = new Select(driver.findElement(By.xpath("//*[@id=\"job_departement\"]")));
        DriverSingleton.delay(2);
        inputJobDepartment.selectByVisibleText("BCA");
        buttonTerapkan.click();
    }

    //validasi
    public String txtHeaderSemua(){
        return txtHeaderSemua.getText();
    }
    public String getTxtSearchByName(){
        return txtSearchByName.getText();
    }
    public String getTxtSearchByCalendar(){
        return txtSearchByCalendar.getText();
    }
    public String getTxtInvalidDateCalendar(){
        return txtInvalidDate.getText();
    }
    public String getTxtInvalidSearchByName(){
        return txtInvalidSearchByName.getText();
    }









}
