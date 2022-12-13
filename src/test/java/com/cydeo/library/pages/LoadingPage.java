package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

// page_url = https://library2.cydeo.com/#dashboard
public class LoadingPage extends BasePage{
    @FindBy(id = "user_count")
    public WebElement userCountFontLight;

    @FindBy(xpath = "//div[@class='col-md-6 col-lg-4']")
    public List<WebElement> libraryModule;


    public LoadingPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}