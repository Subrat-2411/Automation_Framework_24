package electronics;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericutility.BaseClass;
import genericutility.ListenerUtility;
import genericutility.WebDriverUtility;
import objectrepository.HomePage;
@Listeners(ListenerUtility.class)
public class TC_DWS_001_Test extends BaseClass {
	
	@Test
	public void mouseHoverOnElectronics()
	{
		
		WebDriverUtility wutil=new WebDriverUtility();
		
		HomePage hp=new HomePage(driver);
				
		wutil.mouseHover(driver,hp.getElectronicsLink());
		
		driver.findElement(By.xpath("(//a[contains(text(),'Cell')])[1]")).click();
		
	}
}
