package com.cydeo.library.step_definition;

import com.cydeo.library.pages.BasePage;
import com.cydeo.library.pages.LoadingPage;
import com.cydeo.library.pages.LoginPage;
import com.cydeo.library.utilities.ConfigurationReader;
import com.cydeo.library.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();
    BasePage basePage = new BasePage();
    LoadingPage loadingPage = new LoadingPage();

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("qa2_url"));
    }
    @When("I login as a librarian")
    public void i_login_as_a_librarian() {
        loginPage.login(ConfigurationReader.getProperty("lib22_user"), ConfigurationReader.getProperty("lib22_pass"));

    }
    @Then("dashboard should be displayed")
    public void dashboard_should_be_displayed() {
        //Assert.assertTrue(basePage.libraryBrandLink.isDisplayed());

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains("dashboard"));
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("dashboard"));
    }

    @When("I login as a student")
    public void i_login_as_a_student() {
        loginPage.login(ConfigurationReader.getProperty("student55_user"), ConfigurationReader.getProperty("student55_pass"));
    }
    @Then("books should be displayed")
    public void books_should_be_displayed() {

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.urlContains("books"));
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("books"));
    }

    @When("I login using {string} and {string}")
    public void iLoginUsingAnd(String username, String password) {
        loginPage.login(username,password);
    }

    @Then("account holder name should be {string}")
    public void accountHolderNameShouldBe(String name) {
        Assert.assertEquals(basePage.name.getText(), name);
    }

    @When("I enter username {string}")
    public void i_enter_username(String string) {
       loginPage.email.sendKeys(string);
    }
    @When("I enter password {string}")
    public void i_enter_password(String string) {
        loginPage.password.sendKeys(string);
    }
    @When("click the sign in button")
    public void click_the_sign_in_button() {
        loginPage.signIn.click();
    }
    @When("there should be {int} users")
    public void there_should_be_users(Integer numUsers) {
        Assert.assertEquals(loadingPage.userCountFontLight.getText(), numUsers+"");
    }
}
