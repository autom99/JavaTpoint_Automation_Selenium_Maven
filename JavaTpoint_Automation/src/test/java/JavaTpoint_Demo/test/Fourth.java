package JavaTpoint_Demo.test;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.ie.InternetExplorerDriver;  
  
public class Fourth {  
  
    public static void main(String[] args) {  
      
    	String project_path = "D:\\Testing Purpose\\EclipsePhoton Testing\\JavaTpoint_Automation";
    	
	    // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", project_path + "drivers\\IEDriverServer.exe");
            // System Property for IEDriver     
          
           // Instantiate a IEDriver class.       
        WebDriver driver=new InternetExplorerDriver();  
          
           // Launch Website  
        driver.navigate().to("http://www.google.com/");  
          
           //Maximize the browser  
          driver.manage().window().maximize();  
            
           // Click on the search text box and send value  
        driver.findElement(By.id("lst-ib")).sendKeys("javatpoint tutorials");  
              
           // Click on the search button  
        driver.findElement(By.name("btnK")).click();  
            
  
    }  
  
}  
