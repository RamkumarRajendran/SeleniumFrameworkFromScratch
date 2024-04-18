$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Feature/LoginPage.feature");
formatter.feature({
  "name": "Login Page Feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login with correct credential",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageStep.user_is_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user enter username \"rsramsyky@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageStep.user_enter_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user enter password \"R@msay90\"",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "check for login button backgroud color",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.check_for_login_button_backgroud_color()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageStep.user_clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.afterstep({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});