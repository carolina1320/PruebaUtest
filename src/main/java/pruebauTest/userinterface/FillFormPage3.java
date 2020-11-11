package pruebauTest.userinterface;

import net.serenitybdd.core.annotations.Findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.Pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://www.utest.com/signup/devices")

public class FillFormPage3 extends PageObject {


    public static final Target INPUT_COMPUTER = Target.the(targetElementName("Enter Your Computer"))
            .located(By.id("Computer"));
    public static final Target INPUT_VERSION = Target.the(targetElementName("Enter Your Version"))
            .located(By.id("Version"));
    public static final Target INPUT_LANGUAGE = Target.the(targetElementName("Enter Your Language"))
            .located(By.id("Language"));
    public static final Target INPUT_MOBILE = Target.the(targetElementName("Your Mobile Device"))
            .located(By.id("Mobile"));
    public static final Target INPUT_MODEL = Target.the(targetElementName("Model"))
            .located(By.id("Model"));
    public static final Target S_O = Target.the(targetElementName("Operating System"))
            .located(By.id("OperatingSystem"));

}