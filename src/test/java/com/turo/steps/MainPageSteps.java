package com.turo.steps;

import com.turo.pages.MainPage;
import com.turo.utils.ConfigurationReader;
import com.turo.utils.MyDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MainPageSteps extends Base {
    MainPage mainPage = new MainPage();

    @Given("user is on landing page")
    public void userIsOnLandingPage() {
    }

    @When("verify the {string}")
    public void verifyThe(String url) {
        String actual = MyDriver.get().getCurrentUrl();
        verifyTheText(url,actual);
    }

    @And("verify the page {string}")
    public void verifyThePage(String title) {
        String actual = MyDriver.get().getTitle();
        verifyTheText(title,actual);
    }

    @Then("verify the logo")
    public void verifyTheLogo() {
        imageIsDisplayedAndEnabled(mainPage.logo);

//        Boolean ImagePresent = (Boolean) ((JavascriptExecutor) MyDriver.get()).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", mainPage.logo);
//
//        if (!ImagePresent) {
//            System.out.println("Image not displayed.");
//        } else {
//            System.out.println("Image displayed.");
//        }

    }

    @When("user enter location in where text box")
    public void userEnterLocationInWhereTextBox() {
        click(mainPage.searchBox);
        String location = "Los Angeles,CA";
//        sendKeysValue(location,mainPage.searchBox);
        mainPage.searchBox.sendKeys(location);
        waitSomeTime(1000l);
        click(mainPage.selectedLocation);
    }

    @And("user select date from and date until")
    public void userSelectDateFromAndDateUntil() {
        click(mainPage.fromDate);
        waitSomeTime(1000l);

        while (!mainPage.calendar.getText().contains("June 2021")){
            click(mainPage.nextMonthArrow);
            waitSomeTime(1000l);
        }

        List<WebElement> dates = mainPage.wholeTable.findElements(By.tagName("td"));
        for(WebElement webElement : dates){
//            waitSomeTime(1000l);
            if(webElement.getText().equals("22")){
                click(webElement);
                logger.info("start date {} selected", 22);
            }

            if(webElement.getText().equals("26")){
                click(webElement);
                logger.info("end date {} selected", 26);
                break;
            }

        }
    }

    @Then("user clicks search button")
    public void userClicksSearchButton() {
        waitSomeTime(1000l);
        click(mainPage.searchButton);
        waitSomeTime(1000l);
//        ConfigurationReader.setProperty("nextPageUrl", MyDriver.get().getCurrentUrl());
//        logger.info(ConfigurationReader.getProperty("nexPageUrl"));

    }


}
