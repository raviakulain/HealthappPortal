package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage
{
    WebDriver driver;
   @FindBy(linkText = "Home")                      //webElements/locators
    public WebElement homeLink;
   @FindBy(linkText = "Register")
    public WebElement registerLink;
   @FindBy(linkText = "Log In")
    public WebElement loginLink;

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void clickHomeLink()
    {
        homeLink.click();
    }
    public void clickRegisterLink()                       //Actions
    {
        registerLink.click();
    }
    public void clickLoginLink()
    {
        loginLink.click();
    }

}
