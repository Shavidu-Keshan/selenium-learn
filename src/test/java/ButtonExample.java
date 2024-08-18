import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ButtonExample {
    WebDriver driver;
    @BeforeMethod
    public void openLinkPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/button.xhtml");
    }
    @Test
    public void buttonTest(){
        //1)Click and confirmtitle
        WebElement clickbutton = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']"));
        clickbutton.click();
        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();
        if(expectedTitle.equals(actualTitle)){
            System.out.println("Actual title same as expected");
        }else {
            System.out.println("Actual Title not same as expected");
        }
    }




}
