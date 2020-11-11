package pruebauTest.userinterface;

import net.serenitybdd.core.annotations.Findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.Pages.PageObject;
import org.openqa.selenium.By;



@DefaultUrl("https://www.utest.com/signup/address")

public class FillFormPage2 extends PageObject {

    public static final Target INPUT_CITY = Target.the(targetElementName("Enter City"))
            .located(By.id("City"));
    public static final Target INPUT_POSTAL = Target.the(targetElementName("Zip or Postal Code"))
            .located(By.id("Postal"));
    public static final Target INPUT_COUNTRY = Target.the(targetElementName("Enter Country"))
            .located(By.id("Country"));


}