import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class AlertExample {
    WebDriver driver;
    @BeforeMethod
    public void alertTestPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0fdzpuf8nuk8npivgy5j21oh65628256.node0");
    }
}
