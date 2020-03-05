package JavaTpoint_Demo.test;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.Alert;  

public class Alert_test {  
  
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
      
            //Handling alert boxes  
            //Click on generate alert button  
            driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();  
            Thread.sleep(2000); 
            
            //Using Alert class to first switch to or focus to the alert box  
            Alert alert = (Alert) driver.switchTo().alert();  
            Thread.sleep(2000);
            
            //Using accept() method to accept the alert box  
            alert.accept();  
            Thread.sleep(2000);
            
            //Handling confirm box  
            //Click on Generate Confirm Box  
            driver.findElement(By.xpath("//button[text()='Generate Confirm Box']")).click();  
            Thread.sleep(2000);
              	
            Alert confirmBox = (Alert) driver.switchTo().alert();  
            Thread.sleep(2000);
            
            //Using dismiss() command to dismiss the confirm box  
            //Similarly accept can be used to accept the confirm box  
            ((Alert) confirmBox).dismiss();  
            Thread.sleep(2000);      
			
		} catch (Exception e) {
			e.toString();
		}

        finally {
            driver.close();
		}
    }  
  
} 
