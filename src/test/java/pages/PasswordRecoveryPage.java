package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordRecoveryPage {
    private final WebDriver driver;
    private static final By AUTHBUTTON = By.className("Auth_link__1fOlj");
    private static final By MODALWINDOW = By.xpath(".//*[@id=\"root\"]/div/div/div");

    public PasswordRecoveryPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Go to auth page")
    public void goToAuthPage() {
        driver.findElement(AUTHBUTTON).click();
    }

    @Step("Get auth button locator")
    public static By getAuthButtonLocator() {
        return AUTHBUTTON;
    }

    @Step("Get modal window locator")
    public static By getModalWindowLocator() {
        return MODALWINDOW;
    }

}
