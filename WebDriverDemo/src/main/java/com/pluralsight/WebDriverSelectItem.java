package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverSelectItem {
    public static void main (String args[]){
        WebDriver driver = new EdgeDriver();
        driver.get("file:///C:/Users/v-wendys/Desktop/WebDriverDemo/src/main/webapp/SelectItemTest.html");

        WebElement selectElement = driver.findElement(By.id("select1"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Yes");
    }
}
