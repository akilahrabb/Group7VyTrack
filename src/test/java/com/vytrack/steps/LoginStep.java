package com.vytrack.steps;

import com.vytrack.base.TestBase;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStep extends TestBase{

    @Given("User is on the VyTrack login page")
    public void user_is_on_the_vy_track_login_page() {
        loginPage();
    }

    @When("User enters correct {string} and {string}")
    public void user_enters_correct_and(String string, String string2) throws NullPointerException{

        string = ConfigurationReader.getProperty("userLogin");
        string2 = ConfigurationReader.getProperty("password");

        getUsername.sendKeys(string);
        getPassword.sendKeys(string2);

    }

    @When("User clicks Log In button")
    public void user_clicks_log_in_button() {
        getLoginButton.click();
    }

    @Then("User will be on the VyTrack homepage")
    public void user_will_be_on_the_vy_track_homepage() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Dashboard";
        Assert.assertEquals("Login page is verified", actualTitle, expectedTitle);
        closeDriver();
    }
}
