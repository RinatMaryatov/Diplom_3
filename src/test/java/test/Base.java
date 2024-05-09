package test;

import helpers.api.user.UserMethods;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Step;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Random;


public class Base {
    WebDriver driver;
    String name = "Ринат";
    String email = "rinat" + new Random().nextInt(100000) + "@yandex.ru";
    String password = "password";
    String invalidPassword = "pa1";
    private String accessToken;
    private static final String YANDEX_DRIVER = "src/main/resources/yandexdriver";

    @Step("Создание тестового пользователя")
    public void createUser() {
        accessToken = UserMethods.createUser(email, password, name).then().extract().path("accessToken").toString();
    }

    @Step("Логин в созданного юзера")
    public void loginUser() {
        accessToken = UserMethods.loginUser(email, password).then().extract().path("accessToken").toString();
    }

    @Before
    @Step("Создание драйвера браузера")
    public void createDriver() {
        String browserName = System.getProperty("browser");
        if (browserName == null) {
            browserName = "chrome";
        }

        ChromeOptions options = new ChromeOptions();
        switch (browserName) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver(options);
                break;

            case "yandex":
                System.setProperty("webdriver.chrome.driver", "src/main/resources/yandexdriver");
                driver = new ChromeDriver(options);
                break;
            default:
                throw new RuntimeException("Некорректный браузер: " + browserName);
        }
        driver.manage().window().maximize();
    }

    @After
    public void tearDown() {
        if (accessToken != null) {
            UserMethods.deleteUser(accessToken);
        }
        driver.quit();
    }
}