import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest extends BaseClass {

    @Test
    public void firstTest() {
        WebElement googleElement = driver.findElement(By.xpath("//*[@alt='Google']"));
        WebElement searchBar = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));


        Assert.assertTrue(googleElement.isDisplayed(), "The Google page is visible");

        searchBar.sendKeys("Selenium");
        searchBar.sendKeys(Keys.ENTER);
        Assert.assertTrue(searchBar.isDisplayed(), "A link is visible");

        searchBar.click();
        WebElement siteElement = driver.findElement(By.id("td-cover-block-0"));
        Assert.assertTrue(siteElement.isDisplayed(), "New web site about Selenium is opened");
    }
}
