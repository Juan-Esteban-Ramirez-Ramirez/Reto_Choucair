package co.com.proyectobase.tasks;

import co.com.proyectobase.userinterface.BuscarCursoPagina;
import co.com.proyectobase.userinterface.PaginaMapeo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class Search implements Task {

    private String course;

    public Search(String course){
        this.course = course;
    }

    public static Search the(String course) {
        return Tasks.instrumented(Search.class,course);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(BuscarCursoPagina.BUTT_CC),
                Enter.theValue("Workshop de Automatización").into(BuscarCursoPagina.WRITE_WA),
                Click.on(BuscarCursoPagina.IR)
                //Click.on(BuscarCursoPagina.IN_CURSO)


                );

    }
}

