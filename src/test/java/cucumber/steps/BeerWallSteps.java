/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2013 hybris AG
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of hybris
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with hybris.
 */
package cucumber.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class BeerWallSteps {
    private int numBottles;
    private int numTakeDown;
    @Given("^I have (\\d+) bottles of beer on the wall$")
    public void iHaveBottlesOfBeerOnTheWall(int arg1) throws Throwable {
        this.numBottles = arg1;
    }

    @When("^I take (\\d+) down and pass it around$")
    public void iTakeDownAndPassItAround(int arg1) throws Throwable {
        numTakeDown = arg1;
    }

    @Then("^I should have (\\d+) bottles of beer on the wall$")
    public void iShouldHaveBottlesOfBeerOnTheWall(int arg1) throws Throwable {
        assertEquals(arg1, numBottles-numTakeDown);
    }
}
