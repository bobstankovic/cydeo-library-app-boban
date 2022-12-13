package com.cydeo.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class UserPage extends BasePage{

    @FindBy(xpath = "//table//th")
    public List<WebElement> titleTable;
}
