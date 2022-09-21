package POM_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	@FindBy(id="email")
	private WebElement username;
	@FindBy(id="pass")
	private WebElement password;
	@FindBy(name="login")
	private WebElement logbtn;
	public Loginpage(WebDriver driver)
	{PageFactory.initElements(driver,this);
}
public void setUsername(String un)
{username.sendKeys(un);
}
public void setPassword(String pwd)
{username.sendKeys(pwd);
}
public void clickLogin()
{logbtn.click();
}


}
