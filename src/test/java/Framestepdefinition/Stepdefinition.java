package Framestepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdefinition {
	 WebDriver driver;
	@Given("^Open URL$")
	public void open_URL() throws Throwable {
	   System.setProperty("webdriver.chrome.driver", "C:\\Web Driver\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://docs.oracle.com/javase/8/docs/api/");
	   driver.manage().window().maximize();
	   driver.manage().deleteAllCookies();
	}

	@Then("^Click AllClasses Frame$")
	public void click_AllClasses_Frame() throws Throwable {
	    driver.switchTo().frame("packageFrame");
	   
	    Thread.sleep(3000);
	}

	@Then("^Click Class AbstractButton$")
	public void click_Class_AbstractButton() throws Throwable {
	  driver.findElement(By.linkText("AbstractButton")).click();
	  Thread.sleep(3000);
	}

	@Then("^Verify Class AbstractButton Open Successfully$")
	public void verify_Class_AbstractButton_Open_Successfully() throws Throwable {
		 boolean fm= driver.findElement(By.linkText("AbstractButton")).isDisplayed();
		 Assert.assertTrue(fm);
		 Thread.sleep(3000);
	}

	@Then("^Close Window$")
	public void close_Window() throws Throwable {
	   driver.close();
	}


}
