package org.testtask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;

public class DriverManager {
    public static WebDriver driver;

    // Запуск бразуера
    public void openBrowser(){
        File file = new File("src/test/resources/seleniumdrivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsoluteFile().toString());
        driver=new ChromeDriver();
    }

    // Закрытие браузера
    public void closeBrowser(){
        driver.quit();
    }
}