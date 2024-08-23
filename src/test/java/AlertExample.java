import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertExample {
    WebDriver driver;
    @BeforeMethod
    public void alertTestPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0fdzpuf8nuk8npivgy5j21oh65628256.node0");
    }
    @Test
    public void alertTest(){
        //1)simple diolog
        WebElement alertbox = driver.findElement(By.id("j_idt88:j_idt91"));
        alertbox.click();
          Alert alert = driver.switchTo().alert();
        alert.accept();

        //2)alert confrirm dialog
        WebElement confirmBox = driver.findElement(By.id("j_idt88:j_idt93"));
        confirmBox.click();
        Alert alert1= driver.switchTo().alert();
        alert1.dismiss();;
    }
}
