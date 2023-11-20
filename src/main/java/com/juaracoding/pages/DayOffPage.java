package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DayOffPage {
    private WebDriver driver;

    public DayOffPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//p[@class=\"MuiTypography-root MuiTypography-body1 css-aqx7sf\" and text()=\"Day Off\"]")
    private WebElement menuDayOff;
    @FindBy(xpath = " //*[@id=\"__next\"]/div/header/div/p")
    private WebElement txtHeaderDayOff;


    public void goToMenuDayOff(){
        menuDayOff.click();
    }

    public String getTxtHeaderDayOff(){
        return txtHeaderDayOff.getText();
    }
}
