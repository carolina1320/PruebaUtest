package pruebauTest.questions;

import net.serenitybdd.screenplay.Question;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question){
        this.question = question;
    }

    public static Answer toThe (String question){
        return new Answer(question);

    }

    public  Boolean answeredBy(Actor actor) {
        boolean result;
        String newRegister= Text.of(RegisterPage.NEW_REGISTER).viewedBy(actor).asString();
        if (question.equals(newRegister)){
            result = true;
        }else {
            result = false;
        }
        return null;
    }

}
