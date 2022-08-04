package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.List;

public class WebDriverRadioButtons {

    public static void main (String args[]){
        WebDriver driver = new EdgeDriver();
        driver.get("file:///C:/Users/v-wendys/Desktop/WebDriverDemo/src/main/webapp/RadioButtonTest.html");

        List<WebElement> radioButtons = driver.findElements(By.name("color"));
        radioButtons.get(1).click();


        for(WebElement radioButton : radioButtons){
            if(radioButton.isSelected()){
                System.out.println(radioButton.getAttribute("value"));
            }
        }

    }
}
