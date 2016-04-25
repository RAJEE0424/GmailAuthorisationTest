package steps;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.url;


@Test
public class validLoginTest {


    String username = System.getProperty("username", "selenidetest21");
    String password = System.getProperty("password", "1SelenideTest1");






    public void login() {

      
        baseUrl = "http://gmail.com";
        open("/");
        $("#Email").val(username).pressEnter();
        $("#Passwd").val(password).pressEnter();

        try {
            Thread.sleep(5000);
        } catch (Exception e) {

        }


        Assert.assertEquals(url(), "https://mail.google.com/mail/#inbox");


        close();
    }


}


