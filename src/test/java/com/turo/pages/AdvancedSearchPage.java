package com.turo.pages;

import com.turo.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvancedSearchPage {

    public AdvancedSearchPage() {
        PageFactory.initElements(MyDriver.get(),this);
    }

    @FindBy(xpath = "(//button[@class=\"buttonSchumi buttonSchumi--medium searchFilterToggle\"])[6]")
    public WebElement moreFiltersButton;

    @FindBy(xpath = "//span[@class=\"styledCheckbox-label\"][contains(text(),'Top-rated')]")
    public WebElement allStarHostCheck;

    @FindBy(xpath = "//select[@id='makes']")
    public WebElement vehicleMake;

    @FindBy(xpath = "//option[@value='Mercedes-Benz']")
    public WebElement selectedVehicle;

}
