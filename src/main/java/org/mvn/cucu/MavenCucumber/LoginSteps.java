package org.mvn.cucu.MavenCucumber;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

	WebDriver driver;
	
	@Given("^User launch demoqa application$")
	public void user_launch_demoqa_application()  {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\LOGANATHAN\\eclipse-workspace\\Ponni\\MavenCucumber\\src\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Register.html");
	       
	}

	@Given("^check the url$")
	public void check_the_url()  {
		String url = driver.getCurrentUrl();
	    if (url.equals("http://demo.automationtesting.in/Register.html")) {
	    	System.out.println(url);
		}
	    else {
	    	System.out.println("URL is wrong");
	    }
	       
	}

	@When("^User enter the required details$")
	public void user_enter_the_required_details()  {
	    
		driver.findElement(By.xpath("(//input[@type = 'text'])[1]")).sendKeys("Ponni");
		driver.findElement(By.xpath("(//input[@type = 'text'])[2]")).sendKeys("Parthiban");
		driver.findElement(By.xpath("//textarea[@ng-model= 'Adress']")).sendKeys("Taramani");
		driver.findElement(By.xpath("//input[@type= 'email']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//input[@type= 'tel']")).sendKeys("5657555527");
		driver.findElement(By.xpath("//input[@value= 'FeMale']")).click();
		driver.findElement(By.xpath("//input[@value= 'Movies']")).click();
		
		WebElement skill = driver.findElement(By.xpath("//select[@id= 'Skills']"));
		Select s1 = new Select(skill);
		s1.selectByVisibleText("Windows");
		WebElement coun = driver.findElement(By.xpath("//select[@id= 'countries']"));
		Select s2 = new Select(coun);
		s2.selectByVisibleText("India");
		WebElement country = driver.findElement(By.xpath("//select[@id= 'country']"));
		Select s3 = new Select(country);
		s3.selectByVisibleText("India");
		WebElement year = driver.findElement(By.xpath("//select[@id= 'yearbox']"));
		Select s4 = new Select(year);
		s4.selectByVisibleText("1989");
		WebElement month = driver.findElement(By.xpath("(//select[@type= 'text'])[4]"));
		Select s5 = new Select(month);
		s5.selectByVisibleText("December");
		WebElement day = driver.findElement(By.xpath("//select[@id= 'daybox']"));
		Select s6 = new Select(day);
		s6.selectByVisibleText("22");   
	}

	@When("^User enter the password$")
	public void user_enter_the_password()  {
	    WebElement pass = driver.findElement(By.xpath("//input[@id= 'firstpassword']"));
	   pass.sendKeys("Ponni456");
	   WebElement repass = driver.findElement(By.xpath("//input[@id= 'secondpassword']"));
	   repass.sendKeys("Ponni456");
	   
	   
	}

	@When("^User click Submit$")
	public void user_click_Submit()  {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	   
	}

	@Then("^User close the browser$")
	public void user_close_the_browser()  {
	    driver.quit();
	   
	}

	
}
