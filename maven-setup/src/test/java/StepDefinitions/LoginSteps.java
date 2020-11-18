package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;

public class LoginSteps {

	public static WebDriver driver;
	@Given("^User is on login page$")
	public void user_is_on_login_page() throws Throwable{
		System. setProperty("webdriver.chrome.driver", "D://chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http:/thedemosite.co.uk/login.php");
	}

	@When("^User enters valid userid and password$")
	public void user_enters_valid_userid_and_password() throws Throwable {
		driver.findElement(By.xpath("//a[@href=\"addauser.php\"]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("puja");
		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.xpath("//input[@value=\"save\"]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href=\"login.php\"]")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("puja");
		driver.findElement(By.name("password")).sendKeys("test");
	}

	@And("^User cicks on Login button$")
	public void user_cicks_on_login_button() throws Throwable {
		driver.findElement(By.name("FormsButton2")).click();
	}

	@Then("^User can be able to login successfully$")
	public void user_can_be_able_to_login_successfully() throws Throwable  {
		String expected = driver.findElement(By.xpath("//center/b")).getText();
		Assert.assertEquals(expected, "**Successful Login**");
		driver.quit();
	}

}
