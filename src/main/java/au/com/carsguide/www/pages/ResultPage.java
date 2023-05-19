package au.com.carsguide.www.pages;

import au.com.carsguide.www.utility.Utility;
import gherkin.formatter.model.Result;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(Result.class.getName());

    public void Result() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[@class='listing-search-title']")
    WebElement pageHeader;

    public String verifyResult(){
        log.info("Getting a Result for Verification : " + pageHeader.toString());
        return getTextFromElement(pageHeader);
    }
}
