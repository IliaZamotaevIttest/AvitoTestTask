package org.testtask.StepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testtask.Elements;

// Сопоставление строк сценария cucumber тестовым операциям
public class AvitoTestStepsDefinition {
    Elements elements;

    public AvitoTestStepsDefinition() {
        elements = new Elements();
    }

    @Given("Войти на сайт {string}")
    public void open_home_page(String url) throws Throwable {
        elements.openPage(url);
    }

    @When("Выбрать из категорий {string}")
    public void select_category(String category) throws Throwable {
        elements.selectCategory(category);
    }

    @When("Выбрать регион {string}")
    public void select_region(String region) throws Throwable {
        elements.selectRegion(region);
    }

    @When("Поставить чекбокс только с фото")
    public void enable_checkbox_with_photo() throws Throwable {
        elements.selectWithPhoto();
    }

    @When("Ввести в поисковую строку {string}")
    public void input_to_search(String textToSearch) throws Throwable {
        elements.inputTextToSearch(textToSearch);
    }

    @When("Нажать кнопку поиск")
    public void click_search_button() throws Throwable {
        elements.clickSearchButton();
    }

    @Then("Получить цену первой машины в списке")
    public void get_first_item_price() throws Throwable {
        elements.getFirstItemPrice();
    }

    @Then("Получить url объявления")
    public void get_first_item_url() throws Throwable {
        elements.getFirstItemUrl();
    }
}