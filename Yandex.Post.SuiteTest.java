// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class DefaultSuiteTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void openadraft() {
    driver.get("https://mail.yandex.ru/?uid=1103224717");
    driver.manage().window().setSize(new Dimension(595, 689));
    driver.findElement(By.cssSelector(".composeHeader-Text")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".tst-field-to .composeYabbles"));
      js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = '<span data-email=\"olfedo2020@yandex.ru\" bubble=\"\" draggable=\"true\" class=\"js-yabble yabble-compose\" contenteditable=\"false\"><div class=\"ComposeYabble ComposeYabble_editable\" contenteditable=\"false\"><div class=\"ComposeYabble-Avatar\"><div class=\"mail-Avatar\" style=\"background-color: rgb(71, 204, 193);\"><span class=\"mail-Avatar__Monogram\">OL</span></div></div><div class=\"ComposeYabble-Text\" spellcheck=\"false\" autocomplete=\"off\" autocorrect=\"off\" autocapitalize=\"off\">olfedo2020@yandex.ru</div><div class=\"ComposeYabble-RemoveIconWrapper\"><svg xmlns=\"http://www.w3.org/2000/svg\" class=\"svgicon svgicon-mail--Compose-RemoveYabble \" focusable=\"false\"><use xmlns:xlink=\"http://www.w3.org/1999/xlink\" xlink:href=\"#svgicon-mail--Compose-RemoveYabble\"></use><rect height=\"100%\" width=\"100%\" style=\"fill: transparent;\"></rect></svg></div></div></span>​'}", element);
    }
  }
  @Test
  public void writeanewmassage() {
    driver.get("https://mail.yandex.ru/?uid=1103224717");
    driver.manage().window().setSize(new Dimension(595, 689));
    driver.findElement(By.cssSelector(".mail-ComposeButton-Text")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".mail-ComposeButton-Text"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    {
      WebElement element = driver.findElement(By.cssSelector(".tst-field-to .composeYabbles"));
      js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = '​'}", element);
    }
  }
}
