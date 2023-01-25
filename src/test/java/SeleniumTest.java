import org.junit.Test;
import org.openqa.selenium.Alert;
import static drivers.DriverFactory.driver;
import static helpers.CommonUtils.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static selectors.SeleniumTestSelectors.*;
import static strings.SeleniumTestStrings.*;

public class SeleniumTest {

    @Test
    public void scenario1() {

        //1. Włącz przeglądarkę i wejdź w link
        driver.manage().window().maximize();
        driver.get(TEST_URL);
        assertEquals(TEST_URL, driver.getCurrentUrl());

        //2. Kliknij guzik "Kliknij mnie"
        assertTrue(driver.findElement(CLICK_ON_ME).isDisplayed());
        click(CLICK_ON_ME);

        //3. Pobierz tekst i zamknij alert
        Alert alert = driver.switchTo().alert();
        assertEquals(EXPECTED_ALERT_01, alert.getText());
        System.out.println(alert.getText());
        alert.accept();

        //4. Znajdź Pole "First name" i wpisz "Pomarańcza"
        type(FNAME,ORANGE);

        //5. Wejdź w link W3Schools i wróć na poprzednią stronę
        assertTrue(driver.findElement(W3_URL_SELECTOR).isDisplayed());
        click(W3_URL_SELECTOR);
        assertEquals(W3_URL, driver.getCurrentUrl());
        goBack();
        assertEquals(TEST_URL, driver.getCurrentUrl());

        //6. Wejdź w link IamWeirdLink i wróć na poprzednią stronę
        assertTrue(driver.findElement(GOOGLE_URL_SELECTOR).isDisplayed());
        click(GOOGLE_URL_SELECTOR);
        assertEquals(GOOGLE_URL, driver.getCurrentUrl());
        goBack();
        assertEquals(TEST_URL, driver.getCurrentUrl());

        //7. Zaznacz listę wyboru i wybierz opcję Saab
        click(SELECT);
        click(SAAB);

        //8. Zamknij przeglądarkę
        driver.quit();
    }

    @Test
    public void scenario2() {

        //1. Włącz przeglądarkę i wejdź w link
        driver.manage().window().maximize();
        driver.get(TEST_URL);
        assertEquals(TEST_URL, driver.getCurrentUrl());

        //2. Zaakceptuj nieznajomość regulaminu
        click(CHECKBOX);

        //3. Wybierz płeć
        click(FEMALE);

        //4. Wyczyść pole z nazwą użytkownika i wpisz "Asia"
        clear(USERNAME);
        type(USERNAME,LOGIN);

        //5. Wyczyść pole z hasłem i wpisz "12345"
        clear(PASSWORD);
        type(PASSWORD,KEY);

        //6. Kliklnij Submit
        assertTrue(driver.findElement(SUBMIT).isDisplayed());
        click(SUBMIT);

        //7. Pobierz tekst i zaakcepuj alerty
        Alert alert2 = driver.switchTo().alert();
        assertEquals(ALERT_02, alert2.getText());
        alert2.accept();
        Alert alert3 = driver.switchTo().alert();
        assertEquals(ALERT_03, alert3.getText());
        alert3.accept();

        //8. Otwórz nową stronę
        click(NEW_PAGE);

        //9. Zamknij przeglądarkę
        driver.quit();
    }
}

