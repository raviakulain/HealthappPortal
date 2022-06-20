import base.BasePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;

import static base.BasePage.loginPage;
import static utils.DriverFactory.driver;
import static utils.DriverFactory.prop;

public class StepDefinitions
{
    WebDriverWait wait;
    String actualLoginText;
    String wrongPasswordMsg;
    String actualRegisterText;
    String actualHomePageTitle;
    String actualToastMsg;
    String actualAddPatientText;

    //LoginPage
    @Given("i am on the HealthCare app home page")
    public void i_am_on_the_health_care_app_home_page()
    {
        BasePage.driverUtils.navigateToUrl(prop.getProperty("url"));
    }
    @Then("i will be navigated to home page of HealthCare app")
    public void iWillBeNavigatedToHomePageOfHealthCareApp()
    {
        actualHomePageTitle=BasePage.driverUtils.getPageTitle();
        Assertions.assertEquals(prop.getProperty("homePageExpectedTitle"),actualHomePageTitle);
    }
    @When("i click on login link on the HealthCare app")
    public void iClickOnLoginLinkOnTheHealthCareApp()
    {
        loginPage.clickLoginLink();
    }
    @Then("i should see login header")
    public void i_should_see_login_header()
    {
        actualLoginText = loginPage.getLoginText();
        Assertions.assertEquals(prop.getProperty("expectedLoginText"),actualLoginText);
    }
    @When("i login with <email>,<password>")
    public void i_login_with_email_password(io.cucumber.datatable.DataTable dataTable)
    {
     loginPage.enterEmail(dataTable.cell(1,0));
     loginPage.enterPassword(dataTable.cell(1,1));
     loginPage.loginButtonLink();
    }
    @Then("i should be logged in successfully and should see login message as {string}")
    public void i_should_be_logged_in_successfully_and_should_see_login_message_as(String string)
    {
       Assertions.assertTrue(loginPage.verifyLogout(),"logout link is displayed");
    }

    @Then("i should not be logged in successfully and should see login message as {string}")
    public void i_should_not_be_logged_in_successfully_and_should_see_login_message_as(String string)
    {
       loginPage.loginButtonLink();

        wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOf(BasePage.loginPage.getLoginConfText()));

        String actualLoginConfMsg = loginPage.getLoginText();
        Assertions.assertEquals(prop.getProperty("expectedLoginConfMsg"),actualLoginConfMsg);

    //wrongPasswordMsg = loginPage.
   // Assertions.assertEquals(prop.getProperty("wrongPasswordMsg"),wrongPasswordMsg);
    }

    @When("i navigates from login to the Register page")
    public void i_navigates_from_login_to_the_register_page()
    {
     loginPage.notyetRegisteredLink();
    }

    //RegisterPage

    @When("i click register link on the HealthCare app")
    public void iClickRegisterLinkOnTheHealthCareApp()
    {
        BasePage.registerPage.clickRegisterLink();
    }

    @Then("i should see the Register header")
    public void iShouldSeeTheRegisterHeader()
    {
       actualRegisterText= BasePage.registerPage.getRegisterText();
       Assertions.assertEquals(prop.getProperty("expectedRegisterText"),actualRegisterText);
    }
    @When("i enter <First Name>,<Last Name>,<Email> and <Password>")
    public void iEnterFirstNameLastNameEmailPassword(io.cucumber.datatable.DataTable dataTable)
    {
    BasePage.registerPage.enterFirstname(dataTable.cell(1,0));
    BasePage.registerPage.enterLastname(dataTable.cell(1,1));
    BasePage.registerPage.enterEmail(dataTable.cell(1,2));
    BasePage.registerPage.enterPassword(dataTable.cell(1,3));
    BasePage.registerPage.clickRegisterBtn();
    }
    @Then("i should be registered successfully")
    public void iShouldBeRegisteredSuccessfully()
    {
    Assertions.assertTrue(loginPage.verifyLogout());
    }
    @Then("i should see an error message stating alphanumeric password is required")
    public void iShouldSeeAnErrorMessageStatingAlphanumericPasswordIsRequired()
    {
        actualToastMsg = BasePage.registerPage.getToastMessage();
        Assertions.assertEquals(prop.getProperty("expectedAlphanumericPwdMsg"),actualToastMsg);
    }

    @When("i clicks on register button")
    public void iClicksOnRegisterButton()
    {
        BasePage.registerPage.clickRegisterBtn();
    }
    @Then("i should see an error message stating that mandatory fields are missing")
    public void iShouldSeeAnErrorMessageStatingThatMandatoryFieldsAreMissing()
    {
        actualToastMsg = BasePage.registerPage.getToastMessage();
        Assertions.assertEquals(prop.getProperty("mandatoryFieldsMsg"),actualToastMsg);
    }

    @When("i navigates to the login page from register page")
    public void iNavigatesToTheLoginPageFromRegisterPage()
    {
     BasePage.registerPage.clickRegisterLink();
    }

    //AddPatientPage
    @Given("i logged into HealthCare app")
    public void iLoggedIntoHealthCareApp()
    {
        BasePage.driverUtils.navigateToUrl(prop.getProperty("url"));
    }

    @When("i navigated to Add Patient page")
    public void iNavigatedToAddPatientPage()
    {
        BasePage.addPatient.clickAddPatientLink();
    }

    @Then("i should be on Add Patient page of HealthCare app")
    public void iShouldBeOnAddPatientPageOfHealthCareApp()
    {
        BasePage.addPatient.clickAddPatientLink();
    }

    @When("i enter <First Name>,<Last Name>,<Age>,<Contact>,<Number>,<Emergency Contact Number>,<Email>,<Gender>,<DOB>,<Register>,<House Number>,<Street>,<City>,<State>,<PostCode>")
    public void iEnterFirstNameLastNameAgeContactNumberEmergencyContactNumberEmailGenderDOBRegisterHouseNumberStreetCityStatePostCode(io.cucumber.datatable.DataTable dataTable)
    {
        BasePage.addPatient.enterFirstnameText(dataTable.cell(1,0));
        BasePage.addPatient.enterLastnameText(dataTable.cell(1,1));
        BasePage.addPatient.enterAgeText(dataTable.cell(1,2));
        BasePage.addPatient.enterContactNum(dataTable.cell(1,3));
        BasePage.addPatient.enterEmergencyContactNum(dataTable.cell(1,4));
        BasePage.addPatient.enterEmailText(dataTable.cell(1,5));
        BasePage.addPatient.enterGenderText(dataTable.cell(1,6));
        BasePage.addPatient.enterDobText(dataTable.cell(1,7));
        BasePage.addPatient.enterRegisterNumText(dataTable.cell(1,8));
        BasePage.addPatient.enterHouseNumText(dataTable.cell(1,9));
        BasePage.addPatient.enterStreetText(dataTable.cell(1,10));
        BasePage.addPatient.enterCityText(dataTable.cell(1,11));
        BasePage.addPatient.enterStateText(dataTable.cell(1,12));
        BasePage.addPatient.enterPostcodeText(dataTable.cell(1,13));
        BasePage.addPatient.clickSubmitBtn();
    }

    @Then("i should see Add Patients header is shown and should see message as {string}")
    public void iShouldSeeAddPatientsHeaderIsShownAndShouldSeeMessageAs(String arg0)
    {
        actualAddPatientText= BasePage.addPatient.getAddPatientText();
        Assertions.assertEquals(prop.getProperty("expectedAddPatientText"),actualAddPatientText);
    }

    }

   /* @When("i click on Add Patient on Primary navbar")
    public void iClickOnAddPatientOnPrimaryNavbar()
    {
        BasePage.addPatient.clickAddPatientLink();
    }
    @Then("i will be navigated to Add Patient page")
    public void iWillBeNavigatedToAddPatientPage()
    {
       BasePage.addPatient.clickAddPatientLink();
    }
    @Given("i logged into HealthCare app")
    public void iLoggedIntoHealthCareApp()
    {
        BasePage.addPatient.clickAddPatientLink();
    }
    @When("i enter <First Name>,<Last Name>, <Age>,<ContactNumber>,<Emergency Contact Number>,<Email>,<Gender>,<DOB>,<Register>,<House Number>,<Street>,<City>,<State> and <PostCode>")
    public void iEnterFirstNameLastNameAgeContactNumberEmergencyContactNumberEmailGenderDOBRegisterHouseNumberStreetCityStatePostCode(io.cucumber.datatable.DataTable dataTable)
    {
        BasePage.addPatient.enterFirstnameText(dataTable.cell(1,0));
        BasePage.addPatient.enterLastnameText(dataTable.cell(1,1));
        BasePage.addPatient.enterAgeText(dataTable.cell(1,2));
        BasePage.addPatient.enterContactNum(dataTable.cell(1,3));
        BasePage.addPatient.enterEmergencyContactNum(dataTable.cell(1,4));
        BasePage.addPatient.enterEmailText(dataTable.cell(1,5));
        BasePage.addPatient.enterGenderText(dataTable.cell(1,6));
        BasePage.addPatient.enterDobText(dataTable.cell(1,7));
        BasePage.addPatient.enterRegisterNumText(dataTable.cell(1,8));
        BasePage.addPatient.enterHouseNumText(dataTable.cell(1,9));
        BasePage.addPatient.enterStreetText(dataTable.cell(1,10));
        BasePage.addPatient.enterCityText(dataTable.cell(1,11));
        BasePage.addPatient.enterStateText(dataTable.cell(1,12));
        BasePage.addPatient.enterPostcodeText(dataTable.cell(1,13));
        BasePage.addPatient.clickSubmitBtn();
    }
    @Then("i should see Add Patients header is shown and should see message as {string}")
    public void iShouldSeeAddPatientsHeaderIsShownAndShouldSeeMessageAs(String arg0)
    {
        actualAddPatientText= BasePage.addPatient.getAddPatientText();
        Assertions.assertEquals(DriverFactory.prop.getProperty("expectedAddPatientText"),actualAddPatientText);
    }

    */

