$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TestAFeature.feature");
formatter.feature({
  "line": 2,
  "name": "A Feature",
  "description": "",
  "id": "a-feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 2140622400,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Testing A Feature Scenario",
  "description": "",
  "id": "a-feature;testing-a-feature-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "a",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "b",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "c",
  "keyword": "Then "
});
formatter.match({
  "location": "TestTheFeature.a()"
});
formatter.result({
  "duration": 1365851200,
  "status": "passed"
});
formatter.match({
  "location": "TestTheFeature.b()"
});
formatter.result({
  "duration": 36500,
  "status": "passed"
});
formatter.match({
  "location": "TestTheFeature.c()"
});
formatter.result({
  "duration": 24100,
  "status": "passed"
});
formatter.after({
  "duration": 705578200,
  "status": "passed"
});
});