package org.testtask;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
    // Подготовительные операции
    // (запуск браузера)
    @Before
    public void setup() {
        new DriverManager().openBrowser();
    }

    // Завершающие операции
    // (закрытие браузера)
    @After
    public void after() {
        new DriverManager().closeBrowser();
    }
}
