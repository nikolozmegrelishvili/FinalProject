package Tests;

import Runner.ChromeRunner;
import Runner.Retry;
import StepsObject.MainPageSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Runner.TestLister.class)
public class MainPageTest extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.MINOR)
    @Description("border-color check")
    @Link(name = "derived from", type = "https://stackoverflow.com/questions/20535167/selenium-webdriver-get-border-color")
    public void Mainpage(){
        MainPageSteps steps1 = new MainPageSteps();
        steps1
                .Bordercolor();
        String color = "border-color";
        Assert.assertEquals("#28B62C",color);
    }
}
