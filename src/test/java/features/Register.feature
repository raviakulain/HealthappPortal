Feature:Register as new patient

  Background:i navigate to HealthCare app and go to Register page
    Given i am on the HealthCare app home page
    When i click register link on the HealthCare app
    Then i should see the Register header
  Scenario:	Verify register functionality by entering data into all fields
    When i enter <First Name>,<Last Name>,<Email> and <Password>
      |First Name|Last Name|Email                |Password   |
      |new       |testing  |newtesting@health.com|Testing@123|
    Then i should be registered successfully
  Scenario:verify that user can not register with simple(non-alphanumeric) password
    When i enter <First Name>,<Last Name>,<Email> and <Password>
      |First Name|Last Name|Email                |Password|
      |new       |testing  |newtesting@health.com|123456  |
    Then i should see an error message stating alphanumeric password is required
  Scenario:Verify register functionality by not entering data into all fields
    When i clicks on register button
    Then i should see an error message stating that mandatory fields are missing
  Scenario:verify that already registered user can not re-register
    When i enter <First Name>,<Last Name>,<Email> and <Password>
      |First Name|Last Name|Email                |Password   |
      |new       |testing  |newtesting@health.com|Testing@123|
    Then i should see an error as stating that the message as "Email exists already"
  Scenario:verify user can navigate to login page from Register page
    When i navigates to the login page from register page
    Then i should see the Login header

