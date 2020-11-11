package pruebauTest.userinterface;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class uTestPage {

    public static final Target JOIN_BUTTON = Target.the( targetElementName("button that shows us the form Join Today"))
            .located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(), 'JOIN TODAY')]"));

    public static final Target FILL_FORM =Target.the( targetElementName ("user fill in data"))
            .located(By.id("fill data"));

    public static final Target NEXT_REGISTRATION =Target.the( targetElementName ("next data record"))
            .located(By.id("records"));

    public static final Target FINISH_BUTTON =Target.the( targetElementName ("finish registration button"))
            .located(By.xpath("//button[contains(@class, 'btn btn-primary)]"));


}