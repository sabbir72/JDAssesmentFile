package pages;

import org.openqa.selenium.By;

public class HomePage extends BasicPage {
	private By RegisterButton = By.xpath("//a[.='Register']");

	public By HomeNav=By.xpath("//li[@class='home']//a");


	public void RegisterBtn() {
		click(RegisterButton);
	}

    public void homeNav(){
		click(HomeNav);
	}
}
