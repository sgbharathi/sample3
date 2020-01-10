package org.cts.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task3 {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace sgbharathi\\MouseOverAction\\ChromeDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Actions ac=new Actions(driver);
		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.xpath("//*[@id=\"article-wrapper\"]/p[1]"));
		ac.contextClick(a).perform();
		
		Robot r=new Robot();
		for (int i = 1; i <=5; i++) {
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

}
