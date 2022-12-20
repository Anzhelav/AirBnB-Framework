package com.automation.stepdef;

import com.automation.pages.HomesPage;
import io.cucumber.java.en.Then;

public class HomesPageSteps {
    HomesPage homesPage = new HomesPage();

    @Then("verify homes page is displayed")
    public void verify_homes_page_is_displayed() {
        homesPage.verifyHomesPage();
    }

}
