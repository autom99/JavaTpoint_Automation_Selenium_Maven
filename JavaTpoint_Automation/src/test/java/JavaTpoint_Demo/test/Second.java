package JavaTpoint_Demo.test;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.firefox.FirefoxDriver;  
import org.openqa.selenium.remote.DesiredCapabilities;  
import org.openqa.selenium.support.ui.Select;  
  
public class Second {  
  
    public static void main(String[] args) {  
          
    	String project_path = "D:\\Testing Purpose\\EclipsePhoton Testing\\JavaTpoint_Automation";
        
    	// System Property for Gecko Driver   
    	System.setProperty("webdriver.gecko.driver", project_path + "\\drivers\\geckodriver.exe" );  
          
         // Initialize Gecko Driver using Desired Capabilities Class  
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();  
        capabilities.setCapability("marionette",true);  
        WebDriver driver= new FirefoxDriver(capabilities);  
        
        try {
        	 // Launch Website  
            driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");  
          
            // Fetch the text "This is sample text." and print it on console  
            // Use the class name of the div to locate it and then fetch text using getText() method  
         	String sampleText = driver.findElement(By.className("col-md-12")).getText();  
         	System.out.println(sampleText);  
              
            // Use the linkText locator method to find the link and perform click using click() method  
         	driver.findElement(By.linkText("This is a link")).click();  
           
            // Click on the textbox and send value  
         	driver.findElement(By.id("fname")).sendKeys("JavaTpoint");  
           
            // Clear the text written in the textbox  
         	driver.findElement(By.id("fname")).clear();  
              
            // Click on the Submit button using click() command  
         	driver.findElement(By.id("idOfButton")).click();  
       
            // Locate the radio button by id and check it using click() function  
         	driver.findElement(By.id("male")).click();  
              
            // Locate the checkbox by cssSelector and check it using click() function  
         	driver.findElement(By.cssSelector("input.Automation")).click();  
                  
            // Use Select class for selecting value from dropdown  
         	Select dropdown = new Select(driver.findElement(By.id("testingDropdown")));  
         	dropdown.selectByVisibleText("Automation Testing");  
		
        } catch (Exception e) {
			e.getStackTrace();
		}
       
        finally {
            // Close the Browser  
            driver.close();  
		}
        
     }    
}  

