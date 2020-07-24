$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homePage.feature");
formatter.feature({
  "line": 2,
  "name": "am goint to test makemytrip application",
  "description": "",
  "id": "am-goint-to-test-makemytrip-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@HomePageTest"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "validate login functionality with valid data",
  "description": "",
  "id": "am-goint-to-test-makemytrip-application;validate-login-functionality-with-valid-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "open browser and enter makemytrip url",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "verify title of the page",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageTest.open_browser_and_enter_makemytrip_url()"
});
formatter.result({
  "duration": 9521304043,
  "status": "passed"
});
formatter.match({
  "location": "HomePageTest.verify_title_of_the_page()"
});
formatter.result({
  "duration": 5355643565,
  "status": "passed"
});
});