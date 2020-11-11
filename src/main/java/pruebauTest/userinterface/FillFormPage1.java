package pruebauTest.userinterface;

import net.serenitybdd.core.annotations.Findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.Pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://www.utest.com/signup/personal")

    public class FillFormPage1 extends PageObject {


    /**
     *
     */
        public static final Target FirstName = Target.the(targetElementName("Enter First Name"))
                .located(By.id("FirstName"));
        public static final Target LastName = Target.the(targetElementName("Enter Last Name"))
                .located(By.id("LastName"));
        public static final Target Email = Target.the(targetElementName("Enter Email address"))
                .located(By.id("EmailAddress"));
        public static final Target Birth = Target.the(targetElementName("Enter Date of birth"))
                .located(By.id("DateBirth"));

    }

