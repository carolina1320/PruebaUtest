package pruebauTest.userinterface;

import net.serenitybdd.core.annotations.Findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.Pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://www.utest.com/signup/complete")

public class FillFormPage4 extends PageObject{


    public static final Target NEXT_PAGE = Target.the(targetElementName("Next Page"))
            .located(By.xpath("//a[@href = '#']"));
    public static final Target PASSWORD = Target.the(targetElementName("Create your uTest password"))
            .located(By.id("Password"));
    public static final Target CONFIR_PASSWORD = Target.the(targetElementName("Confirm password"))
            .located(By.id("Password"));

}