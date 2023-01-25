import org.junit.Test;
import static drivers.DriverFactory.driver;
import static helpers.CommonUtils.*;
import static selectors.DemoQATestSelectors.*;
import static org.junit.Assert.assertEquals;
import static strings.DemoQATestStrings.*;

public class DemoQATest {
    @Test
    public void test1() {

        //1. Włącz przeglądarkę i wejdź w link
        driver.get(DEMO_URL);
        driver.manage().window().maximize();
        assertEquals(DEMO_URL, driver.getCurrentUrl());

        //2. Wpisz losowe imię i losowe nazwisko.
        type(FIRSTNAME, getRandomName(10).toLowerCase());
        type(LAST_NAME, getRandomName(15).toLowerCase());

        //3. Wpisz losowy e-mail i wybierz płeć
        type(EMAIL, getRandomMail());
        click(MALE);

        //4. Wpisz losowy numer telefonu
        type(PHONE_NUMBER,getRandomPhone());

//        //5. Wybierz datę urodzenia
//        click(BIRTH_DATE);
//        click(MONTH);
//        click(APRIL);
//        click(YEAR);
//        click_2(BORN_YEAR);
//        click(BORN_DAY);

//        //6. Wybierz hobby
//        click(CHECKBOX_SPORTS);
//        click(CHECKBOX_READING);
//        click(CHECKBOX_MUSIC);

        //7. Wgraj plik
        uploadFile(UPLOAD_PICTURE,SAMPLE_PFD);

        //8. Wpisz losowy adres
        type(CURRENT_ADDRESS,getRandomAddress());

        //9. Wyślij formularz
        click_2(BUTTON_SUBMIT);



    }
}
