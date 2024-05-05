package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    private final WebDriver driver;
    private static final By LOGININTOACCOUNTBUTTON = By.xpath(".//button[text()='Войти в аккаунт']");
    private static final By PERSONALACCOUNTBUTTON = By.xpath(".//*[@id=\"root\"]/div/header/nav/a");
    private static final By MODALWINDOW = By.xpath(".//*[@id=\"root\"]/div/div/div");
    private static final By FILLINGCONSTRUCTORBUTTON = By.xpath(".//span[text() = 'Начинки']");
    private static final By SOUSESCONSTRUCTORBUTTON = By.xpath(".//span[text() = 'Соусы']");
    private static final By BUNSCONSTRUCTORBUTTON = By.xpath(".//span[text() = 'Булки']");
    private static final By FILLINGCONSTRUCTOR = By.xpath(".//*[@id=\"root\"]/div/main/section[1]/div[2]/h2[3]");
    private static final By SOUSESCONSTRUCTOR = By.xpath(".//*[@id=\"root\"]/div/main/section[1]/div[2]/h2[2]");
    private static final By BUNSCONSTRUCTOR = By.xpath(".//*[@id=\"root\"]/div/main/section[1]/div[1]/div[1]/span");
    private static final By SELECTEDSECTION = By.xpath(".//*[@class='tab_tab__1SPyG tab_tab_type_current__2BEPc pt-4 pr-10 pb-4 pl-10 noselect']");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Click log into account button")
    public void clickLogIntoAccountButton() {
        driver.findElement(LOGININTOACCOUNTBUTTON).click();
    }

    @Step("Click personal account button")
    public void clickPersonalAccountButton() {
        driver.findElement(PERSONALACCOUNTBUTTON).click();
    }

    @Step("Get log into account button")
    public static By getLogIntoAccountButtonLocator() {
        return LOGININTOACCOUNTBUTTON;
    }

    @Step("Get personal account button")
    public static By getPersonalAccountButtonLocator() {
        return PERSONALACCOUNTBUTTON;
    }

    @Step("Get modal window")
    public static By getModalWindowLocator() {
        return MODALWINDOW;
    }

    @Step("Click fillings constructor button")
    public void clickFillingConstructorButton() {
        driver.findElement(FILLINGCONSTRUCTORBUTTON).click();
    }

    @Step("Click souses constructor button")
    public void clickSousesConstructorButton() {
        driver.findElement(SOUSESCONSTRUCTORBUTTON).click();
    }

    @Step("Click buns constructor button")
    public void clickBunsConstructorButton() {
        driver.findElement(BUNSCONSTRUCTORBUTTON).click();
    }

    @Step("Get fillings constructor")
    public static By getFillingConstructorLocator() {
        return FILLINGCONSTRUCTOR;
    }

    @Step("Get souses constructor")
    public static By getSousesConstructorLocator() {
        return SOUSESCONSTRUCTOR;
    }

    @Step("Get buns constructor")
    public static By getBunsConstructorLocator() {
        return BUNSCONSTRUCTOR;
    }

    @Step("Get selected section")
    public static By getSelectedSectionLocator() {
        // Задержка перед получением выбранного раздела
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return SELECTEDSECTION;
    }
}
