package com.cydeo.library.step_definition;

import com.cydeo.library.pages.LoadingPage;
import com.cydeo.library.pages.UserPage;
import com.cydeo.library.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class UsersStepDef {

    LoadingPage loadingPage = new LoadingPage();
    UserPage userPage = new UserPage();

    @Given("I click on {string} link")
    public void i_click_on_link(String string) {
        switch (string.toLowerCase()){
            case "dashboard":
                userPage.dashboardTitle.click();
                break;
            case "users":
                userPage.usersTitle.click();
                break;
            case "books":
                userPage.booksTitle.click();
                break;
        }


    }
    @Then("table should have following column names:")
    public void table_should_have_following_column_names(List<String> dataTable) {
        List<String> userTable = BrowserUtils.getElementsText(userPage.titleTable);
        Assert.assertEquals(userTable, dataTable);
    }
}
