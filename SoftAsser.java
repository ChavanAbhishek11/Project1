import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class SoftAsser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoftAssert softassert = new SoftAssert();
		String expectedresult = "Electronics,Motor,Fashion,Sport";
		String expectedText = "Search";
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		String actualresult = driver.getTitle();
		String actualText = driver.findElement(By.xpath("//input[@type='submit']")).getAttribute("value");
		softassert.assertEquals(actualText,expectedText);
		softassert.assertEquals(actualresult, expectedresult,"Test verification failed");
		
		softassert.assertAll();

	}

}
