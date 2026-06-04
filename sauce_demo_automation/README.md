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
