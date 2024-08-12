import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextboxExample {
    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/input.xhtml");

    }
    @Test
    public void textBoxTests() throws InterruptedException {

        //01) Append Country to this City
        WebElement name=driver.findElement(By.id("j_idt88:name"));
        name.sendKeys("Ravan maven");
        Thread.sleep(3000);




        //02) Verify is text box is disabled
        WebElement country=driver.findElement(By.id("j_idt88:j_idt91"));
        country.sendKeys("India");

        //03) Verify if text box is disabled
        boolean enabled=driver.findElement(By.name("j_idt88:j_idt93")).isEnabled();
        System.out.println("Is Text Box enabled " + enabled);

        //04)Retrieve the typed text
        WebElement clearText = driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']"));
        clearText.clear();

        //05) Retrive the typed text


        WebElement textElement = driver.findElement(By.id("j_idt88:j_idt97"));
        String value = textElement.getAttribute("value");
        System.out.println(value);

        //06)Type email and Tab.Confirm control Moved To next element.
        driver.findElement(By.id("j_idt88:j_idt99")).sendKeys("abc@gmail.com" + Keys.TAB + "control confirm go to next element");


    }

}
