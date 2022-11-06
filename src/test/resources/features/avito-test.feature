# Cucumber сценарий
Feature: Avito test scenario

  Scenario: Avito test scenario
    Given Войти на сайт "https://www.avito.ru/"
    When Выбрать из категорий "Автомобили"
    And Выбрать регион "Московская область"
    And Поставить чекбокс только с фото
    And Ввести в поисковую строку "kia k5"
    And Нажать кнопку поиск
    Then Получить цену первой машины в списке
    And Получить url объявления