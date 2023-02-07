package com.testing.eMAG.steps;

import com.testing.eMAG.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class HomeSteps {

    @Autowired
    private HomePage homePage;

    @Given("I have navigated to eMAG home page")
    public void iHaveNavigateToEMAGHomePage() {
        System.out.format("Thread ID - %2d from feature file.\n", Thread.currentThread().getId());
        homePage.validateHomePage();
    }


    @And("I accept site cookies")
    public void iAcceptSiteCookies() throws InterruptedException {
        homePage.closePopUps();
    }

//    @And("^I search for the following TV ([^\"]*)$")
    @And("I search for the following TV {word}")
    public void iSearchForTheFollowingTVManufacture(String manufacture) {
        homePage.search(manufacture);
    }

//    @And("^I search for the following Phone ([^\"]*)$")
    @And("I search for the following Phone {word}")
    public void iSearchForTheFollowingPhoneManufacture(String manufacture) {
        homePage.search(manufacture);
    }

    @And("I go to the eMAG offers")
    public void iGoToTheEMAGOffers() {
        homePage.goToOffers();
    }

}
