package manage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TestBaseGet extends TestBase
{
    public void ClickOnGetStarted() {
        driver.findElement(By.xpath("//a[@class='Button Button_color_green Button_size_small Button_size_block Button_text_smaller']"));
    }
    public void ClickGetStarted_ISA() {
        driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
    }
    public void SelectOpenISA() throws InterruptedException {
        SwitchToMainWindow();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//span[contains(text(),'Open a new ISA')]")).click();
        SwitchToMyWindow();
    }
    public void FillFormAndSubmit() throws InterruptedException {
        Actions actions = new Actions(driver);
        WebElement year = driver.findElement(By.xpath("//input[@data-test-id='onboardingStepGetStartedInputAge']"));
        actions.moveToElement(year).click().sendKeys("25").build().perform();
        WebElement invest = driver.findElement(By.xpath("//input[@data-test-id='onboardingStepGetStartedInputInitialDeposit']"));
        actions.moveToElement(invest).click().sendKeys("20000").build().perform();
        driver.findElement(By.xpath("//div[@class='Card Card_theme_transparent Card_padding_biggest Card_no-padding_right Card_no-padding_bottom Card_no-padding_left Card_no-padding-keyboard-shown_top Card_desktop']")).click();
        Thread.sleep(3000);
    }
    public void SelectProportionInvest() throws InterruptedException {
        driver.findElement(By.xpath("(//span[@class='SelectableCard SelectableCard_stretch SelectableCard_center Link'])[2]")).click();
        Thread.sleep(5000);
    }

    public void SelectAnnualIncome() throws InterruptedException {
        driver.findElement(By.xpath("(//div[@class='SelectableCard-Card Card Card_desktop'])[3]")).click();
        Thread.sleep(5000);
    }
    public void SelectInvestTime() throws InterruptedException {
        driver.findElement(By.xpath("(//div[@class='SelectableCard-Card Card Card_desktop'])[2]")).click();
        Thread.sleep(5000);
    }
    public void SelectMoreInvest() throws InterruptedException {
        driver.findElement(By.xpath("(//div[@class='SelectableCard-Card Card Card_desktop'])[3]")).click();
        Thread.sleep(5000);
    }
    public void WhatWouldYouDo() throws InterruptedException {
        driver.findElement(By.xpath("(//div[@class='SelectableCard-Card Card Card_desktop'])[3]")).click();
        Thread.sleep(5000);
    }
    public void SelectBigLoss() throws InterruptedException {
        driver.findElement(By.xpath("(//div[@class='SelectableCard-Card Card Card_desktop'])[1]")).click();
        Thread.sleep(5000);
    }
    public void SelecQuaranteedRate() throws InterruptedException {
        driver.findElement(By.xpath("(//span[@class='Text Text_center Text_block'])[2]")).click();
        Thread.sleep(5000);
    }
    public void SelectWithdraw() throws InterruptedException {
        driver.findElement(By.xpath("(//div[@class='SelectableCard-Card Card Card_desktop'])[2]")).click();
        Thread.sleep(5000);
    }
    public void SelecFinansInstrument() throws InterruptedException {
        driver.findElement(By.xpath("(//div[@class='Checkbox'])[3]")).click();
        driver.findElement(By.xpath("(//div[@class='Checkbox'])[4]")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
    }
    public void FillEmailField() throws InterruptedException {
        SwitchToMainWindow();
        Thread.sleep(3000);
        GetEmailField();
        InputMail();
        driver.findElement(By.xpath("//div[@class='Checkbox']//input")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@class='Card Card_theme_transparent Card_no-padding_left Card_no-padding_right Card_no-padding_bottom Card_desktop']//div[@class='Width Width_center']")).click();

    }
}

