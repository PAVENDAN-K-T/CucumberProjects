$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/FeatureFiles/ForgotPass.feature");
formatter.feature({
  "name": "",
  "description": "   To validate forgotton password functionality of facebook application",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@ForgotPass"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "      To validate forgotten password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ForgotPass"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter facebook login page through chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_facebook_login_page_through_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click the forgotten password",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_the_forgotten_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to enter email or phonenumber",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_email_or_phonenumber()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User have to click search button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_have_to_click_search_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/FeatureFiles/Login.feature");
formatter.feature({
  "name": "",
  "description": "   To validate Login Functionality of Facebook Application",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Login"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "    To validate login using invalid username and invalid password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "User enter invalid username and invalid password",
  "rows": [
    {
      "cells": [
        "username",
        "ktp"
      ]
    },
    {
      "cells": [
        "password",
        "ktp1234"
      ]
    },
    {
      "cells": [
        "email",
        "ktp12@gmail.com"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_invalid_username_and_invalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be in invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_be_in_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_in_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "    To validate login using valid username and invalid password",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Login"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "User enter valid username and invalid password",
  "rows": [
    {
      "cells": [
        "Username",
        "Email",
        "Password"
      ]
    },
    {
      "cells": [
        "pk",
        "pk123@gmail.com",
        "pk123"
      ]
    },
    {
      "cells": [
        "pt",
        "pt123@gmail.com",
        "pt123"
      ]
    },
    {
      "cells": [
        "kts",
        "kts123@gmail.com",
        "kts123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enter_valid_username_and_invalid_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be in invalid credential page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_be_in_invalid_credential_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});