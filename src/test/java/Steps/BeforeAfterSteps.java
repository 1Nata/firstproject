
package Steps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class BeforeAfterSteps{
    private static WebDriver driver;

    @Before
    public static WebDriver runDriver(){
        if (Objects.isNull(driver)){
        System.setProperty("webdriver.chrome.driver"," D:\\Downloads\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

        return driver;
    }

    @After

    public static WebDriver getDriver() {
        return driver;

    }
    public static void quitDriver(){
        driver.quit();

    }

}


