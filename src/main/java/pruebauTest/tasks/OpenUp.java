package pruebauTest.tasks;

import pruebauTest.tasks.uTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;


public class OpenUp implements Tasks {
    private pruebauTest.userinterface.uTestPage uTestPage;
    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }


    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(OpenUp.browserOn(uTestPage));

    }

}
