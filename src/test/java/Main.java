import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

public class Main {



    public static void main(String[]args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sit\\Downloads\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://google.com");
        WebElement input = driver.findElement(By.xpath("//input[contains(@class, 'gLFyf gsfi')]"));
        WebElement search = driver.findElement(By.name("btnK"));
        input.sendKeys("selenium");
        Thread.sleep(1000);
    }
    public void scrollToElement (WebElement element){
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true)", element);

        }
        public void moveToElement(WebElement element) {
            Actions action = new Actions(Driver.getDriver());
            action.moveToElement(element);
            action.perform();
        }

        public void waitUntilElementDisplayed(WebElement element){
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
            wait.until((ExpectedCondition<Boolean>) arg -> element.isDisplayed());


    }
    }

