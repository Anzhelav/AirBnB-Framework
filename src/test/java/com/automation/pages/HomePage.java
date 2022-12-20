package com.automation.pages;

import com.automation.utils.ConfigReader;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends BasePage{
   // @FindBy (xpath = "//div[@class = 's1qcpybl dir dir-ltr']")
    @FindBy (xpath="//div[text()='Anywhere']")
    WebElement anywhereBtn;

    @FindBy (xpath="//input[@class = 'ivycze5 dir dir-ltr']")
    WebElement whereField;

    @FindBy(xpath="//span[@class = '_kaq6tx']")
    WebElement searchBtn;

    @FindBy (xpath = "//a[@rel = 'noopener noreferrer nofollow']")
    WebElement searchResult;

    @FindBy (xpath = "(//div[text() = 'Add guests'])[1]")
    WebElement addGuestsBtn;

    @FindBy (xpath="//button[@data-testid='stepper-adults-increase-button']")
    WebElement plusGuestsBtn;

    @FindBy(xpath = "//div[text()='2 guests']")
    WebElement numberOfGuests;

    @FindBy(xpath="/html/body/div[10]/section/div/div/div[2]/div/div[1]/button")
    WebElement closePopupM;

    @FindBy(xpath="//span[text() = 'Lakefront']")
    WebElement lakefrontIcon;

    @FindBy(xpath="//a[@rel = 'noopener noreferrer nofollow'][1]")
    WebElement lakefrontOption;

    public void openWebsite() {
        driver.get(ConfigReader.getProperty("app.baseurl"));
    }

    public void clickOnSearchBtn() {
        searchBtn.click();
    }

    public void inputWhereField(String where) {
        whereField.sendKeys(where+ Keys.ENTER);

    }

    public void verifySearchResults() {
        Assert.assertTrue("results are not displayed", searchResult.isDisplayed());
    }

    public void clickOnSearchIcon() {
        anywhereBtn.click();
    }

    public void clickOnAddGuests() throws InterruptedException {
        Thread.sleep(300);
        addGuestsBtn.click();

    }

    public void clickOnPlusBtn() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(plusGuestsBtn));

            for(int i=1;i<=2;i++){
                plusGuestsBtn.click();
            }

    }

    public void verifySearchResultsForNumberOfGuestsAreDisplayed() throws InterruptedException {
        Thread.sleep(300);
        Assert.assertTrue("search for guests is not correct", numberOfGuests.isDisplayed());


    }

    public void userClicksOnSearchBtn() throws InterruptedException {
        Thread.sleep(300);
        searchBtn.click();

    }

    public void closePopupMessage() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(closePopupM));
        closePopupM.click();
    }

    public void clickOnLakefrontIcon() {
        lakefrontIcon.click();
    }

    public void verifyLakefrontOptionsAreDisplayed() {
        Assert.assertTrue("Lakefront option is not displayed", lakefrontOption.isDisplayed());
    }
}
