package Steps;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
import static Steps.BeforeAfterSteps.getDriver;

public class WhenStep {
    @When("login button is clicked")
    public void loginButtonIsClicked(){
        WebElement loginButton = getDriver().findElement(By.xpath("//button"));

        loginButton.click();

        getDriver().manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }
}
