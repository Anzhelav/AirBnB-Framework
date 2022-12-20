package com.automation.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomesPage extends BasePage{

    @FindBy (xpath = "//div[text() = 'Ready to Airbnb it?']")
    WebElement readyToAirBnbIt;

    public void verifyHomesPage() {
        Assert.assertTrue("Homes page is not displayed", readyToAirBnbIt.isDisplayed());
    }
}
