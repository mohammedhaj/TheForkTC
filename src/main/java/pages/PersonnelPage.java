package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonnelPage  extends PageBase{

	public PersonnelPage(WebDriver driver) {
		super(driver);

	}
	@FindBy(css = "svg.css-p3qwn0.e78l98l0")
	WebElement BtnPesrsonn;
	@FindBy(css = "h1.rFA3n")
	public WebElement messageassert;
	@FindBy(css = "a.css-h8vufy.e1kntgv41")
	WebElement openBk;
	@FindBy(id = "_evidon-accept-button")
	WebElement Accept;
	

	public void AcceptAlert()
	{	
		clicbutton(Accept);
	}
	public void meInforPers()
	{	
		clicbutton(BtnPesrsonn);
	}
	public void openBK()
	{	
		clicbutton(openBk);
	}
	

	
}