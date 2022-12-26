package com.automation.tests;

import org.testng.annotations.Test;

public class ShopCardsBtnTest extends BaseTest{
    @Test
    public  void verifyShopCardsButton(){
        homePage.closePopUp();
        homePage.clickOnShopCardsBtn();
        homePage.verifyCardsStationerySectionIsDisplayed();
    }
}
