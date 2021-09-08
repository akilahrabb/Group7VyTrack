package com.vytrack.base;

import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestBase {

    public TestBase(){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    public static void loginPage(){Driver.getDriver().get(ConfigurationReader.getProperty("loginPage"));}

    public static void closeDriver(){ Driver.getDriver().close();}

    @FindBy(xpath = "//input[@placeholder='Username or Email']")
    public WebElement getUsername;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement getPassword;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement getLoginButton;



}
