package tests;

import org.testng.annotations.Test;
import tests.BaseTest;

public class GoogleTest extends BaseTest {

    @Test
    public void googleTitleTest() {

        driver.get("https://www.google.com");

        System.out.println(driver.getTitle());
    }
}
