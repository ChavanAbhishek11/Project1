import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoveractionjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Actions mouse = new Actions(driver);
		mouse.moveToElement(driver.findElement(By.linkText("Sports"))).build().perform();
		

	}

}
