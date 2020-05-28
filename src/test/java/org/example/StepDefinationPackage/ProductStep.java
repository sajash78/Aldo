package org.example.StepDefinationPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.Productpage;

public class ProductStep {
       Productpage productpage = new Productpage();

    @Given("^user is on result page of loafer with the price \\(high to low\\) order$")
    public void user_is_on_result_page_of_loafer_with_the_price_high_to_low_order() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user clicks on the product Drorelian$")
    public void user_clicks_on_the_product_Drorelian() throws Throwable {
        productpage.shoe();
       // productpage.addToBasket();
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^user should be able to see product Drorelian  'add to bag' page$")
    public void user_should_be_able_to_see_product_Drorelian_add_to_bag_page() throws Throwable {
        //productpage.addToBasket();
        // Write code here that turns the phrase above into concrete actions
    }

}
