package org.in;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FileUpload {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\Ellipse - Gtech\\selenium drivers\\Latest 84.0\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/upload/");
		
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//driver.switchTo().frame("uploadform");
		
		
		FluentWait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(5000, TimeUnit.MILLISECONDS).pollingEvery(50, TimeUnit.MILLISECONDS);
		
		//w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@id='uploadfile_0']"))));
		w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='uploadfile_0']")));
		
//		Thread.sleep(5000);X
		
		//String pageSource = driver.getPageSource();
		
		//System.out.println(pageSource);

	
		
	}

}
