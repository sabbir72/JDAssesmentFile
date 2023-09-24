package pages;

import org.openqa.selenium.By;

public class SignPage extends BasicPage {
    public By SignuserName= By.xpath("//input[@name='username']");
    public By Password= By.xpath("//input[@name='password']");
    public By LoginBtn =By.xpath("//input[@value='Log In']");


    public void signuserName(String signname){
        writeText(SignuserName, signname);
    }
    public void signpass(String signpass){
        writeText(Password, signpass);
    }
    public void signBtn(){
        click(LoginBtn);
    }

}
