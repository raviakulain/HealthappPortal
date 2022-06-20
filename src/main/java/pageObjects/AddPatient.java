package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddPatient
{
    WebDriver driver;

    @FindBy(linkText = "Add Patient")
    public WebElement addPatientLink;

    @FindBy(linkText = "Dashboard")
    public WebElement dashboardLink;

    @FindBy(className = "heading-text")
    public WebElement addPatientCheckText;

    @FindBy(xpath = "(//*[contains(@class,'form-control')])[1]")
    public WebElement firstnameText;

    @FindBy(xpath = "(//*[contains(@class,'form-control')])[2]")
    public WebElement lastnameText;

    @FindBy(xpath = "(//*[contains(@class,'form-control')])[3]")
    public WebElement ageText;

    @FindBy(xpath = "(//*[contains(@class,'form-control')])[4]")
    public WebElement contactNumText;

    @FindBy(xpath = "(//*[contains(@class,'form-control')])[5]")
    public WebElement emergencyContNumText;

    @FindBy(xpath = "(//*[contains(@class,'form-control')])[6]")
    public WebElement emailText;

    @FindBy(xpath = "(//*[contains(@class,'form-control')])[7]")
    public WebElement genderText;

    @FindBy(xpath = "(//*[contains(@class,'form-control')])[8]")
    public WebElement dobText;

    @FindBy(xpath = "(//*[contains(@class,'form-control')])[9]")
    public WebElement registerNumText;

    @FindBy(xpath = "(//*[contains(@class,'form-control')])[10]")
    public WebElement houseNumText;

    @FindBy(xpath = "(//*[contains(@class,'form-control')])[11]")
    public  WebElement streetText;

    @FindBy(xpath = "(//*[contains(@class,'form-control')])[12]")
    public WebElement cityText;

    @FindBy(xpath = "(//*[contains(@class,'form-control')])[13]")
    public WebElement stateText;

    @FindBy(xpath = "(//*[contains(@class,'form-control')])[14]")
    public WebElement postcodeText;

    @FindBy(linkText = "Submit")
    public WebElement submitBtn;

    public void AddPatientPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickAddPatientLink()
    {
        addPatientLink.click();
    }
    public void clickDashboardLink()
    {
        dashboardLink.click();
    }
    public String getAddPatientText()
    {
        return addPatientCheckText.getText();
    }

    public void enterFirstnameText(String fn)
    {
        firstnameText.sendKeys(fn);
    }

    public void enterLastnameText(String ln)
    {
        lastnameText.sendKeys(ln);
    }

    public void enterAgeText(String age)
    {
        ageText.sendKeys(age);
    }

    public void enterContactNum(String cn)
    {
        contactNumText.sendKeys(cn);
    }

    public void enterEmergencyContactNum(String ec)
    {
        emergencyContNumText.sendKeys(ec);
    }

    public void enterEmailText(String em)
    {
        emailText.sendKeys(em);
    }

    public void enterGenderText(String g)
    {
        genderText.sendKeys(g);
    }

    public void enterDobText(String dob)
    {
        dobText.sendKeys(dob);
    }
    public void enterRegisterNumText(String regNum)
    {
        registerNumText.sendKeys(regNum);
    }
    public void enterHouseNumText(String hno)
    {
        houseNumText.sendKeys(hno);
    }
    public void enterStreetText(String st)
    {
        streetText.sendKeys(st);
    }
    public void enterCityText(String cty)
    {
        cityText.sendKeys(cty);
    }
    public void enterStateText(String state)
    {
        streetText.sendKeys(state);
    }
    public void enterPostcodeText(String po)
    {
        postcodeText.sendKeys(po);
    }
    public void clickSubmitBtn()
    {
        submitBtn.click();
    }
}
