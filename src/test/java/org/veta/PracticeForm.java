package org.veta;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

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
       $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
       $("#firstName").setValue("Veta");
       $("#lastName").setValue("Iuzykhovich");
       $("#userEmail").setValue("veta@veta.com");
       $("#genterWrapper").$(byText("Male")).click();
       $("#userNumber").setValue("123456789");
       $("#dateOfBirthInput").click();
       $(".react-datepicker__month-select").selectOption("January");
       $(".react-datepicker__year-select").selectOption("2000");
       $(".react-datepicker__day--010:not(.react-datepicker__day--outside-month)").click();
       $("#subjectsInput").setValue("Art").pressEnter();
       $("#hobbiesWrapper").$(byText("Sports")).click();
       $("#uploadPicture").uploadFromClasspath("img/7.png");
       $("#currentAddress").setValue("some address");
       /*$("#state").click();
       $("#stateCity-wrapper").$(byText("NCR")).click();
       $("#city").click();
       $("#stateCity-wrapper").$(byText("Delhi")).click();
       $("#submit").click();*/







    }

}
