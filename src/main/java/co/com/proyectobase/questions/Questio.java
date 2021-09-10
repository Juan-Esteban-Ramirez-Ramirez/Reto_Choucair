package co.com.proyectobase.questions;

import co.com.proyectobase.userinterface.BuscarCursoPagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Questio implements Question<String> {

    public static Questio validar() {
        return new Questio();
    }

    @Override
    public String answeredBy(Actor actor) {
        return Text.of(BuscarCursoPagina.NOMBRE_CURSO).viewedBy(actor).asString();
    }
}
