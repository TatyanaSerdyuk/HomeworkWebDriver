package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.time.Duration;

public class WebDriverWait {
    public WebDriverWait(WebDriver driver, Object ofSeconds) {
    }

    public WebDriverWait(WebDriver driver, Duration ofSeconds) {
    }

    public void until(ExpectedCondition<WebElement> webElementExpectedCondition) {
    }
}
