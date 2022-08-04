package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class WebDriverCheckbox {
    public static void main(String args[]){
        WebDriver driver = new EdgeDriver();
        driver.get("file:///C:/Users/v-wendys/Desktop/WebDriverDemo/src/main/webapp/CheckboxTest.html");

        WebElement checkbox = driver.findElement(By.id("lettuceCheckbox"));
        checkbox.click();

        WebElement checkbox1 = driver.findElement(By.id("mayoCheckbox"));
        checkbox1.click();
        checkbox1.click();
    }
}
