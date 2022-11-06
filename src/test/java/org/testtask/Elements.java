package org.testtask;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

// Тестовые операции
public class Elements extends DriverManager {
    // Открытие страницы
    public void openPage(String url) {
        driver.get(url);
    }

    // Выбор категории
    public void selectCategory(String category) {
        Select objSelect = new Select(driver.findElement(By.xpath("//*[(@id = 'category')]")));
        objSelect.selectByVisibleText(category);
    }

    // Выбор региона
    public void selectRegion(String region) {
        driver.findElement(By.xpath("//*[(@data-marker = 'search-form/region')]")).click();
        driver.findElement(By.xpath("//*[(@data-marker = 'popup-location/region/input')]")).click();
        WebElement regionTextbox = driver.findElement(By.xpath("//*[(@data-marker = 'popup-location/region/input')]"));
        regionTextbox.sendKeys(region);
        WebElement suggestion = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(driver -> driver.findElement(By.xpath("//strong[(text() = '" + region + "')]")));
        suggestion.click();
        driver.findElement(By.xpath("//*[(@data-marker = 'popup-location/save-button')]")).click();
    }

    // Включение чекбокса "только с фото"
    public void selectWithPhoto() {
        driver.findElement(By.xpath("//*[text() = 'только с фото']")).click();
    }

    // Ввод текста в строку поиска
    public void inputTextToSearch(String textToSearch) {
        driver.findElement(By.xpath("//input[(@data-marker = 'search-form/suggest')]")).sendKeys(textToSearch);
    }

    // Клик по кнопке "Найти"
    public void clickSearchButton() {
        driver.findElement(By.xpath("//button[(@data-marker = 'search-form/submit-button')]")).click();
    }

    // Получение цены из первого найденного объявления
    public boolean getFirstItemPrice() {
        WebElement firstItemPrice = driver.findElement(By.xpath("//*[(@class = 'iva-item-priceStep-uq2CQ')][1]"));
        Assert.assertTrue("Цена первой машины в списке найдена", firstItemPrice.isDisplayed());
        System.out.println("Цена первой машины в списке: " + firstItemPrice.getText());
        return true;
    }

    // Получение URL первого из первого найденного объявления
    public boolean getFirstItemUrl() {
        WebElement firstItemLink = driver.findElement(By.xpath("//*[(@class = 'iva-item-titleStep-pdebR')][1]/a"));
        firstItemLink.click();
        String url = driver.getCurrentUrl();
        Assert.assertTrue("url объявления найдено", url != null);
        System.out.println("url объявления: " + url);
        return true;
    }
}