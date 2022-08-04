package com.pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class WebDriverDemo {

    public static void main(String args[]) throws MalformedURLException {
        //WebDriver driver = new EdgeDriver();
        //driver.get("http://www.pluralsight.com");

        ChromeOptions chromeOptions = new ChromeOptions();
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);

        driver.get("http://www.google.com");

        WebElement searchField = driver.findElement(By.name("q"));
        searchField.click();
        searchField.sendKeys("pluralsight");
        searchField.sendKeys(Keys.ENTER);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));

        WebElement imagesLink = driver.findElement(By.linkText("Images"));
        imagesLink.click();

        WebElement imagesElement = driver.findElement(By.cssSelector("img[class='rg_i Q4LuWd']"));
        imagesElement.click();

    }
}
