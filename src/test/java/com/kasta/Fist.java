package com.kasta;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
    public void findButton() {
        driver.get("https://kasta.ua/uk/");
        WebElement element= driver.findElement(By.xpath(".//label[@for='2dfaa991-2238-f03a-93c5-08da3d3ebdad']"));
        element.click();
    }


}
