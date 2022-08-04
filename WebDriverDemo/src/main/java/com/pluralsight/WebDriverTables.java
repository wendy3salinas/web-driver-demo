package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverTables {
    public static void main(String args[]){
        WebDriver driver = new EdgeDriver();
        driver.get("file:///C:/Users/v-wendys/Desktop/WebDriverDemo/src/main/webapp/TablesTest.html");

        //WebElement outerTable = driver.findElement(By.tagName("table"));
        //WebElement innerTable = outerTable.findElement(By.tagName("table"));
        //WebElement row = innerTable.findElements(By.tagName("td")).get(1);

        WebElement row = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));

        System.out.println(row.getText());
    }
}
