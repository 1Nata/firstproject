package Steps;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static Steps.BeforeAfterSteps.getDriver;

public class GivenStep {

    @Given("login Page is displayed")
    public void loginPageIsDisplayed(){
        getDriver().get("http://the-internet.herokuapp.com/login");
        WebElement homePage = getDriver().findElement(By.xpath("//h2"));

        assertEquals("The homepage title is displayed","Login Page"
                , homePage.getText().trim());

        System.out.println("lets run");

    }

    @Given("valid username is inserted")
    public void usernameIsInserted(){
        WebElement username = getDriver().findElement(By.xpath("//input[@id='username']"));

        username.sendKeys("tomsmith");
    }

    @Given("valid password is inserted")
    public void passwordIsInserted(){
        WebElement password = getDriver().findElement(By.xpath("//input[@id='password']"));

        password.sendKeys("SuperSecretPassword!");
    }
}



