package com.obc.magentoobjects.magentopom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main {

public Main(WebDriver driver) {

	super(driver);
}
public void freeAccount()
{

	driver.findElement(By.linkText("Free account").click());
	}
}
