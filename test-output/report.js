$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("S:/Personal/MyWorkspace/Cucumber_POM/src/main/java/com/qa/features/appium.feature");
formatter.feature({
  "line": 2,
  "name": "Appium Test server",
  "description": "",
  "id": "appium-test-server",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Test scenario1",
  "description": "",
  "id": "appium-test-server;test-scenario1",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "test sample method one",
  "keyword": "Given "
});
formatter.match({
  "location": "AppiumSteps.test_sample_method_one()"
});
formatter.result({
  "duration": 26573911591,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "Test scenario2",
  "description": "",
  "id": "appium-test-server;test-scenario2",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 9,
  "name": "test sample method two",
  "keyword": "Given "
});
formatter.match({
  "location": "AppiumSteps.test_sample_method_two()"
});
formatter.result({
  "duration": 162031899,
  "status": "passed"
});
});