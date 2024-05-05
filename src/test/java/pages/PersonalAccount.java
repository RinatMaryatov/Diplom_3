package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalAccount {
    private final WebDriver driver;
    private static final By CONSTRUCTORBUTTON = By.xpath(".//p[text() = 'Конструктор']");
    private static final By LOGOBUTTON = By.xpath(".//*[@id=\"root\"]/div/header/nav/div");
    private static final By MODALWINDOW = By.xpath(".//*[@id=\"root\"]/div/div/div");
    private static final By LOGOUTBUTTON = By.className("Account_button__14Yp3");

    public PersonalAccount(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Click constructor button")
    public void clickConstructorButton() {
        driver.findElement(CONSTRUCTORBUTTON).click();
    }

    @Step("Click logo button")
    public void clickLogoButton() {
        driver.findElement(LOGOBUTTON).click();
    }

    @Step("Get modal window locator")
    public static By getModalWindowLocator() {
        return MODALWINDOW;
    }

    @Step("Click logout button")
    public void clickLogoutButton() {
        driver.findElement(LOGOUTBUTTON).click();
    }
}
