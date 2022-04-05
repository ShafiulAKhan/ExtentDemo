package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.basePackage.BaseClass;
import com.extentManager.ExtentManager;

public class MyStoreClass extends BaseClass {

	@Test
	public void loginPageTest() {

		
		WebElement imgElement = driver.findElement(By.xpath("//*[@id=\"header_logo\"]/a/img"));
		Assert.assertTrue(imgElement.isDisplayed());

	}

	@Test
	public void logInTest() throws InterruptedException {

		
		driver.findElement(By.id("email")).sendKeys("shahed@shahed.com");
		Thread.sleep(4000);
		driver.findElement(By.id("passwd")).sendKeys("Shahed@1");
		driver.findElement(By.id("SubmitLogin")).click();
		Thread.sleep(4000);
		String actualTitle = driver.getTitle();
		String expectedTitle = "My account - My Store";

		Assert.assertEquals(actualTitle, expectedTitle);

	}

	@Test
	public void sampleCase() {

		
		ExtentManager.test.createNode("Validation1");
		Assert.assertTrue(true);
		ExtentManager.test.createNode("Validation2");
		Assert.assertTrue(true);
		ExtentManager.test.createNode("Validation3");
		Assert.assertTrue(true);
		ExtentManager.test.createNode("Validation4");
		Assert.assertTrue(true);

	}
}