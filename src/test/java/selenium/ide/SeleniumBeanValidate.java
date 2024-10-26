package selenium;

import com.example.prove_varie.Classi.Selenium.SeleniumTest;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumBeanValidate {
    @Test
    void testValidate() {
        // Setup WebDriver
        System.setProperty("webdriver.chrome.driver", "src/test/java/selenium/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // // Get a future date from random.org
        // driver.get("https://www.superprof.it/lezione/matematica/italia/");
        // WebElement fareElement = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[4]/div[1]/div/div[1]/a/div/div[2]/div/ul/li[1]/span[2]"));
        // String fare = fareElement.getText().substring(0, fareElement.getText().length() - 5);

        // Close the driver
        driver.quit();

        // Create a LessonBean and set the date
        /*
        ProfileTeacherBean profileTeacherBean = new ProfileTeacherBean();
        profileTeacherBean.setFare(fare);

        // Call validate and assert it returns true
        assertTrue(profileTeacherBean.fareValidate());  */
    }

}
