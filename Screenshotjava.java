import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshotjava {
	

    public static void main(String[] args) {
        

        
        // Initialize ChromeDriver with the ChromeOptions.
        WebDriver driver = new ChromeDriver();

        
        driver.get("https://www.google.com");

        // Take a screenshot.
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        try {
            // Copy the screenshot to a specific location.
            FileHandler.copy(src, new File("C:\\Users\\chava\\OneDrive\\Desktop\\Screenshot\\sc1.jpg"));
        } catch (Exception e) {
            
        }

        
    }
}
