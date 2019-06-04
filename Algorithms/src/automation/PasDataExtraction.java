package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PasDataExtraction {
	  
	public static void main(String[] args) throws Exception {
		
		//String path = System.getProperty("user.dir") + "/";
		System.setProperty("webdriver.gecko.driver", "/Users/nshreyas/Downloads/geckodriver");
		// Create an instance of the driver
	    WebDriver driver = new FirefoxDriver();
	 
	    // Navigate to a web page
	    driver.get("http://pas-explorer-prod-fe.amazon.com/pasExplorer/explorer.html#server=pas-fe-prod.amazon.com&methodName=byAsin&inp_marketplaceId=A1VC38T7YXB528&inp_asin=B00AQY7FMQ&fct__24_Input=High&fct__24_Test=High&fct_ApplicablePromotions=High&fct_B2BMerchantInfo=High&fct_B2BOLPItem=High&fct_B2BOLPOffers=High&fct_BrowseIDs=High&fct_BundleDiscoverabilityResults=High&fct_BundleSavings=High&fct_Campus=High&fct_Client_5f_DigitalMusicLocatorService=High&fct_Client_5f_OlpOffersData=High&fct_Client_5f_OlpOffersDeliveryData=High&fct_Client_5f_Pangea=High&fct_Client_5f_UpsellWidgetSchedulerService=High&fct_Client_5f_VAS=High&fct_Description=High&fct_DigitalProductInfo=High&fct_DigitalVideoCatalog=High&fct_Entity=High&fct_ExtendedAttributes=High&fct_InputParameters=High&fct_MS3=High&fct_MarketplaceInformation=High&fct_Media=High&fct_Merchandising=High&fct_MerchantCertification=High&fct_MerchantContactInfo=High&fct_OLPItem=High&fct_OLPOffers=High&fct_OfferBuyability=High&fct_Offers=High&fct_Price=High&fct_PrimaryOfferSpecificImages=High&fct_ProductAttributes=High&fct_ProductAttributesV2=High&fct_ProductEnhancedContent=High&fct_RawItem=High&fct_RawOfferContent=High&fct_RawRelationsOfChild=High&fct_RawRelationsOfParent=High&fct_Relations=High&fct_RentalOffers=High&fct_SalesRanks=High&fct_SellerFeedbackSummary=High&fct_Shipping=High&fct_ShippingCharges=High&fct_Zeroes=High&outputFormat=application%2Fjson");
	    synchronized (driver)
	    {
	        driver.wait(5000);
	    }
	    String pasResponse = driver.findElement(By.id("customInputs")).getText();
	    System.out.println("customerInputs" + pasResponse);
	    String content = driver.switchTo().frame(driver.findElement(By.cssSelector("#resultContainer > iframe"))).getPageSource();
	    
	    //WebElement element = driver.findElement(By.cssSelector("#resultContainer > iframe"));
	    //String resultDisplay = element.getText();
	    System.out.println("Shreyas" + content);
	    // Perform actions on HTML elements, entering text and submitting the form
	    //WebElement usernameElement     = driver.findElement(By.name("username"));
	    //WebElement passwordElement     = driver.findElement(By.name("password"));
	    //WebElement formElement        = driver.findElement(By.id("loginForm"));
	 
	    //usernameElement.sendKeys("Alan Smithee");
	    //passwordElement.sendKeys("twilightZone");
	 
	    //passwordElement.submit(); // submit by text input element
	    //formElement.submit();        // submit by form element
	 
	 
	    // Anticipate web browser response, with an explicit wait
//	    WebDriverWait wait = new WebDriverWait(driver, 10);
//	    WebElement messageElement = wait.until(
//	           ExpectedConditions.presenceOfElementLocated(By.id("loginResponse"))
//	            );
//	 
//	    // Run a test
//	    String message                 = messageElement.getText();
//	    String successMsg             = "Welcome to foo. You logged in successfully.";
	    
	 
	    // Conclude a test
	    driver.close();
	    driver.quit();
		
	}

}
