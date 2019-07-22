

import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
public class NewTest {
	WebDriver driver;
  @Test
  public void NavigateBrowser() {
	  driver.get("https://www.irctc.co.in/nget/train-search");
  }
  @BeforeMethod
  public void beforeMethod() {
	 // System.setProperty("webdriver.ie.driver","C:\\Users\\test\\Desktop\\praveen\\driver\\IEDriverServer.exe");
	 // driver= new InternetExplorerDriver();
	  //System.setProperty("webdriver.chrome.driver","C:\\Users\\test\\Desktop\\praveen\\driver\\chromedriver.exe");
	 // driver= new ChromeDriver();
	  System.setProperty("webdriver.edge.driver","C:\\Users\\test\\Desktop\\praveen\\driver\\msedgedriver.exe");
	  driver= new EdgeDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      //new Object[] { 1, "a" },
      //new Object[] { 2, "b" },
    };
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
