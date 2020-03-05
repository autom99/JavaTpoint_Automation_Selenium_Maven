package JavaTpoint_Demo.test;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;  
  
public class RadioButton_test {
	
	public static void main(String[] args) {  
        
String project_path = "D:\\Testing Purpose\\EclipsePhoton Testing\\JavaTpoint_Automation";
    	
	    // declaration and instantiation of objects/variables  
	    System.setProperty("webdriver.chrome.driver", project_path + "\\drivers\\chromedriver.exe");  
	    
	    ChromeOptions options = new ChromeOptions(); 
	    options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
	    
        // Instantiate a ChromeDriver class.      
        WebDriver driver=new ChromeDriver(options);
        
        try {
            driver.get(project_path + "\\Helper\\radiobutton.html");  
            
            int a = driver.findElements(By.xpath("//input [@name='group1']")).size();          
            System.out.println(a);  
            
            for(int i=1;i<=a;i++)  
            {  
                driver.findElements(By.xpath("//input[@name='group1']")).get(2).click();  
            }  			
		
        } catch (Exception e) {
			e.getStackTrace();
		
        }finally {
			driver.close();
		} 

    }
}
