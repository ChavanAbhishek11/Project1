import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxdriver {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new FirefoxDriver ();
		Thread.sleep(1000);
		driver.navigate().to("https://www.firefox.com");

	}

}
