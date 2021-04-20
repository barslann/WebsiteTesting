package com.turo.pages;

import com.turo.utils.MyDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage() {
        PageFactory.initElements(MyDriver.get(),this);
    }

    @FindBy(xpath = "(//span[@class=\"seo-pages-1uscmj1-StyledSpan egspqk70\"])[1]")
    public WebElement logo;

    @FindBy(xpath = "//input[@id=\"searchFormLocationTypeahead-input\"]")
    public WebElement searchBox;

    @FindBy(xpath = "//input[@id=\"searchFormRangeDateTimePicker-dateRangePicker\"]")
    public WebElement fromDate;

    @FindBy(xpath = "//input[@id=\"searchFormRangeDateTimePicker-dateRangePicker-endDate\"]")
    public WebElement untilDate;

    @FindBy(xpath = "//div[@aria-label=\"Move backward to switch to the previous month\"]")
    public WebElement previousMonthArrow;

    @FindBy(xpath = "//div[@aria-label=\"Move forward to switch to the next month\"]")
    public WebElement nextMonthArrow;

    @FindBy(xpath = "//strong[contains(text(),\"April 2021\")]")
    public WebElement currentMonth;

    @FindBy(xpath = "//div[@class='seo-pages-19ve007-SuggestionTextTitle ee6ccll1'][text()='Los Angeles, CA']")
    public WebElement selectedLocation;

    @FindBy(xpath = "(//table[@class=\"CalendarMonth_table CalendarMonth_table_1\" and @role=\"presentation\"])[1]")
    public WebElement fromDateTable;

    @FindBy(xpath = "//div[@class=\"DateRangePicker_picker DateRangePicker_picker__horizontal DateRangePicker_picker__with_header seo-pages-jonmmy\"]")
    public WebElement wholeTable;

    @FindBy(xpath = "//div[@aria-label='Calendar']")
    public WebElement calendar;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement searchButton;






}
