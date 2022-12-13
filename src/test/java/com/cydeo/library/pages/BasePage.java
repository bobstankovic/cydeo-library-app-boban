package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class=\"navbar-brand\"]")
    public WebElement libraryBrandLink;

    @FindBy(xpath = "//*[text() = 'Dashboard']")
    public WebElement dashboardTitle;

    @FindBy(xpath = "//*[text() = 'Users']")
    public WebElement usersTitle;

    @FindBy(xpath = "//*[text() = 'Books']")
    public WebElement booksTitle;

    @FindBy(xpath = "//a[@id='navbarDropdown']/span")
    public WebElement name;


}
