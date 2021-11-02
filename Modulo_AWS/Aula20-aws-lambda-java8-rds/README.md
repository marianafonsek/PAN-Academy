# aws-lambda-java8-rds-mysql

# Overview

This project is to demonstrate AWS Lambda using Java 8 runtime to connect to AWS RDS MySql Database.

# Prerequisites
1. Java 8 + Maven
2. AWS Account with IAM, RDS, Lambda permission.

# Step - by - Step
1. Create RDS MySql instance with these following settings:
* Enable Option eligible for Free Tier Usage only (Optional for cost saving)
* Note your Master Username and Password.
* Choose 1 VPC & Note your VPC info.
* Choose No for Public Accessibility.
* Note your db name & port.
* Leave everything esle as default.
* Wait for the instance UP -> Note the endpoint

2. Create a new IAM Role for your lamdba function then attach the AWSLambdaVPCAccessExecutionRole policy. Note your Role's arn.

3. Clone the repo. Run 
``mvn clean package``
to build Jar file.

4. Now create your AWS Lambda function as below:
* Create Function > Author from scratch
* Runtime: Java 8
* Role: choose IAM role created in step2 > Create Function
* In Function Code Section:
  * Upload your Jar file in step3
  * Handler: your package.class-name (In this case: LambdaRdsMySqlHandler because I didn't put this class in any package)
* In Environment Variables Section: Create these following keys with noted values in previous steps
  * RDS_MYSQL_ENDPOINT
  * RDS_MYSQL_PORT
  * RDS_MYSQL_USERNAME
  * RDS_MYSQL_PASSWORD
  * RDS_MYSQL_DB_NAME
* In Network Section:
  * Choose VPC in Step1
  * Subnet: any ( > 1 for HA, 1 is good enough for testing purpose)
  * Security Group: you can create 1 then allow Inbound Access from MySql Instance SG to this group though DB port (default is 3306).
* Now click the orange SAVE button ontop to save the setting.
* Create a test by click the "Select a test event" dropdown > Create a new "Hello World" test event.
* Click Test. 

If all the steps are done properly, you should see the test green and print out the current time.

BEST!
