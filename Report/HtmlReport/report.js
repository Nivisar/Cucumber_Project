$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking in Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "user Login the Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-the-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Url in Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter the \"\u003cusername\u003e\" in username field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enters the \"\u003cpassword\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click on the Login Button And it navigates to search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-the-application;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "hotel-booking-in-adactin-application;user-login-the-application;;1"
    },
    {
      "cells": [
        "Parkavig",
        "NViyan@05"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;user-login-the-application;;2"
    },
    {
      "cells": [
        "AAA",
        "123"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;user-login-the-application;;3"
    },
    {
      "cells": [
        "NJuhu",
        "456"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;user-login-the-application;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "user Login the Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-the-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Url in Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter the \"Parkavig\" in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enters the \"NViyan@05\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click on the Login Button And it navigates to search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Url_in_Adactin_Application()"
});
formatter.result({
  "duration": 2507855200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Parkavig",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_the_in_username_field(String)"
});
formatter.result({
  "duration": 149929500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NViyan@05",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Enters_the_in_password_field(String)"
});
formatter.result({
  "duration": 153554000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_on_the_Login_Button_And_it_navigates_to_search_Hotel_Page()"
});
formatter.result({
  "duration": 2882629000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "user Login the Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-the-application;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Url in Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter the \"AAA\" in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enters the \"123\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click on the Login Button And it navigates to search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Url_in_Adactin_Application()"
});
formatter.result({
  "duration": 248325300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AAA",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_the_in_username_field(String)"
});
formatter.result({
  "duration": 115735600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Enters_the_in_password_field(String)"
});
formatter.result({
  "duration": 90748400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_on_the_Login_Button_And_it_navigates_to_search_Hotel_Page()"
});
formatter.result({
  "duration": 328362800,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "user Login the Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-the-application;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@smoketest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Url in Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter the \"NJuhu\" in username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enters the \"456\" in password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click on the Login Button And it navigates to search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Url_in_Adactin_Application()"
});
formatter.result({
  "duration": 292396500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "NJuhu",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_the_in_username_field(String)"
});
formatter.result({
  "duration": 99877400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "456",
      "offset": 17
    }
  ],
  "location": "Step_Definition.user_Enters_the_in_password_field(String)"
});
formatter.result({
  "duration": 87462400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_on_the_Login_Button_And_it_navigates_to_search_Hotel_Page()"
});
formatter.result({
  "duration": 325437200,
  "status": "passed"
});
});