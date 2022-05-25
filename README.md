# Leaseplan-example-project
Sample UI automation of wikipedia site and few open APIs from waarkoop-server
This repo consists a customized automation framework for executing the test cases on web browser ,
the framework uses Serenity BDD libraries for integrating Cucumber, REST-Assured and Selenium.
This maven project demonstrates various styles of writing cucumber BDD scenarios within Serenity BDD framework


Please Install below
# Install java
# Install brew or home-brew:
# Install Maven


Set up instructions :

1. Download and install IntelliJ Idea Community version

2. Clone the below repository in IntelliJ Idea : https://github.com/vinodpasalkar/leaseplan-example-project (Just clone this project in InteliJ idea community Edition
   and Go to Menu > Build > Build Project Once the build is completed/compiled successfully)

3. Ensure you have maven installed in your system - command from terminal -> brew install maven

4. Install below IntelliJ plugins by going to below navigation ( This will help in code navigation)

IntelliJ Idea > Menu > IntelliJ Idea > Preferences > Plugins > Marketplace

Search below plugins one by one and install them
>Cucumber for java
>Gherkin


5. Running your first test

Please download the appropriate chromedriver file depending on your OS type and provide correct path for the same in the serenity.properties file.

To execute a particular test by tag run below command on terminal by going to the project directory

mvn clean verify -Dcucumber.filter.tags="scenario tag"

For e.g. In our framework to execute the scenario UITest , Execute below command

mvn clean verify -Dcucumber.filter.tags="@UITest"

Meta filtering the stories/scenario mvn clean verify -Dcucumber.filter.tags="+SmokeTest" -- This command will run the scenarios with the tag, "SmokeTest" This way we can use this on CI-CD by tagging the test case under the different tags like regression , smoke , sanity etc...

To see the Results after execution

Go to /target/site/serenity

Open index.html file in any browser to see the results.

Below are sample report snapshots

![screencapture-localhost-63342-leaseplan-example-project-target-site-serenity-index-html-2022-05-25-06_33_05](https://user-images.githubusercontent.com/9302926/170196307-1e7daaae-14ba-4752-8f9e-34be724192f0.jpg)

![screencapture-localhost-63342-leaseplan-example-project-target-site-serenity-35cfed838fce6a34547d061ef095dd6837e5024c11ea9a63e7b6112cef6d263f-html-2022-05-25-06_33_34](https://user-images.githubusercontent.com/9302926/170196448-5f0e446c-03f6-4f55-84e5-3620ac7f7193.jpg)

I have used serenity framework here.

Serenity documentation Below can be referred for a further reading on serenity libraries http://thucydides.info/docs/serenity-staging/

