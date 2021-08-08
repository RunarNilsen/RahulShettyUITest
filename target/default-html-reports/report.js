$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/WebTable.feature");
formatter.feature({
  "name": "Web Tables",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check sum of Amount column",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "navigate to the homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.uitest.step_definitions.WebTableStepDefinitions.navigate_to_the_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sum the Amount Column",
  "keyword": "When "
});
formatter.match({
  "location": "com.uitest.step_definitions.WebTableStepDefinitions.sum_the_Amount_Column()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "It should be same with the amount of Total Amount Collected",
  "keyword": "Then "
});
formatter.match({
  "location": "com.uitest.step_definitions.WebTableStepDefinitions.it_should_be_same_with_the_amount_of_Total_Amount_Collected()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});