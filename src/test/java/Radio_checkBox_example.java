import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Radio_checkBox_example {

    WebDriver driver;

    @BeforeMethod
    public  void Radio_checkBox_Test(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public  void radioTests(){
        //find the default select radio button
        driver.get("https://www.leafground.com/radio.xhtml;jsessionid=node0a2stl72yl04q15t6rxgkffaod5580791.node0");
        boolean chormeradioOption = driver.findElement(By.id("j_idt87:console2:0")).isSelected();
        boolean firefoxRadioOption = driver.findElement(By.id("j_idt87:console2:1")).isSelected();
        boolean  safariradiooption= driver.findElement(By.id("j_idt87:console2:2")).isSelected();
        boolean edgeradiooption = driver.findElement(By.id("j_idt87:console2:3")).isSelected();

        if(chormeradioOption){
            String chrometest = driver.findElement(By.xpath("//label[@for='j_idt87:console2:0']")).getText();
            System.out.println("default select radio button is: " +chrometest);
        }else if (firefoxRadioOption){
            String firefoxtest = driver.findElement(By.xpath("//label[@for='j_idt87:console2:1']")).getText();
            System.out.println("default select radio button is: " +firefoxtest);
        }else if(safariradiooption){
            String safaritest = driver.findElement(By.xpath("//label[@for='j_idt87:console2:2']")).getText();
            System.out.println("default select radio button is: " +safaritest);
        }else if(edgeradiooption){
            String edgetest = driver.findElement(By.xpath("//label[@for='j_idt87:console2:0']")).getText();
            System.out.println("default select radio button is: " +edgetest);
        }

    }

    @Test
    public void CheckBoxTests(){
        //1)select wanted checkboxes and verifying those checkbox selected status
        driver.get("https://www.leafground.com/checkbox.xhtml");
        List<WebElement> checkboxList = driver.findElements(By.xpath("//table[@id='j_idt87:basic']//label"));
        for(WebElement element:checkboxList){
            if(!(element.getText().equals("Others"))){
                element.click();
            }
        }
        for(int i=1;i<=checkboxList.size();i++){
            boolean checkboxstatus = driver.findElement(By.xpath("(//table[@id='j_idt87:basic']//input)["+i+"]")).isSelected();
            System.out.println("chekbox "+i+"selected status is : " +checkboxstatus);
        }

    }
}
