import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LinkExample {
    WebDriver driver;
    @BeforeMethod
    public void openLinkTestPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/link.xhtml;jsessionid=node01951iwlcdd3jblwaznd819igz5322522.node0");

    }
    @Test
    public void LinkTest() {
        //01) Take me dashboard
        WebElement homeLink = driver.findElement(By.linkText("Go to Dashboard"));
        homeLink.click();
        driver.navigate().back();


        //02) Find my destination
        WebElement wheretogo = driver.findElement(By.partialLinkText("Find the URL"));
        String path = wheretogo.getAttribute("href");
        System.out.println("This link is going to : " + path);
        //03) Am I broken Link
        WebElement brokenLink = driver.findElement((By.linkText("Broken?")));
        brokenLink.click();

        String title = driver.getTitle();
        if (title.contains("Not broken")) {
            System.out.println("The Link is broken");
        }else {
            System.out.println("Not broken");
        }

        //05) Count page Links
        //06) count layout Links
    }

}