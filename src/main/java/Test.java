import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Test {

    static void buyIpnone13() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            driver.get("https://www.google.com/");
            new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='gLFyf gsfi']")));
            WebElement searchGoogle = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
            searchGoogle.sendKeys("rozetka ua");
            searchGoogle.sendKeys(Keys.ENTER);

            WebElement rozetkaLink = new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")));
            rozetkaLink.click();

            new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='search']")));
            WebElement searchRozetka = driver.findElement(By.xpath("//input[@name='search']"));
            searchRozetka.sendKeys("iphone 13 pro max 256");

            new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='suggest-goods']")))
                    .isDisplayed();
            List<WebElement> results = driver.findElements(By.xpath("//a[@class='suggest-goods']"));
            results.get(0).click();

            WebElement buyButton = new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='buy-button button button_with_icon button_color_green button_size_large ng-star-inserted']")));
            buyButton.click();
            System.out.println(buyButton.getText());
        } finally {
            driver.quit();
        }
    }

    static void openMonitor() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        try {
            driver.get("https://www.google.com/");
            new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='gLFyf gsfi']")));
            WebElement searchGoogle = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
            searchGoogle.sendKeys("rozetka ua");
            searchGoogle.sendKeys(Keys.ENTER);

            WebElement rozetkaLink = new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")));
            rozetkaLink.click();

            WebElement catalog = new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.elementToBeClickable(By.id("fat-menu")));
            catalog.click();

            List<WebElement> notebooksAndComputers = driver.findElements(By.xpath("//a[@class='menu-categories__link js-menu-categories__link menu-categories__link_state_hovered']"));
            notebooksAndComputers.get(0).click();

            new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='tile-cats']")))
                    .isDisplayed();
            List<WebElement> goods = driver.findElements(By.xpath("//div[@class='tile-cats']"));
            goods.get(2).click();

            new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='checkbox-filter__link']")))
                    .isDisplayed();
            List<WebElement> filters = driver.findElements(By.xpath("//a[@class='checkbox-filter__link']"));
            filters.get(0).click();

            new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='goods-tile__title']")))
                    .isDisplayed();
            List<WebElement> monitors = driver.findElements(By.xpath("//span[@class='goods-tile__title']"));
            monitors.get(0).click();
            System.out.println(monitors.get(0).getText());

            WebElement buyButton = new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='buy-button button button_with_icon button_color_green button_size_large ng-star-inserted']")));
            buyButton.click();
            System.out.println(buyButton.getText());

            WebElement closeButton = new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='modal__close']")));
            closeButton.click();

        } finally {
            driver.quit();
        }
    }

    public static void main(String[] args) {
        buyIpnone13();
        openMonitor();
    }
}
