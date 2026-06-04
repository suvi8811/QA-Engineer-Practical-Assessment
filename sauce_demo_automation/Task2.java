package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("login-button")).click();
		
		String errorMessage =
		        driver.findElement(By.xpath("//h3[@data-test='error']"))
		              .getText();

	
		System.out.println("Error Message: " + errorMessage);

	}

}
