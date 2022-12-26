package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage{

    @FindBy(id = "signInButton")
    WebElement signInBtn;

    public void verifyLoginpage() {
        Assert.assertTrue(signInBtn.isDisplayed(),"login page is not displayed");
    }
}
