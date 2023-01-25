package selectors;

import org.openqa.selenium.By;

public class DemoQATestSelectors {
    public static By FIRSTNAME = By.id("firstName");
    public static By LAST_NAME = By.id("lastName");
    public static By EMAIL= By.id("userEmail");
    public static By MALE= By.xpath("//label[@for='gender-radio-1']");
    public static By PHONE_NUMBER = By.id("userNumber");

    public static By BIRTH_DATE = By.id("dateOfBirthInput");
    public static By MONTH = By.xpath("//select[contains(@class,'react-datepicker__month-select')]");
    public static By APRIL = By.xpath("//option[contains(@value,'3')]");
    public static By YEAR = By.xpath("//select[contains(@class,'react-datepicker__year-select')]");
    public static By BORN_YEAR = By.xpath("//option[contains(@value,'2023')]");
    public static By BORN_DAY = By.xpath("//div[contains(@class,'react-datepicker__day react-datepicker__day--020 react-datepicker__day--selected')]");
    public static By CHECKBOX_SPORTS = By.xpath("//label[contains(@for,'hobbies-checkbox-1')]");
    public static By CHECKBOX_READING = By.xpath("//label[contains(@for,'hobbies-checkbox-2')]");
    public static By CHECKBOX_MUSIC = By.xpath("//label[contains(@for,'hobbies-checkbox-3')]");
    public static By UPLOAD_PICTURE =  By.id("uploadPicture");
    public static By CURRENT_ADDRESS =  By.id("currentAddress");
    public static By BUTTON_SUBMIT=  By.id("submit");
    //div[contains(@class,'modal-header')]




}
