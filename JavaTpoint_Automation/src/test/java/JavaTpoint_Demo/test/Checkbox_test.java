package JavaTpoint_Demo.test;


import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;  
public class Checkbox_test   
{  
  
	public static void main(String[] args)   
	{  
		String project_path = "D:\\Testing Purpose\\EclipsePhoton Testing\\JavaTpoint_Automation";
    	
	    // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", project_path + "\\drivers\\chromedriver.exe");  
	    
	    ChromeOptions options = new ChromeOptions(); 
	    options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
	    
        // Instantiate a ChromeDriver class.      
        WebDriver driver=new ChromeDriver(options);
        
        try {
		    	driver.navigate().to("https://www.spicejet.com/");  
		        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());  
	
		        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();  
		        System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());  	
		
        } catch (Exception e) {
        	e.toString();		
        }
        
        finally {
            driver.close();  	
		}        
	 }  
  
}  
