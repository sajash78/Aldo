package org.example.StepDefinationPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.Homepage;
import org.example.PageObjectPackage.SortbyPage;

public class SortbyPageStep {
 SortbyPage sortbyPage = new SortbyPage();

    @Given("^user in on page of the loafer$")
    public void user_in_on_page_of_the_loafer() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user clicks on price\\(high to low\\)$")
    public void user_clicks_on_price_high_to_low() throws Throwable {
        sortbyPage.relevancePrice();
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^user should able to see all products by the order of prices \\(high to low\\)$")
    public void user_should_able_to_see_all_products_by_the_order_of_prices_high_to_low() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }


}
