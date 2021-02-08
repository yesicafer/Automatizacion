package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/java/modulo/correo/redactar/redactarCorreo.feature", tags="@datoQuemado", glue="modulo.correo.redactar")
public class RunnerZimbra {
	
 	
	

}
