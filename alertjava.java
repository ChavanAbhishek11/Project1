import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();

	}

}
