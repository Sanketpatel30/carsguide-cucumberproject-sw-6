package au.com.carsguide.www.steps;

import au.com.carsguide.www.pages.HomePage;
import au.com.carsguide.www.pages.NewAndUsedCarSearch;
import au.com.carsguide.www.pages.UsedCarSearch;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.runner.Result;

public class BuySteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I mouse hover on “buy\\+sell” tab$")
    public void iMouseHoverOnBuySellTab() {
        new HomePage().mouseHoverToBuySellTab();
    }

    @And("^I click ‘Search Cars’ link$")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCars();
    }

    @Then("^I navigate to ‘new and used car search’ page$")
    public void iNavigateToNewAndUsedCarSearchPage() {
        Assert.assertEquals("Failed to navigate to Correct Page!!", "New & Used Car Search - carsguide", new NewAndUsedCarSearch().verifyIfNavigateToNewAndUsedCarSearchPage());
    }

    @And("^I select make “<make>”$")
    public void iSelectMakeMake() {
    }

    @And("^I select model “<model>”$")
    public void iSelectModelModel() {

    }

    @And("^I select location “<location>”$")
    public void iSelectLocationLocation() {

    }

    @And("^I select price “<price>”$")
    public void iSelectPricePrice() {

    }

    @And("^I click on Find My Next Car tab$")
    public void iClickOnFindMyNextCarTab() {

    }

    @Then("^I should see the make “<make>” in results$")
    public void iShouldSeeTheMakeMakeInResults() {
    }

    @And("^I select make \"([^\"]*)\" on new and used card search$")
    public void iSelectMakeOnNewAndUsedCardSearch(String text) {
        new NewAndUsedCarSearch().selectCarMakeFromDropDown(text);
    }

    @And("^I select model \"([^\"]*)\" on new and used card search$")
    public void iSelectModelOnNewAndUsedCardSearch(String text) {
        new NewAndUsedCarSearch().selectCarModelFromDropDown(text);
    }

    @And("^I select location \"([^\"]*)\" on new and used card search$")
    public void iSelectLocationOnNewAndUsedCardSearch(String text) {
        new NewAndUsedCarSearch().selectLocationFromDropDown(text);

    }

    @And("^I select price \"([^\"]*)\" on new and used card search$")
    public void iSelectPriceOnNewAndUsedCardSearch(String text) {
        new NewAndUsedCarSearch().selectCarPriceFromDropDown(text);
    }


    @And("^I click ‘Used’ link$")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedCars();
    }

    @Then("^I navigate to ‘Used Cars For Sale’ page$")
    public void iNavigateToUsedCarsForSalePage() {
        Assert.assertEquals("Failed to navigate to Correct Page!!", "Used Cars For Sale", new UsedCarSearch().verifyIfNavigateToNewAndUsedCarSearchPage());
    }

    @And("^I select make \"([^\"]*)\" on used card search$")
    public void iSelectMakeOnUsedCardSearch(String text) {
        new UsedCarSearch().selectCarMakeFromDropDown(text);

    }

    @And("^I select model \"([^\"]*)\" on used card search$")
    public void iSelectModelOnUsedCardSearch(String text) {
        new UsedCarSearch().selectCarModelFromDropDown(text);

    }

    @And("^I select location \"([^\"]*)\" on used card search$")
    public void iSelectLocationOnUsedCardSearch(String text) {
        new UsedCarSearch().selectLocationFromDropDown(text);
    }

    @And("^I select price \"([^\"]*)\" on used card search$")
    public void iSelectPriceOnUsedCardSearch(String text) {
        new UsedCarSearch().selectCarPriceFromDropDown(text);
    }

    
    @And("^I click on Find My Next Car tab on new and used card search$")
    public void iClickOnFindMyNextCarTabOnNewAndUsedCardSearch() {
        new NewAndUsedCarSearch().clickingOnFindMyNextCarButton();
    }

    @And("^I click on Find My Next Car tab on used card search$")
    public void iClickOnFindMyNextCarTabOnUsedCardSearch() {
        new UsedCarSearch().clickingOnFindMyNextCarButton();
    }
    

    @And("^I click ‘Find a Dealer’$")
    public void iClickFindADealer() {
        
    }

    @Then("^I navigate to ‘car-dealers’ page$")
    public void iNavigateToCarDealersPage() {
        
    }

    @And("^I should see the dealer names <dealersName> are display on page$")
    public void iShouldSeeTheDealerNamesDealersNameAreDisplayOnPage() {
    }

}
