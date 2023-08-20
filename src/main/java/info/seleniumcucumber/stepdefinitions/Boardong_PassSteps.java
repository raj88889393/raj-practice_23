package info.seleniumcucumber.stepdefinitions;

import cucumber.api.java.en.Then;
import info.seleniumcucumber.methods.BaseTest;

public class Boardong_PassSteps implements BaseTest {

    @Then("User should get successful message")
    public void userShouldGetSuccessfulMessage(String link)
    {
        navigationObj.navigateTo(link);
    }



}
g