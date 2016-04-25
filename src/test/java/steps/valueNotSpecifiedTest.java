package steps;

import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.*;

@Test
public class valueNotSpecifiedTest {


    String username = System.getProperty("username", "selenidetest21");
    String password = System.getProperty("password", "1SelenideTest1");


    public void noValue() {


        valueNotSpecified("UserNameValue");

        valueNotSpecified("PasswordValue");

    }


    private void valueNotSpecified(String valueName) {
        baseUrl = "http://gmail.com";
        open("/");
        if (valueName.equals("UserNameValue")) {
            $("#next").click();
            Assert.assertEquals($("#errormsg_0_Email").getText(), "Please enter your email.");
            close();
        } else {
            $("#Email").val(username).pressEnter();
            $("#signIn").click();
            Assert.assertEquals($("#errormsg_0_Passwd").getText(), "Please enter your password.");
            close();


        }


    }


}