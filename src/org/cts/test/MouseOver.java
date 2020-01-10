package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace sgbharathi\\MouseOverAction\\ChromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.amazon.iN\r\n");
	WebElement a = driver.findElement(By.xpath("//a[@href=\"courses.html\"]"));
	Actions acc=new Actions(driver);
	acc.moveToElement(a).perform();
	
	WebElement b = driver.findElement(By.xpath("//a[@href=\"http://www.greenstechnologys.com/oracle-training.html\"]"));
	acc.moveToElement(b).perform();
	
	WebElement c = driver.findElement(By.xpath("//a[@href=\"http://www.greenstechnologys.com/oracle-course-content.html\"]"));
	c.click();
	}
	
}
