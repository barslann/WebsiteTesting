package com.turo.steps;

import com.turo.pages.AdvancedSearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdvancedSearchPageSteps extends Base {
    private final AdvancedSearchPage advancedSearchPage = new AdvancedSearchPage();

    @Given("user is in advanced search page")
    public void userIsInAdvancedSearchPage() {

    }

    @When("user clicks more filters and selects all stars host")
    public void userClicksMoreFiltersAndSelectsAllStarsHost() {
        click(advancedSearchPage.moreFiltersButton);
        waitSomeTime(1000l);
        click(advancedSearchPage.allStarHostCheck);
        waitSomeTime(1000l);
    }


    @And("user selects vehicle type and selects {string}")
    public void userSelectsVehicleTypeAndSelects(String selectedVehicle) {
        scrollDown(advancedSearchPage.vehicleMake);
        waitSomeTime(1000l);
        click(advancedSearchPage.vehicleMake);
        scrollDown(advancedSearchPage.selectedVehicle);
        click(advancedSearchPage.selectedVehicle);
    }

    @And("user adjusts vehicle years range")
    public void userAdjustsVehicleYearsRange() {
    }

    @And("user selects the transmission and click on view results")
    public void userSelectsTheTransmissionAndClickOnViewResults() {
    }

    @Then("user click close button")
    public void userClickCloseButton() {
    }
}