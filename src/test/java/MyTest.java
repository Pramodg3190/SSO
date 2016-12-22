import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class MyTest {
    @Test
    public void Webdriver()
    {
        System.setProperty("webdriver.gecko.driver","/home/pramodg/Desktop/Pramod/New Neon/Untitled Folder/geckodriver");
        WebDriver d = new FirefoxDriver();
        d.get("http://zow-stage.zetaapps.in/");
        /*String str = d.getTitle();
        System.out.print(str);*/
        //Assert.assertEquals("Zeta on Web",d.getTitle());
        Assert.assertEquals("Zeta Single Sign-on",d.getTitle());
        d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        d.findElement(By.id("mobile-number")).sendKeys("9999999999", Keys.ENTER);
        d.findElement(By.id("otp")).sendKeys("123456",Keys.ENTER);
        d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        //WebElement verify = d.findElement(By.xpath("//button[@class='btn btn-primary btn-block']"));
        //verify.isDisplayed();
        //verify.click();
        //d.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        d.findElement(By.id("password")).sendKeys("Single@123",Keys.ENTER);
        WebElement Home = d.findElement(By.xpath("//div[@id='app']"));
        Home.isDisplayed();
        System.out.print("Home screen displayed");
        String url = d.getCurrentUrl();

    }
}
