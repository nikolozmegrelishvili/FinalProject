package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RadioButtons {
    public SelenideElement
    Gender = $(byText("Gender")),
    RadioOptions = $(byName("optionsRadios")),
    otherOption = $("#Other");
}
