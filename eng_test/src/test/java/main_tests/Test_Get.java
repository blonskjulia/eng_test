package main_tests;

import manage.TestBaseGet;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Test_Get extends TestBaseGet {
    @BeforeSuite
    public void Start(){
        super.Start(BrowserType.CHROME);
    }

    @AfterSuite
    public void Stop(){
        super.Stop();
    }

    // GetStarted (ISA)
    @Test
    public void GetStartedProcess() throws InterruptedException {
        ConfirmationCookie();
        ClickOnGetStarted();  // step 1 click GetStarted button
        ClickGetStarted_ISA(); //step 2 select ISA account
        SelectOpenISA(); // step 3 select new ISA
        Thread.sleep(3000);
        FillFormAndSubmit(); // step 4 fill in form (year, invest) and submit
        SelectProportionInvest(); // step 5 select proportion of total investable
        SelectAnnualIncome();  // step 6 select annual income after tax
        SelectInvestTime(); // step 7 select invest time
        SelectMoreInvest(); // step 8 select more invest
        WhatWouldYouDo(); // step 9 What would you do if the market takes a downtown?
        SelectBigLoss(); // step 10 select bug loss
        SelecQuaranteedRate(); // step 11 select quaranteed rate
        SelectWithdraw(); // step 12 select withdraw
        SelecFinansInstrument(); // step 13 select checkbox
        FillEmailField(); // step 14 fill form and submit

    }

}





