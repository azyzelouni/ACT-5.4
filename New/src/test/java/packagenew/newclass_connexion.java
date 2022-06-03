
package packagenew;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class newclass_connexion {
	
	
	public static void main(String[] args) throws InterruptedException {
 
	// Provide path to chromedriver
	System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
	// Instantiate chromedriver class
	WebDriver driver = new ChromeDriver();

	driver.get("http://demo.guru99.com/test/newtours/");
	Thread.sleep(500);
	
//contact information
	
	driver.findElement(By.linkText("REGISTER")).sendKeys(Keys.ENTER);
	driver.findElement(By.name("firstName")).sendKeys("Mohamed Aziz");
	driver.findElement(By.name("lastName")).sendKeys("El Ouni");
	driver.findElement(By.name("phone")).sendKeys("58643733");
	driver.findElement(By.id("userName")).sendKeys("Mohamed-Aziz.el-ouni@talan.com");
	//mailing information
	driver.findElement(By.name("address1")).sendKeys("chargueya 1");
	driver.findElement(By.name("city")).sendKeys("Tunis");
	driver.findElement(By.name("state")).sendKeys("riadh andalous");
	driver.findElement(By.name("postalCode")).sendKeys("2058");
	driver.findElement(By.name("country")).sendKeys("TUNISIA");
	//User information
	driver.findElement(By.name("email")).sendKeys("AzizElouni94");
	driver.findElement(By.name("password")).sendKeys("21143733");
	driver.findElement(By.name("confirmPassword")).sendKeys("21143733");
	
	
	driver.findElement(By.name("submit")).click();	
	
	driver.findElement(By.linkText("sign-in")).click();
	driver.findElement(By.name("userName")).sendKeys("Mohamed-Aziz.el-ouni@talan.com");
	driver.findElement(By.name("password")).sendKeys("21143733");
	driver.findElement(By.name("submit")).click();

	
	
	
	
	
	
	
	}
   
}