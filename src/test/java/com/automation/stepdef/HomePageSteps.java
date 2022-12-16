package com.automation.stepdef;

import com.automation.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
    HomePage homePage = new HomePage();
    @Given("user opens website")
    public void user_opens_website() {
        homePage.openWebsite();
    }
    @When("user clicks on search icon")
    public void user_clicks_on_search_icon() {
        homePage.clickOnSearchIcon();
    }
    @When("user inputs {string} field")
    public void user_inputs_field(String where) {
     homePage.inputWhereField(where);

    }
    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        homePage.clickOnSearchBtn();

    }
    @Then("verify search results are displayed")
    public void verify_search_results_are_displayed() {
        homePage.verifySearchResults();
    }


    @When("user clicks on add guests button")
    public void userClicksOnAddGuestsButton() throws InterruptedException {
        homePage.clickOnAddGuests();

    }

    @Then("verify search results for two guests are displayed")
    public void verifySearchResultsForTwoGuestsAreDisplayed() throws InterruptedException {
        homePage.verifySearchResultsForNumberOfGuestsAreDisplayed();
    }

    @And("user clicks on plus button two times")
    public void userClicksOnPlusButtonTwoTimes() {
        homePage.clickOnPlusBtn();
    }

    @And("user click on search button")
    public void userClickOnSearchButton() throws InterruptedException {
        homePage.userClicksOnSearchBtn();
    }
    @When("user closes the pop up")
    public void userClosesThePopUp() {
        homePage.closePopupMessage();
    }
}
