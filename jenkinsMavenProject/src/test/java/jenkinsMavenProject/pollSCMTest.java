package jenkinsMavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class pollSCMTest {
	
	@Test
	public void onPoll()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Reporter.log("onPollScnTest Executed",true);
	}

}
