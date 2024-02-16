package com.example.steps;

import static org.assertj.core.api.Assertions.assertThat;

import com.example.BaseTest;
import com.example.app.Calculator;
import com.example.app.pages.CalculatorPage;
import com.google.common.base.Predicates;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.hamcrest.Matchers;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.WebDriver;

public class MathsStepDefinitions extends BaseTest {

    int a = 0;
    int b = 0;
    int total = 0;

    Calculator calculator = new Calculator();

    @Given("a is {int}")
    public void givenAIs(int value) {
        a = value;
    }

    @Given("b is {int}")
    public void givenBIs(int value) {
        b = value;
    }

    @When("I add a and b")
    public void iAddAAndB() {
        total = calculator.add(a,b);
    }

    @Then("the total should be {int}")
    public void theTotalShouldBe(int expectedTotal) {
        assertThat(total).isEqualTo(expectedTotal);
    }

    @When("user on to calculator page")
    public void userOnToCalculatorPage() {
        String titleText = calculatorPage.getTitle();
        Assertions.assertEquals("Calculator", titleText);
        boolean isDisplayed = calculatorPage.checkHamburgerBtnAppear();
        Assertions.assertTrue(isDisplayed);
        MatcherAssert.assertThat(isDisplayed, Matchers.equalTo(true));
    }

    @And("user input Angka Satu as  {string}")
    public void userInputAngkaSatuAs(String angkaSatu) {
        calculatorPage.inputFirstValue(angkaSatu);
    }

    @And("user input Angka Dua {string}")
    public void userInputAngkaDua(String angkaDua) {
        calculatorPage.inputSecondValue(angkaDua);
    }

    @And("user click dropdown")
    public void userClickDropdown() {
        calculatorPage.clickBtnDropDown();
    }

    @And("user click arithmetic operation subtraction")
    public void userClickArithmeticOperationSubtraction() {
        calculatorPage.clickBtnSubtraction();
    }

    @Then("user click button equal")
    public void userClickButtonEqual() {
        calculatorPage.clickBtnEqual();
    }

    @And("user successfuly subtraction")
    public void userSuccessfulySubtraction() {
        String titleText = calculatorPage.getResult();
        Assertions.assertEquals("Hasil : 10", titleText);
    }

}
