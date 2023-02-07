package com.testing.eMAG.steps;

import com.testing.eMAG.pages.HomePage;
import com.testing.eMAG.pages.OffersPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

public class OffersSteps {

    @Autowired
    public HomePage homePage;

    @Autowired
    public OffersPage offersPage;


    @When("I click on the resealed offers")
    public void iClickOnTheResealedOffers() {
        offersPage.goToResealedOffers();
    }

    @Then("I should see the offer of the day page")
    public void iShouldSeeTheOfferOfTheDayPage() {
        Assert.assertTrue(offersPage.isDailyOffersPageOpened());
    }

    @Then("I should see the resealed offers page")
    public void iShouldSeeTheResealedOffersPage() {
        Assert.assertTrue(offersPage.isResealedOffersPageOpened());
    }

    @Then("I should see the offers page")
    public void iShouldSeeTheOffersPage() {
        Assert.assertTrue(offersPage.isOffersPageOpened());
    }
}
