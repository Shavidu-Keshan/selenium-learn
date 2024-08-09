//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class opengoogle {

    //open google
    //go to google home page


    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Shavidu Keshan\\Downloads\\driver\\chromedriver-win64\\chromedriver.exe");\\(step 1:System.setProperty)

        //WebDriverManager.chromedriver().setup();//WebDriveManager


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.quit();
    }

}
