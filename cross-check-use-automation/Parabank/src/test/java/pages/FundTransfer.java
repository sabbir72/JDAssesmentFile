package pages;

import org.openqa.selenium.By;

public class FundTransfer extends BasicPage {
    public By TranferBtn= By.xpath("//a[normalize-space()='Transfer Funds']");
    public By TransferAmmount=By.xpath("//input[@id='amount']");

    public By FromAccount=By.xpath("//select[@id='fromAccountId']");
    public By ToAccount=By.xpath("//select[@id='toAccountId']");
    public By TransferSubmit=By.xpath("//input[@value='Transfer']");

    public void transferButton(){
        click(TranferBtn);
    }
    public void amount(String amount){
        writeText(TransferAmmount,amount);
    }
    public void FromAcc(){
        Dropdown(FromAccount,"13455");
    }
    public void ToAcc(){
        Dropdown(FromAccount,"13566");
    }
    public void SubmitFund(){
        click(TransferSubmit);
    }
}
