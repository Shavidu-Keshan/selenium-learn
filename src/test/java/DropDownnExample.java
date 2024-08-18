import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownnExample {
    WebDriver driver;
    @BeforeMethod
    public  void dropDowmTestPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();


    }
    @Test
    public  void leafgroundpageDropDownPage() {
        //1.1)ways of select values in basic dropdown

        driver.get("https://www.leafground.com/select.xhtml;jsessionid=node0glbji2nh8x0t1kdru3x1vj03q5457418.node0");

        WebElement dropDown = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select select = new Select(dropDown);
        select.selectByIndex(1);
        select.selectByVisibleText("Playwright");

        //1.2)Get the number of dropDown option

        List<WebElement> ListofOptions = select.getOptions();
        int size = ListofOptions.size();
        System.out.println("Number of element in dropdown : " + size);
        for (WebElement element : ListofOptions) {
            System.out.println(element.getText());
        }

        //1.3)using sendkeys select dropdown value
        dropDown.sendKeys("Puppeteer");

        //1.4)selecting value in a bootsrap down
        WebElement dropdown2 = driver.findElement(By.xpath("//div[@id='j_idt87:country']"));
        dropdown2.click();
        List<WebElement> listdropdown2 = driver.findElements(By.xpath("//ul[@id='j_idt87:country_items']//li"));
        for (WebElement element : listdropdown2) {
            String dropdownvalue = element.getText();
            if (dropdownvalue.equals("USA")) {
                element.click();
                break;
            }
        }
    };
        //2)Google search - pick a value from sugestion
        public void googleSearchDropDown() {
            // Navigate to Google's homepage
            driver.get("https://www.google.com/");

            // Find the search box element by its name attribute and type "palitha"
            driver.findElement(By.name("q")).sendKeys("palitha");

            // Wait for the dropdown suggestions to appear and fetch them
            List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li//span"));

            // Print out all the suggestions
            for (WebElement suggestion : suggestions) {
                System.out.println(suggestion.getText());
            }

            // Optionally, you can click on one of the suggestions if needed
            // For example, click on the first suggestion:

        }




}
