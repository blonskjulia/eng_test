package main_tests;

import manage.TestBaseLogIn;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.remote.BrowserType;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Test_LogIn extends TestBaseLogIn {
    @BeforeSuite
    public void Start(){
        super.Start(BrowserType.CHROME);
    }

    @AfterSuite
    public void Stop(){
        super.Stop();
    }

    @Test
    public void LogIn() throws InterruptedException {
        ConfirmationCookie();
        ClickLogInButton();
        FillFormLogIn();
        SubmitForm();
        Thread.sleep(3000);
    }

    @Test
    public void LogInErrorsForm() throws InterruptedException {
        ClickLogo();
        ClickLogInButton();
        DisplayErrorsLogInForm();
    }

//    @Test
//    public void CheckForgotPassLogInForm(){
//        ClickLogInButton();
//        FillFormLogIn();
//        ForgotPasswordLogInForm();
//    }
//
//    @Test
//    public void CheckForgotPassEmptyLogInForm(){
//        ClickLogInButton();
//        FillFormLogIn();
//        ForgotPasswordEmptyFieldEmail();
//    }
//
//    @Test
//    public void CheckBackToLogin(){
//        ClickLogInButton();
//        FillFormLogIn();
//        ForgotPasswordBackToLogIn();
//    }



}

