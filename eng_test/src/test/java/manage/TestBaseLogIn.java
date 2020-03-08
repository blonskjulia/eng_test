package manage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TestBaseLogIn extends TestBase {
    //WebElement form;
    //WebElement sendResetEmail;

    public void ClickLogInButton() {
        driver.findElement(By.xpath("//span[contains(text(),'Log in')]")).click();
    }

    public void FillFormLogIn(){
        GetEmailField();
        InputMail();
        GetPassField();
        InputPass();
    }
    public void SubmitForm(){
        driver.findElement(By.cssSelector("[type='submit']")).click();
    }

    public void DisplayErrorsLogInForm() throws InterruptedException {
        GetEmailField();
        ClickEmailField();
        Thread.sleep(2000);
        GetPassField();
        ClickPassField();
        Thread.sleep(2000);
        WebElement error_email=driver.findElement(By.xpath("//div[@class='Label-Text']"));
        if(error_email.isDisplayed()){
            error_email.getText();
        } else{
            System.out.println("Error email is not displayed");
        }
        driver.findElement(By.xpath("//span[@class='Text Text_center Text_small Text_block']")).click();
        WebElement error_pass=driver.findElement(By.xpath("//div[contains(text(),'Password can')]"));
        if(error_pass.isDisplayed()){
            error_pass.getText();
        } else{
            System.out.println("Error pass is not displayed");
        }
    }

//    public void ForgotPasswordLogInForm(){
//        WebElement emailField=driver.findElement(By.xpath("//input[@class='Input Input_size_bigger Input_type_email']"));
//        driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]")).click();
//        emailField.click();
//        emailField.clear();
//        emailField.sendKeys("test@test.com");
//        sendResetEmail.click();
//        Assert.assertTrue(form.isDisplayed());
//    }

//    public void ForgotPasswordEmptyFieldEmail(){
//        WebElement emailField=driver.findElement(By.xpath("//input[@class='Input Input_size_bigger Input_type_email']"));
//        driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]")).click();
//        emailField.click();
//        driver.findElement(By.xpath("//div[@class='Card Card_theme_white Card_theme_straight-corners Card_theme_shadowed Card_padding_big Card_padding_invert Card_desktop']")).click();
//        WebElement error_forgotpass=driver.findElement(By.xpath("//div[@class='ErrorMessage']"));
//        if(emailField==null&&error_forgotpass.isDisplayed()){
//            Assert.assertTrue(error_forgotpass.getText().contains("Email can’t be empty"));
//        } else{
//            Assert.fail("Error forgot email is not displayed");
//        }
//    }
//    public void ForgotPasswordBackToLogIn(){
//        WebElement emailField=driver.findElement(By.xpath("//input[@class='Input Input_size_bigger Input_type_email']"));
//        driver.findElement(By.xpath("//a[contains(text(),'Forgot password?')]")).click();
//        emailField.click();
//        emailField.clear();
//        emailField.sendKeys("test@test.com");
//        driver.findElement(By.xpath("//a[contains(text(),'Back to login')]")).click();
//        sendResetEmail.click();
//        Assert.assertTrue(form.isDisplayed());
//    }

}






