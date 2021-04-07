package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/java/modulo/travel/reserva/reserva.feature", tags="@casoFallido", glue="modulo.travel.reserva")
public class Runner {
	
 	
	

}
