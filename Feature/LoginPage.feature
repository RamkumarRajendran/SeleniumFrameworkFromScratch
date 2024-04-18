Feature: Login Page Feature

#Scenario: Login page title
#Given user is on login page
#When user gets the title of the page
#Then page title should be "Account Login"

#Scenario: Forget Password Link
#Given user is on login page
#Then forget password link should be displayed

Scenario: Login with correct credential
 Given user is on login page
 When user enter username "rsramsyky@gmail.com"
 And user enter password "R@msay90"
 And check for login button backgroud color
 And user clicks on Login button
 #Then user get the title of the page
 #And page title should be "My Account"