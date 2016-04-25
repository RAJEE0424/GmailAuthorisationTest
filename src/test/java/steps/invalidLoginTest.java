package steps;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;


@Test
public class invalidLoginTest {


    String username = System.getProperty("username", "selenidetest21");
  String password = System.getProperty("password", "1SelenideTest1");



    public void invalidlogin() {


        baseUrl = "http://gmail.com";
        open("/");
        $("#Email").val(username).pressEnter();
        $("#Passwd").val("invalidpassword").pressEnter();
        Assert.assertEquals($("#errormsg_0_Passwd").getText(), "The email and password you entered don't match.");
        close();


    }


}


