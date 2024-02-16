package com.example.steps;

import com.example.BaseTest;
import io.appium.java_client.MobileBy;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class NavigationMenuSteps extends BaseTest {
  @When("user go to list menu")
  public void userGoToListMenu() {
    navigationMenu.clickHamburgerBtn();
    navigationMenu.clickListMenu();
  }

  @And("user do long press on list menu")
  public void userDoLongPressOnListMenu() {
    listPage.longPress();
  }

  @And("user do tap multiple time on text")
  public void userDoTapMultipleTimeOnText() {
    listPage.clickXTime(MobileBy.xpath("//android.widget.TextView[@resource-id=\"com.isl.simpleapp:id/text_view\" and @text=\"List ke-61\"]"),5);
  }

  @And("user click arithmetic operation addition")
  public void userClickArithmeticOperationAddition() {
    calculatorPage.clickBtnAddition();
  }

  @And("user successfuly addition")
  public void userSuccessfulyAddition() {
    String titleText = calculatorPage.getResult();
    Assertions.assertEquals("Hasil : 10", titleText);
  }

  @And("user click arithmetic operation division")
  public void userClickArithmeticOperationDivision() {
    calculatorPage.clickBtnDivison();
  }

  @And("user successfuly division")
  public void userSuccessfulyDivision() {
    String titleText = calculatorPage.getResult();
    Assertions.assertEquals("Hasil : 5", titleText);
  }

  @And("user click arithmetic operation multiplication")
  public void userClickArithmeticOperationMultiplication() {
    calculatorPage.clickBtnMultiplication();
  }

  @And("user successfuly multiplication")
  public void userSuccessfulyMultiplication() {
    String titleText = calculatorPage.getResult();
    Assertions.assertEquals("Hasil : 4", titleText);
  }
}
