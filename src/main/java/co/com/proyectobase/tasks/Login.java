package co.com.proyectobase.tasks;

import co.com.proyectobase.userinterface.PaginaMapeo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {


    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PaginaMapeo.INGRESAR),
                Enter.theValue("1037618451").into(PaginaMapeo.IN_USER),
                Enter.theValue("Choucair2021*").into(PaginaMapeo.IN_KEY),
                Click.on(PaginaMapeo.ACCEDER)

        );
        
    }
}
