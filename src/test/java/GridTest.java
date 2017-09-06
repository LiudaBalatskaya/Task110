import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class GridTest {
    @Test
    public void gridTest() throws InterruptedException, MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setBrowserName("chrome");
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), caps);
        driver.get("https://mail.ru");
        Thread.sleep(3000);
        driver.close();
    }

    @Test
    public void withoutNewDesiredCapabilitiesTest() throws InterruptedException, MalformedURLException {
        WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), DesiredCapabilities.chrome());
        driver.get("https://mail.ru");
        Thread.sleep(3000);
        driver.close();

    }
}