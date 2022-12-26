package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage extends BasePage{
    @FindBy(xpath="(//span[@aria-label='Holiday'])[1]")
    WebElement holidayDropDownMenu;

    @FindBy()
    WebElement christmasCardOption;

    @FindBy(xpath ="//a[text()='SHOP CARDS']")
    WebElement shopCardsBtn;

    @FindBy(xpath="//img[contains(@alt,'memorable')]")
    WebElement makeItMemorableBanner;

    @FindBy (xpath="//img[@alt='Close']")
    WebElement newUserPopUp;

    @FindBy(xpath="//a[contains(@data-linkname,'HOMEOFFICE')]")
    WebElement homeOfficeOption;

    @FindBy(xpath="//img[@alt = 'Personalized note pads']")
    WebElement notePadIcon;

    @FindBy(xpath = "//img[@alt='Take Note']")
    WebElement firstItemNotepad;

    @FindBy(xpath="//a[@class='uig-button uig-primary-button personalize-button']")
    WebElement personalizeBtn;

    @FindBy(id="stringField-full_name")
    WebElement inputNotepadNameField;

    @FindBy(id="personalizeFormModalButton1")
    WebElement doneBtn;

    @FindBy(id="addToCartLink")
    WebElement addToCartBtn;

    @FindBy(id="warning0")
    WebElement poUpEmptyNotepadMessage;

    @FindBy(xpath="//img[@alt = 'Create Your Own']")
    WebElement createYourOwnCategory;

    @FindBy(xpath = "//a[@data-linkname = 'product:choosestyle|personalize']")
    WebElement personalizeButton;

    @FindBy(xpath = "//a[contains(text(), 'LET’S GO')]")
    WebElement letsGoBtn;

    @FindBy(xpath = "//button[contains(text(), 'CONTINUE')]")
    WebElement continueBtn;

    @FindBy(xpath = " //img[contains(@alt, 'Photo books')]")
    WebElement clickOnTurnYourMemoriesIntoPhotoBooksLink;





    public void clickOnChristmasCardOptionFromHolidayDropdown() {
        Actions action = new Actions(driver);
        action.moveToElement(holidayDropDownMenu).moveToElement(christmasCardOption).click(christmasCardOption);
    }


    public void clickOnShopCardsBtn() {
        shopCardsBtn.click();
    }

    public void verifyCardsStationerySectionIsDisplayed(){
        Assert.assertTrue(makeItMemorableBanner.isDisplayed(),"not displayed");
    }

    public void closePopUp() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(newUserPopUp));
        newUserPopUp.click();
    }

    public void clickOnHomeOfficeOption() {
        homeOfficeOption.click();
    }

    public void clickOnNotepadsIcon() {
        notePadIcon.click();
    }

    public void clickOnFirstItem() {
        firstItemNotepad.click();
    }

    public void clickOnPersonalizeBtn() {
        personalizeButton.click();
    }

    public void enterNameOfPersonalizedNotepad() {
        inputNotepadNameField.sendKeys("A");
    }

    public void clickOnDoneBtn() {
        doneBtn.click();
    }

    public void pressOnAddToCartBtn() {
        addToCartBtn.click();
    }

    public void verifyPopUpEmptyNotepadMessageDisplayed() {
        Assert.assertTrue(poUpEmptyNotepadMessage.isDisplayed(),"Empty notepad message is not displayed");
    }

    public void clickOnCreateYourOwnCategory() {
        createYourOwnCategory.click();
    }

    public void clickOnPersonalizeButton() {
        personalizeButton.click();
    }

    public void clickOnLetsGoBtn() {
        letsGoBtn.click();
    }

    public void clickOnContinueBtn() {
        continueBtn.click();
    }

    public void clickOnTurnYourMemoriesIntoPhotoBooksOption() {
        clickOnTurnYourMemoriesIntoPhotoBooksLink.click();
    }
}
