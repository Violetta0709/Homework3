package org.veta;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.appear;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PracticeForm {
   @BeforeAll
  static void configure () {
       Configuration.baseUrl = "https://demoqa.com";
       Configuration.browserSize = "1920x1080";
       Configuration.holdBrowserOpen = true;
          }

    @Test
    void fillFormTest () {
       open("/automation-practice-form");
       zoom(0.7);
       $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
       $("#firstName").setValue("Veta");
       $("#lastName").setValue("Iuzykhovich");
       $("#userEmail").setValue("veta@veta.com");
       $("#genterWrapper").$(byText("Male")).click();
       $("#userNumber").setValue("1234567891");
       $("#dateOfBirthInput").click();
       $(".react-datepicker__month-select").selectOption("January");
       $(".react-datepicker__year-select").selectOption("2000");
       $(".react-datepicker__day--010:not(.react-datepicker__day--outside-month)").click();
       $("#subjectsInput").setValue("Art").pressEnter();
       $("#hobbiesWrapper").$(byText("Sports")).click();
       $("#uploadPicture").uploadFromClasspath("img/7.png");
       $("#currentAddress").setValue("some address");
       $("#state").click();
       $("#stateCity-wrapper").$(byText("NCR")).click();
       $("#city").click();
       $("#stateCity-wrapper").$(byText("Delhi")).click();
       $("#submit").click();
       $(".modal-dialog").should(appear);
       $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
       $("#table-responsive table").shouldHave(text("Iuzykhovich"), text("veta@veta.com"));










    }

}
