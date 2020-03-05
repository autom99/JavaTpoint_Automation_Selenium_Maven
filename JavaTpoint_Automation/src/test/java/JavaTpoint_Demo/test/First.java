package JavaTpoint_Demo.test;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;  
  
public class First {  
  
    public static void main(String[] args) {  
       
    	String project_path = "D:\\Testing Purpose\\EclipsePhoton Testing\\JavaTpoint_Automation";
    	
	    // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", project_path + "\\drivers\\chromedriver.exe");  
	    
	    ChromeOptions options = new ChromeOptions(); 
	    options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
	    
        // Instantiate a ChromeDriver class.      
        WebDriver driver=new ChromeDriver(options);
	 
        try {
     	   // Launch website  
    	    driver.navigate().to("http://www.google.com/");  
    	          
    	    // Click on the search text box and send value  
    	    driver.findElement(By.name("q")).sendKeys("javatpoint tutorials");  
    	          
    	    // Click on the search button  
    	    driver.findElement(By.name("btnK")).click();  
    	    
		} catch (Exception e) {
			e.getStackTrace();
		}
        finally {
			driver.close();
		}      
    }    
}  
