import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Core {


    private WebDriver driver;
    private static final String CHROME_DRIVER_LOCATION = "C://driver/chromedriver.exe";

    public Core() {
        System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_LOCATION);
        this.driver = new ChromeDriver();
    }

    public void openWebPage(String url) {
        driver.get(url);
    }

    public void closeWebPage() {
        driver.close();
    }

    public void assertList(By value, String text) {

        List<WebElement> elements = driver.findElements(value);

        boolean confirmed = false;
        for (WebElement ele : elements) {
            if (ele.getText().contains(text)) {
                System.out.println("Found: " + ele.getText());
                confirmed = true;
                break;
            }
        }
        Assert.assertTrue("Item NOT found", confirmed);
    }
}
