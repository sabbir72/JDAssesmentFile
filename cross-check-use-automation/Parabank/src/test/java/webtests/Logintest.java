package webtests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import pages.*;
import utilities.DriverSetup;

public class Logintest extends DriverSetup{
	HomePage WebHomePage = new HomePage();
	SignPage WebSignPage= new SignPage();
	NewAccount WebNewAccount = new NewAccount();
    FundTransfer WebFundTransfer= new FundTransfer();
	RegisterPage WebRegisterPage= new RegisterPage();




	@Test
	public void loginTest() throws InterruptedException {
		getDriver().get("https://parabank.parasoft.com");
        WebHomePage.RegisterBtn();
		WebRegisterPage.firstName("Sabbir");
		WebRegisterPage.lastName("Ahmed");
//		WebRegisterPage.email("st201907@gmail.com");
		WebRegisterPage.address("Tongi,Gazipur");
		WebRegisterPage.city("Gazipur");
		WebRegisterPage.state("Tongi");
		WebRegisterPage.postcode("1710");
		WebRegisterPage.phone("01935300000");
		WebRegisterPage.ssn("1919");
//		WebRegisterPage.country();
		WebRegisterPage.username("rabbi11");
		WebRegisterPage.password("Learn@123");
		WebRegisterPage.confirmpass("Learn@123");
		WebRegisterPage.registerButton();
//		Condition Part
        String Alert = WebRegisterPage.getText(WebRegisterPage.AlertText);
		if(Alert.equals("This username already exists.")) {
			System.out.println("This username already exists. So Go To Home Page.");
			WebHomePage.homeNav();
			WebSignPage.signuserName("rabbi11");
			WebSignPage.signpass("Learn@123");
			WebSignPage.signBtn();
			WebNewAccount.newaccount();
			WebNewAccount.newAccType();
            Thread.sleep(3000);
//			WebNewAccount.fromAccNumber();
			WebNewAccount.CreateAccount();
			WebFundTransfer.transferButton();
			Thread.sleep(3000);
			WebFundTransfer.amount("25");
			WebFundTransfer.FromAcc();
			Thread.sleep(3000);
			WebFundTransfer.ToAcc();
			WebFundTransfer.SubmitFund();

		}else{
			assertEquals(WebRegisterPage.getText(WebRegisterPage.ConfirmSms), "Your account was created successfully. You are now logged in.");
		}
	}



}
