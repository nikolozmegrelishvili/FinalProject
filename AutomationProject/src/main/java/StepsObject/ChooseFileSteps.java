package StepsObject;

import PageObject.ChooseFile;
import io.qameta.allure.Step;

import java.io.File;

public class ChooseFileSteps extends ChooseFile {
    @Step("click and choose File")
    public ChooseFileSteps BrowsUpload(){
     FileButton.uploadFile(new File("a.txt"));
     return this;
    }

    @Step("click upload")
    public ChooseFileSteps Upload(){
        UploadButton.click();
        return this;
    }
}
