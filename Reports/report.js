$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/icici.feature");
formatter.feature({
  "name": "To validate the icici login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "To validate the login portal",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@scene2"
    }
  ]
});
formatter.step({
  "name": "To launch the chr browser",
  "keyword": "Given "
});
formatter.match({
  "location": "IciciTest.toLaunchTheChrBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To launch the icici url",
  "keyword": "When "
});
formatter.match({
  "location": "IciciTest.toLaunchTheIciciUrl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "IciciTest.toClickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close the chr browser",
  "keyword": "Then "
});
formatter.match({
  "location": "IciciTest.toCloseTheChrBrowser()"
});
formatter.result({
  "status": "passed"
});
});