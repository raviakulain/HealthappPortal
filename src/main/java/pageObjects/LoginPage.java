package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
    WebDriver driver;
    @FindBy(linkText = "Log In")
    public WebElement loginLink;

    @FindBy(className = "heading-text")
    public WebElement loginCheckText;

    @FindBy(xpath = "(//*[contains(@class,'control')])[1]")
    public WebElement emailText;

    @FindBy(xpath = "(//*[contains(@class,'control')])[2]")
    public WebElement passwordText;

    @FindBy(className = "btn-md")
    public WebElement loginButton;

    @FindBy(className = "Register Here")
    public WebElement registerHereLink;

    @FindBy(className = "Click To Reset")
    public WebElement forgotPwdLink;

    @FindBy(className = "text-white")
    public WebElement logoutLink;

    @FindBy(xpath = "//*[contains(text(),'login successfull')]")
    public WebElement loginConfText;

    public LoginPage(WebDriver driver)
    {
        this.driver= driver;
        PageFactory.initElements(driver,this);
    }

    public void clickLoginLink()
    {
        loginLink.click();
    }

    public void enterEmail(String email)
    {
        emailText.sendKeys(email);
    }
    public void enterPassword(String pwd)
    {
        passwordText.sendKeys(pwd);
    }
    public void loginButtonLink()
    {
        loginButton.click();
    }
    public void notyetRegisteredLink()
    {
        registerHereLink.click();
    }
    public void clickToResetLink()
    {
        forgotPwdLink.click();
    }
    public String getLoginText()
    {
       return loginCheckText.getText();
    }
    public boolean verifyLogout()
    {
        return logoutLink.isDisplayed();
    }
    public String getLoginConfText()
    {
        return loginConfText.getText();
    }
}
