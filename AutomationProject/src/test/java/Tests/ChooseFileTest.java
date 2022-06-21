package Tests;

import Runner.ChromeRunner;
import Runner.Retry;
import StepsObject.ChooseFileSteps;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Runner.TestLister.class)
public class ChooseFileTest extends ChromeRunner {
    @Test(retryAnalyzer = Retry.class)
    @Severity(SeverityLevel.NORMAL)
    @Description("click and upload File")
    public void ChooseFile(){
        ChooseFileSteps steps5 = new ChooseFileSteps();
        steps5
                .BrowsUpload()
                .Upload();

        Assert.assertTrue(steps5.UploadButton.isEnabled());
    }
}
