package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage
{
    WebDriver driver;
    @FindBy(linkText = "Register")
    public WebElement registerLink;

    @FindBy(className = "heading-text")
    public WebElement registerCheckText;

    @FindBy(xpath = "(//*[contains(@class,'form-control')])[1]")
    public WebElement firstnameText;

    @FindBy (xpath = "(//*[contains(@class,'form-control')])[2]")
    public WebElement lastnameText;

    @FindBy (xpath = "(//*[contains(@class,'form-control')])[3]")
    public WebElement emailText;

    @FindBy(xpath = "(//*[contains(@class,'form-control')])[4]")
    public WebElement passwordText;

    @FindBy(linkText = "Register")
    public WebElement registerButton;

    @FindBy(linkText = " Login")
    public WebElement loginLink;

    @FindBy (className = "Toastify__toast-body")
    public WebElement toastMessage;

    public RegisterPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

   public void enterFirstname(String fn)
   {
       firstnameText.sendKeys(fn);
   }

   public void enterLastname(String ln)
   {
       lastnameText.sendKeys(ln);
   }

   public void enterEmail(String em)
   {
       emailText.sendKeys(em);
   }
   public void enterPassword(String pwd)
   {
       passwordText.sendKeys(pwd);
   }

   public void clickRegisterBtn()
   {
       registerButton.click();
   }

   public void clickLoginLink()
   {
       loginLink.click();
   }
    public String getToastMessage()
    {
        return toastMessage.getText();

    }
    public void clickRegisterLink()
    {
        registerLink.click();
    }

    public String getRegisterText()
    {
        return registerCheckText.getText();
    }
}
