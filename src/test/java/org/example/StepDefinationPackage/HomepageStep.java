package org.example.StepDefinationPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.Homepage;

public class HomepageStep {
    Homepage homepage = new Homepage();
    @Given("^user is on the home page of aldo$")
    public void user_is_on_the_home_page_of_aldo() throws Throwable {
        Thread.sleep(3000); homepage.homePageUrl();
        // Write code here that turns the phrase above into concrete actions
    }

    @When("^user brings the mouse cursor onto men and click on sub elemennt-loafers$")
    public void user_brings_the_mouse_cursor_onto_men_and_click_on_sub_elemennt_loafers() throws Throwable {
        homepage.loaferMethod();
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^user should be able to see the result page\\.$")
    public void user_should_be_able_to_see_the_result_page() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }


}
