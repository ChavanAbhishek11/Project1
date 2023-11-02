import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class softasserted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.switchTo().frame("login_page");
		driver.findElement(By.linkText("CONTINUE")).click();
		Alert hdfcalert =driver.switchTo().alert();
		String actualresult = hdfcalert.getText() ;
		hdfcalert.accept();
		String expectedresult = "Customer ID  cannot be left blank.";
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals(actualresult,expectedresult);
		softassert.assertAll();
		
		
		

	}

}
//driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
//driver.manage().window().maximize();
//Thread.sleep(10000);
//driver.switchTo().frame("login_page");
//driver.findElement(By.linkText("CONTINUE")).click();
//Alert hdfcalert=driver.switchTo().alert();
//String actualresult=hdfcalert.getText();
//Thread.sleep(10000);
//hdfcalert.accept();
//System.out.println(actualresult);
//String excpectedresult="Customer ID  cannot be left blank.";
//SoftAssert softassert=new SoftAssert();
//softassert.assertEquals(actualresult,excpectedresult);
//softassert.assertAll();
//Thread.sleep(1000);
//driver.close();
