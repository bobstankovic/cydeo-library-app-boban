package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "inputEmail")
    public WebElement email;

    @FindBy(id = "inputPassword")
    public WebElement password;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signIn;

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void login(String email, String password) {
        this.email.sendKeys(email);
        this.password.sendKeys(password);
        signIn.click();
    }
}
