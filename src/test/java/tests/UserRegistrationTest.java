package tests;





import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;


import pages.HomePage;
import pages.LoginPage;
import pages.PersonnelPage;
import pages.UserRegistrationPage;

public class UserRegistrationTest extends TestBase{
	HomePage homeObject;
	UserRegistrationPage registerObject;
	PersonnelPage personnelObject;
	LoginPage loginObject;

	Faker fakeData =new Faker();
	String firstname = fakeData.name().firstName(); 
	String lastname = fakeData.name().lastName(); 
	String email = fakeData.internet().emailAddress(); 
	String password = fakeData.toString().toUpperCase();
	String phonenumber=fakeData.number().digits(9);


	@Test(priority=1,alwaysRun=true)

	public void UserCanRegisterSuccssfully() {


		homeObject =new HomePage(driver);		
		registerObject=new UserRegistrationPage(driver);
		personnelObject=new PersonnelPage(driver);		
		homeObject.OpenConnectuonPage();
		registerObject=new UserRegistrationPage(driver);
		registerObject.UserRegistration(email);
		registerObject.UserRegistrationconnection(firstname, lastname, password,phonenumber);
		personnelObject.meInforPers();
		System.out.println("The Userr Data is : "+ firstname + " " + lastname + " " + email );
		Assert.assertTrue(personnelObject.messageassert.getText().contains(firstname) );


	}
	@Test(dependsOnMethods= {"UserCanRegisterSuccssfully"})
	public void UserRegistreCanLogout() {
		registerObject.Logout();
	}
	@Test(dependsOnMethods= {"UserRegistreCanLogout"})
	public void UserRegistreCanLogin() throws InterruptedException {

		homeObject.clogin();
		loginObject=new LoginPage(driver);
		loginObject.UserLogin(email, password);
		Thread.sleep(9000); 

	}

}
