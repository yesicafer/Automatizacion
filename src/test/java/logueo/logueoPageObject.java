package logueo;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.server.handler.GetScreenOrientation;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://mx1.choucairtesting.com/zimbra/")
public class logueoPageObject extends PageObject {
	@FindBy(id="username")
	WebElementFacade txtUsuario;
	
	@FindBy(id="password")
	WebElementFacade txtContraseña;
	
	@FindBy(className="zLoginButton")
	WebElementFacade btnIniciarSesion;
	
	@FindBy(id="client")
	WebElementFacade cboVersion;
	

	public void ingresarUsuarioDeLogueo(String strUsuario) {
		
		txtUsuario.sendKeys(strUsuario);
		
	}

	public void ingresarContraseñaDeLogueo(String strContrasena) {
		txtContraseña.sendKeys(strContrasena);
		
		
	}

	public void seleccionarVersion(String string) {
		
		cboVersion.selectByVisibleText(string);
	}

	public void seleccionarOpcionIniciarSesion() {
		btnIniciarSesion.click();
		
	}
	
	
	
}
