package info.seleniumcucumber.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import info.seleniumcucumber.methods.BaseTest;
import org.junit.Assert;

public class Boardong_PassSteps implements BaseTest {

    @Then("User should get successful message")
    public void userShouldGetSuccessfulMessage(String link)
    {
        navigationObj.navigateTo(link);
    }


    @Then("user should see the message {string} for successful web check in")
    public void userShouldSeeTheMessageForSuccessfulWebCheckIn(String header) throws {
        Assert.assertTrue(this.);

    }
}
g