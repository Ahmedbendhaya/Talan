$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/acces.feature");
formatter.feature({
  "name": "Acces to the website and create To Do list",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.background({
  "name": "Verify the accessibility to the website todos",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.AccesStepsToDos.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user put the link of the website",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.AccesStepsToDos.user_put_the_link_of_the_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "show homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "stepdefs.AccesStepsToDos.show_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify that the user can create a to do list",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "user write what you needs to be done",
  "keyword": "Given "
});
formatter.match({
  "location": "stepdefs.AccesStepsToDos.user_write_what_you_needs_to_be_done()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user hits enter",
  "keyword": "When "
});
formatter.match({
  "location": "stepdefs.AccesStepsToDos.user_hits_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the element is added to the To dos list",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});