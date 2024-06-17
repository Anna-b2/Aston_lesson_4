import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MtsTest {
    private WebDriver driver;
    private WebDriverWait wait;

    public void clickSelectButton() {
        WebElement selectButton = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/button"));
        wait.until(ExpectedConditions.elementToBeClickable(selectButton));
        selectButton.click();
    }
    @BeforeClass
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 10);
        driver.get("https://www.mts.by");
        driver.findElement(By.xpath("//*[@id=\"cookie-agree\"]")).click();
    }
    @Test
    public void CheckCommunicationServicesTest() {
        clickSelectButton();
        WebElement comServButton = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[1]"));
        comServButton.click();
        WebElement numberTextBox = driver.findElement(By.xpath("//*[@id=\"connection-phone\"]"));
        String numberPlaceholderText = numberTextBox.getAttribute("placeholder");
        Assert.assertEquals(numberPlaceholderText, "Номер телефона");
        WebElement priceTextBox = driver.findElement(By.xpath("//*[@id=\"connection-sum\"]"));
        String pricePlaceholderText = priceTextBox.getAttribute("placeholder");
        Assert.assertEquals(pricePlaceholderText, "Сумма");
        WebElement emailTextBox = driver.findElement(By.xpath("//*[@id=\"connection-email\"]"));
        String emailPlaceHolderText = emailTextBox.getAttribute("placeholder");
        Assert.assertEquals(emailPlaceHolderText, "E-mail для отправки чека");
    }
    @Test
    public void CheckHomeInternetTest() {
        clickSelectButton();
        WebElement homeIntButton = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[2]"));
        homeIntButton.click();
        WebElement subNumberTextBox = driver.findElement(By.xpath("//*[@id=\"internet-phone\"]"));
        String numPlaceholderText = subNumberTextBox.getAttribute("placeholder");
        Assert.assertEquals(numPlaceholderText, "Номер абонента");
        WebElement intPriceTextBox = driver.findElement(By.xpath("//*[@id=\"internet-sum\"]"));
        String intPricePlaceholderText = intPriceTextBox.getAttribute("placeholder");
        Assert.assertEquals(intPricePlaceholderText, "Сумма");
        WebElement emailTextBox = driver.findElement(By.xpath("//*[@id=\"internet-email\"]"));
        String emailPlaceholderText = emailTextBox.getAttribute("placeholder");
        Assert.assertEquals(emailPlaceholderText, "E-mail для отправки чека");
    }
    @Test
    public void CheckInstallmentPlanTest() {
        clickSelectButton();
        WebElement instPlanButton = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[3]"));
        wait.until(ExpectedConditions.elementToBeClickable(instPlanButton));
        instPlanButton.click();
        WebElement accNumber = driver.findElement(By.xpath("//*[@id=\"score-instalment\"]"));
        String accNumPlaceholderText = accNumber.getAttribute("placeholder");
        Assert.assertEquals(accNumPlaceholderText, "Номер счета на 44");
        WebElement instPriceTextBox = driver.findElement(By.xpath("//*[@id=\"instalment-sum\"]"));
        String instPricePlaceholderText = instPriceTextBox.getAttribute("placeholder");
        Assert.assertEquals(instPricePlaceholderText, "Сумма");
        WebElement emailTextBox = driver.findElement(By.xpath("//*[@id=\"instalment-email\"]"));
        String emailPlaceholderText = emailTextBox.getAttribute("placeholder");
        Assert.assertEquals(emailPlaceholderText, "E-mail для отправки чека");
    }
    @Test
    public void CheckNameDebtTest() {
        clickSelectButton();
        WebElement debtButton = driver.findElement(By.xpath("//*[@id=\"pay-section\"]/div/div/div[2]/section/div/div[1]/div[1]/div[2]/ul/li[4]"));
        wait.until(ExpectedConditions.elementToBeClickable(debtButton));
        debtButton.click();
        WebElement accNumberTextBox = driver.findElement(By.xpath("//*[@id=\"score-arrears\"]"));
        String accNumberPlaceholderText = accNumberTextBox.getAttribute("placeholder");
        Assert.assertEquals(accNumberPlaceholderText, "Номер счета на 2073");
        WebElement priceTextBox = driver.findElement(By.xpath("//*[@id=\"arrears-sum\"]"));
        String pricePlaceholderText = priceTextBox.getAttribute("placeholder");
        Assert.assertEquals(pricePlaceholderText, "Сумма");
        WebElement emailTextBox = driver.findElement(By.xpath("//*[@id=\"arrears-email\"]"));
        String emailPlaceholderText = emailTextBox.getAttribute("placeholder");
        Assert.assertEquals(emailPlaceholderText, "E-mail для отправки чека");
    }
    @Test
    public void CheckNameTipsBepaidApp() {
        clickSelectButton();
        WebElement serviceDropDown = driver.findElement(By.xpath("//button[@class='select__header']"));
        WebElement communicDropDown = driver.findElement(By.xpath("//p[text()='Услуги связи']"));
        WebElement cellField = driver.findElement(By.xpath("//input[@id='connection-phone']"));
        WebElement sumField = driver.findElement(By.xpath("//input[@id='connection-sum']"));
        WebElement continueButton = driver.findElement(By.xpath("//button[@class='button button__default ']"));
        serviceDropDown.click();
        communicDropDown.click();
        cellField.sendKeys("297777777");
        sumField.sendKeys("10");
        continueButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//iframe[@class='bepaid-iframe']")));
        WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='bepaid-iframe']"));
        driver.switchTo().frame(frame1);
        WebElement payCost = driver.findElement(By.xpath("//div[@class='pay-description__cost']"));
        Assert.assertTrue(payCost.getText().contains("10"));
        WebElement payButton = driver.findElement(By.xpath("//button[@class='colored disabled']"));
        Assert.assertTrue(payButton.getText().contains("10"));
        WebElement cellCheck = driver.findElement(By.xpath("//span[@class='pay-description__text']"));
        Assert.assertTrue(cellCheck.getText().contains("375297777777"));
        WebElement cardFieldCheck = driver.findElement(By.xpath("//label[@class='ng-tns-c46-1 ng-star-inserted']"));
        Assert.assertEquals(cardFieldCheck.getText(),
                "Номер карты");
        WebElement validityFieldCheck = driver.findElement(By.xpath("//div[@class='content ng-tns-c46-4']"));
        Assert.assertEquals(validityFieldCheck.getText(),
                "Срок действия");
        WebElement cvcFieldCheck = driver.findElement(By.xpath("//label[@class='ng-tns-c46-5 ng-star-inserted']"));
        Assert.assertEquals(cvcFieldCheck.getText(),
                "CVC");
        WebElement nameHolderFieldCheck = driver.findElement(By.xpath("//label[@class='ng-tns-c46-3 ng-star-inserted']"));
        Assert.assertEquals(nameHolderFieldCheck.getText(),
                "Имя держателя (как на карте)");
        WebElement iconMastercardCheck = driver.findElement(By.xpath("(//img[@class='ng-tns-c61-0 ng-star-inserted'])[1]"));
        Assert.assertTrue(iconMastercardCheck.isDisplayed());
        WebElement iconVisaCheck = driver.findElement(By.xpath("(//img[@class='ng-tns-c61-0 ng-star-inserted'])[2]"));
        Assert.assertTrue(iconVisaCheck.isDisplayed());
        WebElement iconBelkardCheck = driver.findElement(By.xpath("(//img[@class='ng-tns-c61-0 ng-star-inserted'])[3]"));
        Assert.assertTrue(iconBelkardCheck.isDisplayed());
        WebElement iconMirCheck = driver.findElement(By.xpath(
                "//div[@class='cards-brands cards-brands_random ng-tns-c61-0 ng-star-inserted']"));
        Assert.assertTrue(iconMirCheck.isDisplayed());
        WebElement yandexCheck = driver.findElement(By.xpath(
                "//button[@class='ya-pay-button ya-pay-button_black']"));
        Assert.assertTrue(yandexCheck.isDisplayed());
        WebElement googleCheck = driver.findElement(By.xpath(
                "//button[@id='gpay-button-online-api-id']"));
        Assert.assertTrue(googleCheck.isDisplayed());
        driver.switchTo().defaultContent();
    }
    @AfterClass
    public void finish() {
        driver.quit();
    }
}
