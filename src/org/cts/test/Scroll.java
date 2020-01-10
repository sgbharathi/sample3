package org.cts.test;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Scroll {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace sgbharathi\\MouseOverAction\\ChromeDriver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	WebElement user =driver.findElement(By.xpath("//a[text()=Greens Technologys Overall Reviews"));
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("arguments[0].scrollInView(true)", user);
	
}
}
