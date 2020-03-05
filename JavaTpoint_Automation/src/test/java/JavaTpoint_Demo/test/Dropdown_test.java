package JavaTpoint_Demo.test;
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;  

public class Dropdown_test {

	public static void main(String[] args) throws InterruptedException {  
         
	String project_path = "D:\\Testing Purpose\\EclipsePhoton Testing\\JavaTpoint_Automation";
    	
	    // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", project_path + "\\drivers\\chromedriver.exe");  
	    
	    ChromeOptions options = new ChromeOptions(); 
	    options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
	    
        // Instantiate a ChromeDriver class.      
        WebDriver driver=new ChromeDriver(options);

        try {
        	// Launch Website  
            driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");   
            Thread.sleep(2000);
      
            //Using Select class for selecting value from dropdown  
          
            Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));  
            dropdown.selectByVisibleText("Database Testing"); 
            Thread.sleep(2000);
		
        } catch (Exception e) {
			e.getStackTrace();
		
        } finally {
        	// Close the Browser  
            driver.close();  	  
		}
     	    
	}  
}
