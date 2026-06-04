package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskSauceDemo {

public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();
		
		driver.findElement(By.className("shopping_cart_link")).click();
		driver.findElement(By.xpath("//button[@data-test='checkout']")).click();
		
		driver.findElement(By.id("first-name")).sendKeys("Priya");
		driver.findElement(By.id("last-name")).sendKeys("suvi");
		driver.findElement(By.id("postal-code")).sendKeys("628215");
		
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("finish")).click();
		
		String ConfirmationMessage = driver.findElement(By.className("complete-header")).getText();
		System.out.println("order status:" + ConfirmationMessage);	
		

		
		

	}

}
