import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UltimateQATest extends PageSetup {

    @Test
    public void testOne() {
        WebElement buttonUsingID = driver.findElement(By.id("idExample"));
        buttonUsingID.click();

        WebElement buttonSuccessText = driver.findElement(By.className("entry-title"));
        Assertions.assertEquals("Button success", buttonSuccessText.getText());
    }

    @Test
public void testTwo() throws InterruptedException {
    WebElement nameTextField = driver.findElement(By.id("et_pb_contact_name_0"));
    nameTextField.sendKeys("Tester");

    WebElement emailTextField = driver.findElement(By.id("et_pb_contact_email_0"));
    emailTextField.sendKeys("tester@tester.com");

    Thread.sleep(2000);

    WebElement emailMeButton = driver.findElement(By.name("et_builder_submit_button"));
    emailMeButton.click();

    Thread.sleep(2000);

    WebElement thanksForContactingUsText = driver.findElement(By.xpath("//div[@class='et-pb-contact-message']/p"));
    Assertions.assertEquals("Thanks for contacting us", thanksForContactingUsText.getText());

    

    }
}