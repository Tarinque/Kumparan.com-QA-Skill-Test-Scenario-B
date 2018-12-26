import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFacebook {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://kumparan.com/");
		driver.findElement(By.xpath("//button[@data-qa-id=\"btn-login-fb\"]")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("tes@ymail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("tes");
		driver.findElement(By.xpath("//input[@name='login']")).click();
	}

}
