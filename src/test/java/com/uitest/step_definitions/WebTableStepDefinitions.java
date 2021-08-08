package com.uitest.step_definitions;

import com.uitest.pages.WebTablePage;
import com.uitest.utilities.ConfigurationReader;
import com.uitest.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class WebTableStepDefinitions {

    @Given("navigate to the homepage")
    public void navigate_to_the_homepage() {
        System.out.println("I open browser and navigate to Practice Homepage");
        String url = ConfigurationReader.get("url");
        Driver.get().get(url); // navigating to the webpage
    }

    @When("verify that Web Table Examples headers names and order are following")
    public void verify_that_Web_Table_Examples_headers_names_and_order_are_following(List<String> expectedHeadersList) {
        WebTablePage webTablePage = new WebTablePage();
        Assert.assertTrue(webTablePage.checkWebTableHeaderNamesAndOrders(expectedHeadersList));
    }

    @When("sum the Amount Column")
    public void sum_the_Amount_Column() {
        WebTablePage webTablePage = new WebTablePage();
        int sumOfAmount = webTablePage.sumOfFixedTableAmounts(webTablePage.fixedTableAmounts);
    }

    @Then("It should be same with the amount of Total Amount Collected")
    public void it_should_be_same_with_the_amount_of_Total_Amount_Collected() {
        WebTablePage webTablePage = new WebTablePage();
        int sumOfAmount = webTablePage.sumOfFixedTableAmounts(webTablePage.fixedTableAmounts);
        int totalAmount = webTablePage.getTheAmountFromTotalAmountText();
        Assert.assertEquals(sumOfAmount, totalAmount);
    }




}
