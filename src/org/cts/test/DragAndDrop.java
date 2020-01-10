package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\eclipse-workspace sgbharathi\\MouseOverAction\\ChromeDriver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	
	
	WebElement but1 = driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	
	WebElement mov1 = driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	Actions acc = new Actions(driver);
	acc.dragAndDrop(but1, mov1).perform();
	
}
}
