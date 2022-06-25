package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase {

	public LoginPage(WebDriver driver) {
		super(driver);

	}
	@FindBy(id ="identification_email")
	WebElement emailTextBox;
	@FindBy(id = "password")
	WebElement passwordTxtBox;
	@FindBy(css = "button.css-4nwwco.e1kntgv41")
	WebElement loginBtn;
	
	
	public void UserLogin(String email,String password)
	{
		setTextElementText(emailTextBox,email);
		clicbutton(loginBtn);
		setTextElementText(passwordTxtBox, password);
		clicbutton(loginBtn);
	}
}
