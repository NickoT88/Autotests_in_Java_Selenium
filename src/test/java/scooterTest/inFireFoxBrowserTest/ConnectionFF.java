package scooterTest.inFireFoxBrowserTest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

//базовый класс для подключения драйвера FireFox
public class ConnectionFF {
    WebDriver driver;

    @Before
    //подключение браузера и установление ожидания в 5 секунд
    public void open() {
        System.setProperty("webdriver.gecko.driver", "G:\\EDIprojects\\FireFoxTest\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    //закрываю браузер
    @After
    public void close() {
        driver.quit();
    }
}
