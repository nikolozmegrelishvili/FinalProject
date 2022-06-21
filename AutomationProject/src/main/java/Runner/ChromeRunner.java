package Runner;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.BeforeTest;



public class ChromeRunner {
    @BeforeTest(description = "configure website before tests")
    public static void setup(){
        Selenide.open("https://itera-qa.azurewebsites.net/home/automation");
        Configuration.browserSize = "1920x1080";
    }
}
