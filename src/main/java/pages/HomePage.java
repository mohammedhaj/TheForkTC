package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBase{

	public HomePage(WebDriver driver) {
		super(driver);
		jse= (JavascriptExecutor) driver;
		

	}
	@FindBy(css = "div.css-5hc53a.elkhwc30")
	WebElement hoveBtn;
	@FindBy(css = "button.evidon-banner-declinebutton")
	WebElement AcceptBtn;
	@FindBy(css = "svg.css-p3qwn0.eununuf0")
	WebElement ConnexionLink;
	@FindBy(css = "button._35vz9")
	WebElement clogin;


	

	public void OpenConnectuonPage() {

		clicbutton(AcceptBtn);
		clicbutton(hoveBtn);
		clicbutton(ConnexionLink);
	}
	public void clogin() {

		clicbutton(clogin);
	}
	
	}