Feature: To validate the login of flipkart website 
@scene1
Scenario: To validate the login invalid mobile number and invalid otp
Given To launch the chrome browser
When To launch to open the flipkart url
And To pass the invalid mobile number in mobile number field
And To click enter after mobile number entered
Then To close the browser


@scene3
Scenario Outline: To Validate multiple login inputs
Given To launch edge browser
When To launch the url of instagram
And To pass the data "<userdata>" to user data field
And To pass the data "<passworddata>" to password field
And To click the login button
Then To close the entire browser

Examples:
|userdata                 |passworddata   |
|inmakesinfotech@gmail.com|softwaretesting|
|seliniumjava             |58786768768    |
|logeshcrazy              |lokicraze      |
|9485465485               |javacucumber   |