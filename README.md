# Upgrade API Automation FrameWork

#
This is a framework built by using Java, TestNG, Maven,log4j2,Jackson and REST Assured.
It is designed to test microservices in a structured manner utilizing the OOPS principles.
Framework is extendible to as many microservices as desired.


## How to run
Make sure Java and Maven are installed on your machine. If you don't have maven installed.
On a mac for a fast install, Install brew first
-      /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"

Run below mentioned command to install maven once brew install is complete
-       brew install maven

Verify the maven install via   
-      mvn -version

Once maven is installed execute the commands in section below to run the test cases

## Commands to run the code  :
Profile ID for the project has been listed as  **<id>upgrade-api-tests</id>** in pom.xml
-      mvn clean
-      mvn -Pupgrade-api-tests test
- Run from Testng file directly
-      mvn clean test -Dsurefire.suiteXmlFiles=/UpgradeAPIAutomation/src/test/resources/testng.xml


## Run via IDE UI

- Import the project to the IDE of your choice

- Run the maven lifecycle. Resolve all pom.xml dependencies.
-      Right click on the file  src/test/java/com/upgrade/ResumeAPITests.java > **Run as TestNG**

##  Logging
- log4j2 is used for logging. Logs will be visible during the run on the console / terminal.
Logs are also stored in
-      app.log 
Log location 
-      logs/app.log

# Surefire report
- Surefire report is generated under target/surefire-reports
- Emailable report could be viewed at target/surefire-reports/emailable-report.html.
- Allure reporting could be used to make report look prettier but did not have to implement the same.

## Observation
For a POST request to 

https://credapi.credify.tech/api/brfunnelorch/v2/resume/byLeadSecret

**Request Body**

{
"loanAppUuid":**"b8096ec7-2150-405f-84f5-ae99864b3e96",**
"skipSideEffects":true }

We get a different  loanAppUuid as response

**Response**
"loanAppResumptionInfo": {
"loanAppId": 112814558,
"loanAppUuid": **"637ed6ac-d8ac-4872-a08c-b69a809b01c2",**

Seems like expected behaviour/ API response. I just wanted to point that out.


Thanks