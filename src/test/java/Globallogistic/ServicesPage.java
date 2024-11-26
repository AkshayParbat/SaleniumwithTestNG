package Globallogistic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ServicesPage {

String driverPath ="C:\\Users\\Diligent-1064\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe";
	
	WebDriver driver = new ChromeDriver();
	
	 @BeforeTest
		void Navigate() throws InterruptedException
		{
		driver.get("https://globallogistic.co.in/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		}
	 
	 @Test(priority=1)
	 void ServicePage() throws InterruptedException
		{
		 WebElement TopNavService = driver.findElement(By.xpath("//span[normalize-space()='Services']"));
		 boolean displayed43 = TopNavService.isDisplayed();
		 System.out.println(displayed43);
		 TopNavService.click();
			Thread.sleep(2000);
		}
	 
	    @Test(priority=2)
	     void ServicesHeading() throws InterruptedException
	   	{
		 WebElement OurServicesHeading = driver.findElement(By.xpath("//span[normalize-space()='Services']"));
		 boolean displayed44 = OurServicesHeading.isDisplayed();
		 System.out.println(displayed44);
		 Thread.sleep(2000);
	   	}
	    
	    @Test(priority=3)
	     void IntFreightForBlog() throws InterruptedException
	   	{
		 WebElement IntFreightForwImage = driver.findElement(By.xpath("//span[@class='image-overlay overlay-type-extern']"));
		 boolean displayed45 = IntFreightForwImage.isDisplayed();
		 System.out.println(displayed45);
		 IntFreightForwImage.click();
		// Actions actions = new Actions(driver);
		// actions.moveToElement(IntFreightForwImage).click().perform();
		 Thread.sleep(2000);
		 
		 
//		 driver.navigate().back();
		 
		 WebElement IntFreightForwName = driver.findElement(By.xpath("//h3[normalize-space()='International Freight Forwarding']"));
		 boolean displayed46 = IntFreightForwName.isDisplayed();
		 System.out.println(displayed46);
		 
		 WebElement IntFreightForwInfo = driver.findElement(By.xpath("//p[contains(text(),'Global Logistic Service, An IATA certified freight')]"));
		 boolean displayed47 = IntFreightForwInfo.isDisplayed();
		 System.out.println(displayed47);
		 
	   	}
	    
	    @Test(priority=4)
	     void AirFreightBlog() throws InterruptedException
	   	{
		 WebElement AirFreightImage = driver.findElement(By.xpath("//div[contains(@class,'flex_column av_one_half av-animated-generic bottom-to-top flex_column_div av-zero-column-padding avia-builder-el-7 el_after_av_one_half el_before_av_one_half avia_start_animation avia_start_delayed_animation')]//span[contains(@class,'image-overlay overlay-type-extern')]"));
		 boolean displayed48 = AirFreightImage.isDisplayed();
		 System.out.println(displayed48);
		 AirFreightImage.click();
		 Thread.sleep(2000);
//		 driver.navigate().back();
		 
		 WebElement AirFreightName = driver.findElement(By.xpath("//h3[normalize-space()='Air Freight']"));
		 boolean displayed49 = AirFreightName.isDisplayed();
		 System.out.println(displayed49);
		 
		 WebElement AirFreightInfo = driver.findElement(By.xpath("//p[contains(text(),'We are your source for air freight services with a')]"));
		 boolean displayed50 = AirFreightInfo.isDisplayed();
		 System.out.println(displayed50);
		 
	   	}
	    
	    @Test(priority=5)
	     void SeaFreightBlog() throws InterruptedException
	   	{
		 WebElement SeaFreightImage = driver.findElement(By.xpath("//div[contains(@class,'flex_column av_one_half av-animated-generic bottom-to-top flex_column_div av-zero-column-padding first avia-builder-el-12 el_after_av_one_half el_before_av_one_half column-top-margin avia_start_animation avia_start_delayed_animation')]//span[contains(@class,'image-overlay overlay-type-extern')]"));
		 boolean displayed51 = SeaFreightImage.isDisplayed();
		 System.out.println(displayed51);
		 SeaFreightImage.click();
		 Thread.sleep(2000);
//		 driver.navigate().back();
		 
		 WebElement SeaFreightName = driver.findElement(By.xpath("//h3[normalize-space()='Sea Freight Services']"));
		 boolean displayed52 = SeaFreightName.isDisplayed();
		 System.out.println(displayed52);
		 
		 WebElement SeaFreightInfo = driver.findElement(By.xpath("//p[contains(text(),'Choose our sea freight services when your shipment')]"));
		 boolean displayed53 = SeaFreightInfo.isDisplayed();
		 System.out.println(displayed53);
		 
	   	}
	    
	    @Test(priority=6)
	     void LandTransportBlog() throws InterruptedException
	   	{
		 WebElement LandTransImage = driver.findElement(By.xpath("//div[contains(@class,'flex_column av_one_half av-animated-generic bottom-to-top flex_column_div av-zero-column-padding avia-builder-el-17 el_after_av_one_half el_before_av_one_half column-top-margin avia_start_animation avia_start_delayed_animation')]//span[contains(@class,'image-overlay overlay-type-extern')]"));
		 boolean displayed54 = LandTransImage.isDisplayed();
		 System.out.println(displayed54);
		 LandTransImage.click();
		 Thread.sleep(2000);
//		 driver.navigate().back();
		 
		 WebElement LandTransName = driver.findElement(By.xpath("//h3[normalize-space()='Land Transportation']"));
		 boolean displayed55 = LandTransName.isDisplayed();
		 System.out.println(displayed55);
		 
		 WebElement LandTransInfo = driver.findElement(By.xpath("//p[contains(text(),'Global Logistic Service can offer a road to road o')]"));
		 boolean displayed56 = LandTransInfo.isDisplayed();
		 System.out.println(displayed56);
		 
	   	}
	    
	    @Test(priority=7)
	     void CustomBrokerBlog() throws InterruptedException
	   	{
		 WebElement CustomeBrokerImage = driver.findElement(By.xpath("//div[contains(@class,'flex_column av_one_half av-animated-generic bottom-to-top flex_column_div av-zero-column-padding first avia-builder-el-22 el_after_av_one_half el_before_av_one_half column-top-margin avia_start_animation avia_start_delayed_animation')]//span[contains(@class,'image-overlay overlay-type-extern')]"));
		 boolean displayed57 = CustomeBrokerImage.isDisplayed();
		 System.out.println(displayed57);
		 CustomeBrokerImage.click();
		 Thread.sleep(2000);
//		 driver.navigate().back();
		 
		 WebElement CustomeBrokerName = driver.findElement(By.xpath("//h3[normalize-space()='Custom Broker']"));
		 boolean displayed58 = CustomeBrokerName.isDisplayed();
		 System.out.println(displayed58);
		 
		 WebElement CustomeBrokerInfo = driver.findElement(By.xpath("//p[contains(text(),'Global Logistic Service is one of the leading Cust')]"));
		 boolean displayed59 = CustomeBrokerInfo.isDisplayed();
		 System.out.println(displayed59);
		 
	   	}
	    
	    @Test(priority=8)
	     void CustomHouseAgentBlog() throws InterruptedException
	   	{
		 WebElement CustomHouseAgentImage = driver.findElement(By.xpath("//div[contains(@class,'flex_column av_one_half av-animated-generic bottom-to-top flex_column_div av-zero-column-padding avia-builder-el-27 el_after_av_one_half el_before_av_one_half column-top-margin avia_start_animation avia_start_delayed_animation')]//span[contains(@class,'image-overlay overlay-type-extern')]"));
		 boolean displayed60 = CustomHouseAgentImage.isDisplayed();
		 System.out.println(displayed60);
		 CustomHouseAgentImage.click();
		 Thread.sleep(2000);
//		 driver.navigate().back();
		 
		 WebElement CustomHouseAgentName = driver.findElement(By.xpath("//h3[normalize-space()='Custom House Agent']"));
		 boolean displayed61 = CustomHouseAgentName.isDisplayed();
		 System.out.println(displayed61);
		 
		 WebElement CustomeHouseAgentInfo = driver.findElement(By.xpath("//p[contains(text(),'We are also highly acknowledged as well as steadfa')]"));
		 boolean displayed62 = CustomeHouseAgentInfo.isDisplayed();
		 System.out.println(displayed62);
		 
	   	}
	    
	    @Test(priority=9)
	     void ExportConsultancyBlog() throws InterruptedException
	   	{
		 WebElement ExportConsultancyImage = driver.findElement(By.xpath("//div[contains(@class,'flex_column av_one_half av-animated-generic bottom-to-top flex_column_div av-zero-column-padding first avia-builder-el-32 el_after_av_one_half el_before_av_one_half column-top-margin avia_start_animation avia_start_delayed_animation')]//span[contains(@class,'image-overlay overlay-type-extern')]"));
		 boolean displayed63 = ExportConsultancyImage.isDisplayed();
		 System.out.println(displayed63);
		 ExportConsultancyImage.click();
		 Thread.sleep(2000);
//		 driver.navigate().back();
		 
		 WebElement ExportConsultancyName = driver.findElement(By.xpath("//h3[normalize-space()='Export Consultancy']"));
		 boolean displayed64 = ExportConsultancyName.isDisplayed();
		 System.out.println(displayed64);
		 
		 WebElement ExportConsultancyInfo = driver.findElement(By.xpath("//p[contains(text(),'With the support of our talented and skilled profe')]"));
		 boolean displayed65 = ExportConsultancyInfo.isDisplayed();
		 System.out.println(displayed65);
		 
	   	}
	    
	    @Test(priority=10)
	     void WareHousePackBlog() throws InterruptedException
	   	{
		 WebElement WareHousePackImage = driver.findElement(By.xpath("//div[contains(@class,'flex_column av_one_half av-animated-generic bottom-to-top flex_column_div av-zero-column-padding avia-builder-el-37 el_after_av_one_half avia-builder-el-last column-top-margin avia_start_animation avia_start_delayed_animation')]//span[contains(@class,'image-overlay overlay-type-extern')]"));
		 boolean displayed66 = WareHousePackImage.isDisplayed();
		 System.out.println(displayed66);
		 WareHousePackImage.click();
		 Thread.sleep(2000);
//		 driver.navigate().back();
		 
		 WebElement WareHousePackName = driver.findElement(By.xpath("//h3[normalize-space()='Warehouse Packaging']"));
		 boolean displayed67 = WareHousePackName.isDisplayed();
		 System.out.println(displayed67);
		 
		 WebElement WareHousePackInfo = driver.findElement(By.xpath("//p[contains(text(),'At Global Logistic Service we offer a far-reaching')]"));
		 boolean displayed68 = WareHousePackInfo.isDisplayed();
		 System.out.println(displayed68);
		 
	   	}
	 
}
