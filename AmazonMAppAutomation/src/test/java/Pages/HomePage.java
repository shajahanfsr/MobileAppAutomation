package Pages;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
 
public class HomePage extends BasePage{ 
	//*********Constructor*********
    public HomePage (AppiumDriver<MobileElement> driver) {
        super(driver);
    }
 
    //*********Web Elements*********
    By signInButtonBy = By.className("btnSignIn");
        
 
 
    //*********Page Methods*********
   
    /**
     * Navigate to login page
     * @return LoginPage
     */
    public LoginPage goToLoginPage (){
        click(signInButtonBy);
        return new LoginPage(driver);
    }
    }