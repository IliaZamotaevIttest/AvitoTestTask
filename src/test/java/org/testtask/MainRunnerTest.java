package org.testtask;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// Класс для запуска теста
@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/features")
public class MainRunnerTest {
}
