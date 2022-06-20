Feature:Login to HealthCare app

  Background:i navigate to HealthCare app and then go to login page
    Given i am on the HealthCare app home page
    When i click on login link on the HealthCare app
    Then i will be navigated to home page of HealthCare app
    Then i should see login header
    @regression
  Scenario:Verify user can login with valid credentials
    When i login with <email>,<password>
       |email                |password   |
       |newtesting@health.com|Testing@123|
    Then i should be logged in successfully and should see login message as "login successful"
  @regression
  Scenario:Verify user can not login with invalid credentials
    When i login with <email>,<password>
        |email            |password   |
        |user10@health.com|password123|
    Then i should not be logged in successfully and should see login message as "No User Exists With That Email"
    @ui
  Scenario:Verify login functionality without providing email and password
      When i login with <email>,<password>
        |email   |password|
        |        |        |
    Then i should see valid error message as "No User Exists with that Email"
      @ui
  Scenario:verify user can navigate to register page from login page
    When i navigates from login to the Register page
    Then i should see the Register header