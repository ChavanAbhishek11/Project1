import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.hc.client5.http.entity.mime.FileBody;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.name("email")).sendKeys("100027998746741");
		driver.findElement(By.name("pass")).sendKeys("pratik*123");
		driver.findElement(By.xpath("//button [@ type='submit']")).click();
//		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(src,new File("C:\\work \\Screenshot.png"));
//	}
}
}

//driver.findElement(By.name("username")).sendKeys("Admin");