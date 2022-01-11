package com.kasta;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Fist {
    private WebDriver driver;
    static {
        System.setProperty("webdriver.chrome.driver","D:\\Testing\\WebDriverNew\\chromedriver.exe");
    }

    @Before
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void findSite() {
        driver.get("https://kasta.ua/uk/");
    }

    @Test
    public void findButton() throws InterruptedException {
        driver.get("https://kasta.ua/uk/");
        WebElement element= driver.findElement(By.xpath(".//div[@class='mt-1' and text()='Чоловікам']"));
        element.click();
    }
    @Test
    public void find() throws InterruptedException {
        driver.get("https://kasta.ua/uk/");
        WebElement element= driver.findElement(By.xpath(".//div[@class='mt-1' and text()='Зима']"));
        element.click();
    }

}
