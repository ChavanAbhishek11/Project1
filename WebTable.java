import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/chava/Downloads/WebTable.html");
	String value =driver.findElement(By.xpath("//tr[3]/td[2]")).getText();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		System.out.println("Value is  the object " + value);

	}    

}
