package org.cts.test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
public static void main(String[] args)throws IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\eclipse-workspace sgbharathi\\MouseOverAction\\ChromeDriver\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://greenstech.in/selenium-course-content.html");
driver.manage().window().maximize();

TakesScreenshot tk=(TakesScreenshot)driver;

File s=tk.getScreenshotAs(OutputType.FILE);

File d=new File("D:\\output");

FileUtils.copyfile(s,d);


}
}
