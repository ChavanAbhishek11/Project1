package StepDefination;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class screenshot {
	WebDriver driver = new ChromeDriver();

@Given("open orange hrm  url")
public void open_orange_hrm_url() {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	File src =((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	try {
		FileUtils.copyDirectory(src, new File("C:\\Users\\chava\\OneDrive\\Documents\\Take\\sc2.jpg"));
	}
    catch(Exception e) {
    	
    }
}

}
