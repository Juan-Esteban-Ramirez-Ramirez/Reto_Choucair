package co.com.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuscarCursoPagina extends PageObject {

    public static final Target BUTT_CC = Target.the(" Selecciona cursos y certificaciones ").located(By.xpath("//*[@id=\"certificaciones\"]/a/img"));
    public static final Target WRITE_WA = Target.the(" Buscar curso _ Workshop de Automatización ").located(By.id("coursesearchbox"));
    public static final Target IR = Target.the(" Confirmar la busqueda anterior ").located(By.xpath("//button[contains(text(),'Ir')]"));
    public static final Target NOMBRE_CURSO = Target.the("estoy mapiando mensaje Workshop de Automatización").located(By.xpath("//*[@id=\"id_q\"]"));
    //public static final Target IN_CURSO = Target.the(" Entrar al curso __ Workshop de Automatización ").located(By.xpath("//*[@id=\"region-main\"]/div/div[1]/div"));


}


