package Steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;
import static Steps.BeforeAfterSteps.getDriver;

public class ThenStep {


    @Then("user is logged in")
    public void userIsLoggedIn(){
        WebElement successMessage = getDriver().findElement(By.id("flash"));

        assertEquals("Success message is displayed","You logged into a secure area!",
                successMessage.getText().replace("Ă—","").trim());
    }

    @Then("user click on logout button")
    public void logoutButtonIsClicked(){
        WebElement logoutButton = getDriver().findElement(By.xpath("//a/i[contains(text(),'Logout')]"));
        logoutButton.click();
    }
}





