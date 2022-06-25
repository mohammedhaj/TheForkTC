package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegistrationPage extends PageBase{

	public UserRegistrationPage(WebDriver driver) {
		super(driver);

	}
	@FindBy(id ="identification_email")
	WebElement emailTextBox;
	@FindBy(css = "button.css-4nwwco.e1kntgv41")
	WebElement BtnNext;
	@FindBy(name = "firstName")
	WebElement fntxBox;
	@FindBy(name = "lastName")
	WebElement lntxBox;
	@FindBy(name = "password")
	WebElement passwordTxtBox;
	@FindBy(name = "phoneNumber.nationalNumber")
	WebElement TextTeleph;
	@FindBy(css ="svg.css-p3qwn0.e1o8d8m50" )
	WebElement RadioButton;
	@FindBy(css = "button.css-4nwwco.e1kntgv41")
	WebElement BTXinscrit;
	@FindBy(id ="user_space_logout")
	WebElement Logout;

	public void UserRegistration(String email)
	{

		setTextElementText(emailTextBox, email);
		clicbutton(BtnNext);
	}
	public void UserRegistrationconnection(String firstName,String lastName,String password,String phonenumber) {
		
		setTextElementText(fntxBox, firstName);
		setTextElementText(lntxBox, lastName);		
		setTextElementText(passwordTxtBox, password);
		setTextElementText(TextTeleph, phonenumber);
		clicbutton(RadioButton);	
		clicbutton(BTXinscrit);

	}
	public void Logout() {
		clicbutton(Logout);
	}

}
