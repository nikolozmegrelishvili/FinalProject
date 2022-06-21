package DataObject;

import com.github.javafaker.Faker;

public interface RegistrationData {
    Faker faker = new Faker();
    String
        UserName = faker.name().firstName(),
        LastName = "Megrelishvili",
        MobileNumber = "593216874",
        Email = "nikamegrelishvili@Gmail.com",
        Password = "nika12345",
        Address = "Aghmashenebeli st. 35 ave.";
}
