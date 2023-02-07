package com.testing.eMAG.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class OffersPage extends BasePage {

    @Autowired
    private WebDriver webDriver;

    @FindBy(how = How.XPATH, using = "/html/body/div[3]/div[2]/div/div/div[2]/section[3]/div/div/div/a/div/div/img")
    private WebElement imgDailyOffers;

    @FindBy(how = How.XPATH, using = "//img[@alt='Resigilate']")
    private WebElement imgResealedOffers;

    public void goToDailyOffers() {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", imgDailyOffers);
        imgDailyOffers.click();
    }

    public void goToResealedOffers() {
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView(true);", imgResealedOffers);
        imgResealedOffers.click();
    }

    public boolean isOffersPageOpened() {
        String url = webDriver.getCurrentUrl();
        return url.contains("ofertele-emag");
    }

    public boolean isDailyOffersPageOpened() {
        String url = webDriver.getCurrentUrl();
        return url.contains("oferta-zilei");
    }

    public boolean isResealedOffersPageOpened() {
        String title = webDriver.getTitle();
        return title.contains("Produse Resigilate");
    }
}
