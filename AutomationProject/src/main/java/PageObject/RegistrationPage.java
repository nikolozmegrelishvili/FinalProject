package PageObject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class RegistrationPage {
    public SelenideElement
    NameInput = $("#name"),
    MobileInput = $("#phone"),
    EmailInput = $("#email"),
    PasswordInput = $("#password"),
    AddressInput = $("#address"),
    Submitbutton = $(byName("#submit"));
}
