package pages;

import org.openqa.selenium.By;

public class NewAccount extends BasicPage {

    public By NewAccount= By.xpath("//a[normalize-space()='Open New Account']");
    public By NewAccountType= By.xpath("//select[@id='type']");
    public By FromAccountNumber= By.xpath("//select[@id='fromAccountId']");
    public By AccountCreate= By.xpath("//input[@value='Open New Account']");


    public void newaccount(){
        click(NewAccount);
    }
    public void newAccType(){
        Dropdown(NewAccountType, "SAVINGS");
    }
//    public void fromAccNumber(){
//        Dropdown(FromAccountNumber, "17673");
//    }

    public void CreateAccount(){
        click(AccountCreate);
    }

}
