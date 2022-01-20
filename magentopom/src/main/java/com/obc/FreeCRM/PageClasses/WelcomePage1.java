package com.obc.magentoobjects.magentopom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {
public WebDriver driver;
public Welcome(WebDriver driver) {

	this.driver=driver;
}
public void clickOnLogin() {

	driver.findElement(By.linkText("login")).click();
}
}
