import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginGoogle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://kumparan.com/");
		driver.findElement(By.xpath("//button[@data-qa-id=\"btn-login-google\"]")).click();
		driver.findElement(By.xpath("//input[@name='identifier']")).sendKeys("tes@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
	}

}
