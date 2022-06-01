package newpackage;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.Test;
import static com.codeborne.selenide.Selectors.*;


import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Newclass {
    @Test
    public void test(){
        Selenide.open("https://redmed.ge/ka/user/register");
        Configuration.browserSize="1920X1080";
        $(byText("მომხმარებლის")).shouldBe(Condition.visible);
        $("#userName").setValue("donari");
        $("#lastName").setValue("samadashvili");
        $("#mobileNumber").setValue("555495473");
        $("#email").setValue("donna.samadashvili@gmail.com");
        $(byText("ისარგებლე მოწვევის კოდით")).shouldBe(Condition.visible);
        $(byText("წესებს")).shouldBe(Condition.visible);
        $("#user-registration-button").click();
        sleep(3000);
    }
}
