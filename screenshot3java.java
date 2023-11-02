import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class screenshot3java {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		File Src= ((TakesScreenshot) driver) .getScreenshotAs(OutputType.FILE);
		try {
			FileHandler.copy(Src, new File("C:\\Users\\chava\\OneDrive\\Desktop\\Screenshot\\sc3.jpg"));
			
		}
		catch(Exception e) {
			
		}

	}

}
