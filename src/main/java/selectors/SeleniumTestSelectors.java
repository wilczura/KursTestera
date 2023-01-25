package selectors;

import org.openqa.selenium.By;

public class SeleniumTestSelectors {
    public static By CLICK_ON_ME = By.id("clickOnMe");
    public static By FNAME = By.id("fname");
    public static By W3_URL_SELECTOR = By.xpath("//a[@href='https://www.w3schools.com']");
    public static By GOOGLE_URL_SELECTOR = By.xpath("//a[@href='https://www.google.com']");
    public static By SELECT = By.xpath("//select");
    public static By SAAB = By.xpath("//option[@value='saab']");
    public static By CHECKBOX = By.xpath("//input[@type='checkbox']");
    public static By FEMALE = By.xpath("//input[@value='female']");
    public static By USERNAME = By.name("username");
    public static By PASSWORD = By.name("password");
    public static By SUBMIT= By.xpath("//input[@value='Submit']");
    public static By NEW_PAGE = By.id("newPage");
    public static By NEW_PAGE2 = By.id("newPage2");

}
