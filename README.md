# QA-Engineer-Practical-Assessment

#	Candidate Name - Sudharsan J
#	Tools and Frameworks Used -
Google Sheets for manual testing , 
Selenium-java for automation testing , 
Postman for performance testing
#	Tasks Completed - 3 tasks completed 
(Task 1  — Manual Testing  |  Write Test Cases for Claude.ai)
(Task 2  — Automation Testing  |  Sauce Demo)
(Task 3  — Performance Testing  |  ReqRes API)

	How to Run Automation Tests (setup + execution steps)
# Automation Test Execution Steps

## Tools Used

* Java
* Selenium WebDriver
* Eclipse IDE
* Google Chrome Browser
* ChromeDriver

## Environment Setup

1. Install Java JDK on the system.
2. Install Eclipse IDE.
3. Download Selenium WebDriver libraries.
4. Create a new Java Project in Eclipse.
5. Add the Selenium JAR files to the project's Build Path.
6. Install Google Chrome browser.
7. Ensure the ChromeDriver version is compatible with the installed Chrome browser version.

## Test Case 1: Valid Login and Checkout

### Steps Automated

1. Launch Chrome Browser.
2. Navigate to https://www.saucedemo.com.
3. Enter Username: standard_user.
4. Enter Password: secret_sauce.
5. Click the Login button.
6. Verify successful login.
7. Add "Sauce Labs Backpack" to the cart.
8. Add "Sauce Labs Bike Light" to the cart.
9. Open the shopping cart.
10. Verify that both selected products are present in the cart.
11. Click the Checkout button.
12. Enter First Name.
13. Enter Last Name.
14. Enter Postal Code.
15. Click Continue.
16. Click Finish to place the order.
17. Capture the order confirmation message.
18. Verify that the success message "Thank you for your order!" is displayed.

### Execution Steps

1. Open Eclipse IDE.
2. Open the Java project.
3. Navigate to the automation test class.
4. Right-click the Java file.
5. Select Run As → Java Application.
6. The browser launches automatically.
7. Selenium performs all checkout steps.
8. Verification results are displayed in the Eclipse Console.

## Test Case 2: Locked User Login

### Steps Automated

1. Launch Chrome Browser.
2. Navigate to https://www.saucedemo.com.
3. Enter Username: locked_out_user.
4. Enter Password: secret_sauce.
5. Click the Login button.
6. Capture the displayed error message.
7. Verify that the message matches the expected locked user message.

### Expected Error Message

Epic sadface: Sorry, this user has been locked out.

### Execution Steps

1. Open Eclipse IDE.
2. Open the automation project.
3. Open the Locked User Login test script.
4. Right-click the Java file.
5. Select Run As → Java Application.
6. Selenium executes the login scenario.
7. The error message is captured using getText().
8. Verification results are displayed in the Eclipse Console.


•	How to Run Load Tests

# Load Test Execution Steps

## Tool Used

* Postman Performance Runner

## Objective

To evaluate the performance of the API endpoint under load and collect key performance metrics.

## Environment Setup

1. Install Postman.
2. Create a new Collection.
3. Create a GET request for the target API endpoint.
4. Save the request to the collection.
5. Verify the API returns a successful response.
6. Open the Postman Performance Runner.

## Test Execution

1. Select the collection containing the API request.
2. Open Performance Testing.
3. Configure the required virtual users and test duration.
4. Start the performance test.
5. Allow the test to run for the configured duration.
6. Monitor the execution through the Postman dashboard.

## Metrics Collected

The following performance metrics were collected from the Postman Performance Dashboard:

* Average Response Time
* Minimum Response Time
* Maximum Response Time
* p90 / p95 Response Time
* Requests Per Second (Throughput)
* Number of Failed Requests
* Error Rate (%)

## Result Analysis

After the test execution completed, the Postman dashboard automatically generated performance statistics and charts. The collected metrics were analyzed to determine the API's responsiveness, stability, throughput, and error behavior under the specified load conditions.

## Final Observation

Based on the performance test results, the API behavior was evaluated using response time, throughput, and error metrics. The final assessment was prepared using the statistics provided by the Postman Performance Runner dashboard.

•	Any Assumptions or Issues Faced
## Issue Encountered During Load Testing

While executing the performance test in Postman, the target API initially returned a **401 Unauthorized** response for all requests.

### Root Cause

Upon investigating the response body, the API returned the following message:

"missing_api_key - The x-api-key header is required for this endpoint."

This indicated that the API endpoint required authentication through an API key before requests could be processed successfully.

### Resolution

1. Reviewed the API response details in Postman.
2. Identified that the API required the `x-api-key` request header.
3. Created and obtained a valid API key from the ReqRes portal.
4. Added the API key to the request headers.
5. Re-executed the API request and verified successful authentication.

### Learning Outcome

This issue highlighted the importance of validating API authentication requirements before performing load testing. Proper request configuration is essential to ensure that performance results reflect the actual behavior of the application rather than authentication failures.

