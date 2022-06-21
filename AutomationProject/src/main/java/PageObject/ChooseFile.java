package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class ChooseFile {
    public SelenideElement
    FileButton = $("#inputGroupFile02"),
    UploadButton = $(byXpath("/html/body/div/div[6]/div[2]/div/div/div[2]/span"));
}
