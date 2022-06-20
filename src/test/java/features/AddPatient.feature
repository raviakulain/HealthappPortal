Feature: Add Patient details

  Background:i navigate to HealthCare app and go to Add Patient
    Given i logged into HealthCare app
    When i navigated to Add Patient page
    Then i should be on Add Patient page of HealthCare app

  Scenario:Verify Add Patient functionality by providing data into all the fields
    When i enter <First Name>,<Last Name>, <Age>,<Contact>,<Number>,<Emergency Contact Number>,<Email>,<Gender>,<DOB>,<Register>,<House Number>,<Street>,<City>,<State>,<PostCode>
       |First Name|Last Name|Age|Contact Number|Emergency Contact Number|Email            |Gender|DOB       |Register Number|House Number|Street     |City  |State      |Post Code|
       |eva       |adam     |65 |07517951955   |079143447789            |adameva@gmail.com|Male  |01/01/1957|789789         |36          |Adam Avenue|London|Westminster|W1D 1HQ  |
    Then i should see Add Patients header is shown and should see message as "Details added successfully"