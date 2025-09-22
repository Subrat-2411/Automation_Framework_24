package computers;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import genericutility.WebDriverUtility;
import objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_001_Test extends BaseClass{


	@Test
	public void mouseHoverOnComputers()
	{
		
		
		HomePage hp=new HomePage(driver);
		
		
		WebDriverUtility util=new WebDriverUtility();
		
		util.mouseHover(driver,hp.getComputersLink());
		

		
		driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Desktops","Books Page is not Displayed.");
	}
}
