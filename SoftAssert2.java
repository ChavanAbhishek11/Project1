import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class SoftAssert2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SoftAssert softassert = new SoftAssert();
		String expectedresult ="Username,password" ;
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String actualresult = driver.getTitle();
		softassert .assertEquals(expectedresult,actualresult,"Test case are not verified");
		softassert.assertAll();
		
		
		
		

	}

}
