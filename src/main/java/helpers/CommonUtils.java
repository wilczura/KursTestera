package helpers;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.text.DecimalFormat;
import java.time.Duration;
import static drivers.DriverFactory.driver;

public class CommonUtils {
    public static WebDriverWait getWait() {
        return new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public static void click(By locator) {
        getWait().until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public static void click_2(By locator) {
        driver.findElement(locator).click();

    }

    public static void type(By locator, String text) {
        getWait().until(ExpectedConditions.presenceOfElementLocated(locator)).sendKeys(text);
    }

    public static void clear(By locator) {
        driver.findElement(locator).clear();
    }

    public static void goBack() {
        driver.navigate().back();

    }

    public static void uploadFile(By locator, String fileName) {
        driver.findElement(locator).sendKeys(fileName);

    }

    public static String getRandomNumberBetween(int min, int max) {
        DecimalFormat formatter = new DecimalFormat("#");
        return formatter.format(min + Math.floor(max - min) * Math.random());
    }

    public static String getRandomNumber(int numberAmount) {
        return RandomStringUtils.randomNumeric(numberAmount);
    }

    public static String getRandomPhone() {
        return getRandomNumberBetween(100000000, 999999999);

    }

    public static String getRandomName(int number) {
        return RandomStringUtils.randomAlphabetic(number).toLowerCase();

    }

    public static String getRandomMail() {
        return getRandomName(10) + getRandomNumberBetween(100, 1000) + "@gmail.com";

    }

    public static String getRandomAddress() {
        return getRandomName(7) + getRandomNumber(5);

    }
    public static String getHref(By locator){
        return getWait().until(ExpectedConditions.presenceOfElementLocated(locator)).getAttribute("href");
    }
    public static boolean isDisplayed(By locator){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();
    }
    public static boolean isEnabled(By locator){
        return getWait().until(ExpectedConditions.visibilityOfElementLocated(locator)).isEnabled();
    }
    public static void typeIfEmptyInput(By locator, String text){
        if(driver.findElement(locator).getAttribute("value").isEmpty()){
            type(locator, text);
        }
    }
    public static void clearAndTypeIfNotEmptyInput(By locator, String text){
        if(!driver.findElement(locator).getAttribute("value").isEmpty()){
            driver.findElement(locator).clear();
            type(locator, text);
        }
    }

}
