package com.automation.tests;

import org.testng.annotations.Test;

public class EmptyNotepadMessageTest extends BaseTest{

    @Test
    public void verifyPopUpEmptyNotepadMessage(){
        homePage.closePopUp();
        homePage.clickOnHomeOfficeOption();
        homePage.clickOnNotepadsIcon();
        homePage.clickOnFirstItem();
        homePage.clickOnPersonalizeBtn();
        homePage.enterNameOfPersonalizedNotepad();
        homePage.clickOnDoneBtn();
        homePage.pressOnAddToCartBtn();
        homePage.verifyPopUpEmptyNotepadMessageDisplayed();



    }
}
