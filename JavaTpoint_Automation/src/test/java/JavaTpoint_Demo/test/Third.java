package JavaTpoint_Demo.test;

import org.openqa.selenium.By;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;  
  
public class Third {  
  
    public static void main(String[] args) {  
      
    	String project_path = "D:\\Testing Purpose\\EclipsePhoton Testing\\JavaTpoint_Automation";
    	
	    // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", project_path + "\\drivers\\chromedriver.exe");  
	    
	    ChromeOptions options = new ChromeOptions(); 
	    options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
	    
        // Instantiate a ChromeDriver class.      
        WebDriver driver=new ChromeDriver(options);
        
        try {
            // Launch Website  
            driver.navigate().to("http://www.javatpoint.com/");  

            //Maximize the browser  
            driver.manage().window().maximize();  
              
            //Scroll down the webpage by 5000 pixels  
            JavascriptExecutor js = (JavascriptExecutor)driver;  
            js.executeScript("scrollBy(0, 5000)");   
            
            // Click on the Search button  
            driver.findElement(By.linkText("Core Java")).click();     			
            
        } catch (Exception e) {
			e.getStackTrace();
		}

        finally {
			driver.close();
		}
    }  
  
}  
