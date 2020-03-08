package manage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public abstract class TestBase {
    protected WebDriver driver;
    WebElement loginEmail;
    WebElement loginPassword;
    Actions actions;

    protected void Start(String browser){
        if (browser.equalsIgnoreCase("chrome"))
        {
            driver= new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();
        }
        else if(browser.equalsIgnoreCase("edge"))
        {
            driver = new EdgeDriver();
        }
        else{
            Assert.fail("Wrong browser");
        }
        driver.navigate().to("https://rscwealth.com/?inv=c5f669dd0e1659a6723d294b60c15b62f9756133&eid=eWV0YW5vdGhlcmFwZUBnbWFpbC5jb20");
        driver.manage().window().maximize();
        actions = new Actions(driver);
    }

    public void SwitchToMainWindow()
    {
        String mainWindowHandle = driver.getWindowHandle();
        driver.switchTo().window(mainWindowHandle);
    }

    public void SwitchToMyWindow()
    {
        String myWindowHandle = driver.getWindowHandle();
        driver.switchTo().window(myWindowHandle);
    }
    public void ConfirmationCookie() {
        WebElement button = driver.findElement(By.xpath("//button[@class='CookiesInfo-AcceptBtn Button Button_theme_simple-reverse-green']"));
        button.click();
    }

    void GetEmailField() {
        this.loginEmail = driver.findElement(By.xpath("//input[@type='email']"));
    }

    public void InputMail(){
        actions.moveToElement(loginEmail).click().sendKeys("test223@test.com").build().perform();
    }
    public void ClickEmailField() {
        this.loginEmail.click();
    }

    void GetPassField(){
        this.loginPassword = driver.findElement(By.xpath("//input[@type='password']"));
    }

    public void InputPass()
    {
        actions.moveToElement(loginPassword).click().sendKeys("qwerty222").build().perform();
    }

    public void ClickPassField() {
        this.loginPassword.click();
    }

    public void ClickLogo(){
        driver.findElement(By.xpath("//span[@class='SvgIcon']")).click();
    }

    protected void Stop()
    {
        driver.quit();
    }
}
