package pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasicPage {

    public  By FisrtName = By.xpath("//input[@id='customer.firstName']");
    public  By LasttName = By.xpath("//input[@id='customer.lastName']");
    public  By Address = By.xpath("//input[@id='customer.address.street']");

//    public  By Email = By.xpath("//input[@id='userName']");

    public  By City = By.xpath("//input[@id='customer.address.city']");
    public  By State = By.xpath("//input[@id='customer.address.state']");
    public  By PostCode = By.xpath("//input[@id='customer.address.zipCode']");
    public  By Phone = By.xpath("//input[@id='customer.phoneNumber']");
    public  By Ssn = By.xpath("//input[@id='customer.ssn']");
//    select tag
//    public  By Country = By.xpath("//select[@name='country']");



    public  By userName = By.xpath("//input[@id='customer.username']");
    public By AlertText=By.xpath("//span[@id='customer.username.errors']");
    public  By Password = By.xpath("//input[@id='customer.password']");
    public  By ConfirmPass = By.xpath("//input[@id='repeatedPassword']");
    public  By RegisterBtn = By.xpath("//input[@value='Register']");
    public  By ConfirmSms = By.xpath("//div[@id='rightPanel']//p");


//******    Method part //******
    public void firstName(String firstname){
        writeText(FisrtName,firstname);
    }
    public void lastName(String lastname){
        writeText(LasttName,lastname);
    }

//    public void email(String email){
//        writeText(Email,email);
//    }
    public void address(String address){
        writeText(Address,address);
    }
    public void city(String city){
        writeText(City,city);
    }
    public void state(String state){
        writeText(State,state);
    }
    public void postcode(String postcode){
        writeText(PostCode,postcode);
    }
    public void phone(String number){
        writeText(Phone,number);
    }
    public void ssn(String ssn){
        writeText(Ssn,ssn);
    }

//    public void country(){
//        Dropdown(Country,"BANGLADESH");
//    }

    public void username(String username){
        writeText(userName, username);
    }
    public void password(String pass){
        writeText(Password, pass);
    }
    public void confirmpass(String cPass){
        writeText(ConfirmPass, cPass);
    }
    public void registerButton(){
        click(RegisterBtn);
    }
//    public void signin(){
//        click(SignIn);
//    }

}
