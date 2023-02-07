package com.testing.eMAG.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import java.time.Duration;

import static org.testng.AssertJUnit.assertEquals;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class HomePage extends BasePage {

    @Autowired
    private WebDriver webDriver;

    @FindBy(how = How.ID, using = "searchboxTrigger")
    private WebElement searchBar;

    @FindBy(how = How.LINK_TEXT, using = "Ofertele eMAG")
    private WebElement lnkEmagOffers;

    @FindBy(how = How.XPATH, using = "//a[@id='navbar-aux-dropdown']")
    private WebElement dropDownEmagOffers;

    @FindBy(how = How.XPATH, using = "//button[@class='btn btn-primary js-accept gtm_h76e8zjgoo btn-block']")
    private WebElement btnAcceptCookies;


    public HomePage validateHomePage() {
        assertEquals("https://www.emag.ro/", webDriver.getCurrentUrl());
        return this;
    }

    public HomePage closePopUps() {
        btnAcceptCookies.click();
        return this;
    }

    public HomePage search(String value) {
        searchBar.sendKeys(value);
        searchBar.sendKeys(Keys.ENTER);
        return this;
    }

    public OffersPage goToOffers() {
        dropDownEmagOffers.click();
        new WebDriverWait(webDriver, Duration.ofSeconds(3)).until(ExpectedConditions.elementToBeClickable(lnkEmagOffers));
        lnkEmagOffers.click();
        return new OffersPage();
    }
}
