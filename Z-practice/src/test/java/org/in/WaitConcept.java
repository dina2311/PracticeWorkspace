package org.in;

import java.time.Duration;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitConcept {
	public static void main(String[] args) {
		/*
		 * System.setProperty(
		 * "webdriver.chrome.driver","E:\\Ellipse - Gtech\\selenium drivers\\Latest 84.0\\chromedriver.exe"
		 * );
		 * 
		 * WebDriver driver = new ChromeDriver();
		 * 
		 * driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		 * 
		 * WebElement twiter =
		 * driver.findElement(By.xpath("//a[contains(text(),'  Follow On Twitter ')] "))
		 * ; twiter.click();
		 * 
		 * 
		 * WebDriverWait w =new WebDriverWait(driver,5);
		 * 
		 * FluentWait<WebDriver> fluentWait = new
		 * FluentWait<WebDriver>(driver).withTimeout(Duration.ofMillis(9000));
		 */		
		Map m=new LinkedHashMap();
		
		m.put(70,"Dinesh");
		m.put(10, "dinesh");
		m.put(20, "Ramesh");
		
		Set <Entry> entrySet = m.entrySet();
		
		for (Entry x : entrySet) {
			System.out.println(x.getKey());
			System.out.println( x.getValue());
		}
		
		
		
		
		
		
		
		
	}

}







