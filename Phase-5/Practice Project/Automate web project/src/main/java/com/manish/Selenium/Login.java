package com.manish.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\test\\chromedriver.exe");
    	WebDriver d = new ChromeDriver();
    	d.manage().window().maximize();
    	d.get("https://www.phptravels.net");
    	d.findElement(By.id("email")).sendKeys("user@phptravels.com");
    	d.findElement(By.id("password")).sendKeys("demouser");
    	d.findElement(By.xpath("/html/body/div[1]/div/div/div[1]/h2[2]/form/button")).click();
 	
	
    }
}
