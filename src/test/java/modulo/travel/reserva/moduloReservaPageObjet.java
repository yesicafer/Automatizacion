package modulo.travel.reserva;

import java.util.Set;

import org.apache.tools.ant.taskdefs.Sleep;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.openhtmltopdf.css.style.derived.StringValue;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.photography.ScreenshotPhoto;
import net.thucydides.core.annotations.DefaultUrl;
import java.util.List;
import java.util.Random;


@DefaultUrl("https://www.phptravels.net/home")
public class moduloReservaPageObjet extends PageObject {
	
	
	
	
	//BotonHotel 
	
		@FindBy(xpath="//*[@class='text-center hotels active']")
		WebElementFacade btnHotels;
	//ListaDespegable
		@FindBy(xpath="//*[@class='select2-container form-control hotelsearch locationlistHotels']")
		WebElementFacade liDestino;
		//*[@id='select2-drop']//li[@class='select2-results-dept-0 select2-result select2-result-unselectable select2-result-with-children']//li
		//@FindBy(xpath="//*[@id='select2-drop']//ul[@class='select2-results']//li[1]//li")
		@FindBy(xpath="//*[@id='select2-drop']//li[@class='select2-results-dept-0 select2-result select2-result-unselectable select2-result-with-children']//li")
		List<WebElementFacade> liHotel;
		
		@FindBy(xpath="//*[@id='checkin']")
		WebElementFacade txtCheckIn;
		
		@FindBy(xpath="//*[@id='checkout']")
		WebElementFacade txtCheckOut;
		
		@FindBy(xpath="//*[@class='col o2']//input[@class='form-control touch-spin-03 form-readonly-control' and @name='adults']")
		WebElementFacade btnAdult;
		
		@FindBy(xpath="//*[@class='col o2']//*[@class='btn btn-white bootstrap-touchspin-up ']")
		WebElementFacade btnMasAdult;
		
		@FindBy(xpath="//*[@class='col o2']//*[@class='btn btn-white bootstrap-touchspin-down ']")
		WebElementFacade btnMenosAdult;
		
		@FindBy(xpath="//input[@class='form-control touch-spin-03 form-readonly-control' and @name='children']")
		WebElementFacade btnNiños;
		
		@FindBy(xpath="//*[@class='col 01']//*[@class='btn btn-white bootstrap-touchspin-up ']")
		WebElementFacade btnMasNiños;
		
		@FindBy(xpath="//*[@class='col 01']//*[@class='btn btn-white bootstrap-touchspin-down ']")
		WebElementFacade btnMenosNiños;
		
		@FindBy(xpath="//*[@class='tab-inner menu-horizontal-content']//*[@class='col-lg-2 col-sm-12 col-xs-12']//child::button[contains(text(),'Search')]")
		WebElementFacade btnSearch;
		
		@FindBy(xpath="//a[@href='#detail-content-sticky-nav-04']")
		WebElementFacade txtFacilities;
		
		@FindBy(xpath="//*[@id='detail-content-sticky-nav-02']//*[@class='custom-control custom-checkbox' ]//label[contains(text(),'Select Room')]")
		WebElementFacade txtCuarto;
		
		@FindBy(xpath="//button[@class='book_button btn btn-success btn-block btn-lg chk']")
		WebElementFacade btnBooNow;
		
		@FindBy(xpath="//li//a[@href='#detail-content-sticky-nav-03']")
		WebElementFacade txtLocation;
		
		@FindBy(xpath="//*[@name='firstname']")
		WebElementFacade txtPrimerNombre;
		
		@FindBy(xpath="//*[@name='lastname']")
		WebElementFacade txtApellido;
		
		@FindBy(xpath="//*[@name='email']")
		WebElementFacade txtEmail;
		
		@FindBy(xpath="//*[@name='confirmemail']")
		WebElementFacade txtConfirmaEmail;
		
		@FindBy(xpath="//*[@name='phone']")
		WebElementFacade txtContacto;
		
		@FindBy(xpath="//*[@name='address']")
		WebElementFacade txtDireccion;
		
		@FindBy(xpath="//*[@class='chosen-single']//*[contains(text(),'Select Country')]")
		WebElementFacade slPais;
		
		@FindBy(xpath="//*[@class='chosen-single']//*[contains(text(),'Select Country')]")
		WebElementFacade txtPais;
		
		@FindBy(xpath="//*[@class='chosen-search-input']")
		WebElementFacade txtPais2;
		
		@FindBy(xpath="//input[@class='o2 coupon form-bg-light']")
		WebElementFacade txtCupon;
		
		@FindBy(xpath="//*[@class='btn btn-danger applycoupon btn-block']")
		WebElementFacade btnCupon;
		
		@FindBy(xpath="//*[@class='btn btn-success btn-lg btn-block completebook']")
		WebElementFacade btnCofirmar;
		
		@FindBy(xpath="//*[@class='btn btn-primary']")
		WebElementFacade btnPagar;
		
		@FindBy(xpath="//*[@class='chosen-single']//*[contains(text(),'Select Payment Method')]")
		WebElementFacade liPago;
		
		@FindBy(xpath="//ul[@class='chosen-results']//child::li")
		List<WebElementFacade> liTarjetaCredito1;
		
		@FindBy(xpath="//*[@class='active-result result-selected']")
		WebElementFacade liTarjetaCredito;
		
		@FindBy(xpath="//*[@class='chosen-results']//*[contains(text(),'Credit Card') and @data-option-array-index='3']")
		WebElementFacade liTarjetaCred;
		
		@FindBy(xpath="//*[@name='cardnum']")
		WebElementFacade txtNumeroTarjeta;
		
		@FindBy(xpath="//*[@name='expMonth']")
		WebElementFacade txtFechaCard;
		
		@FindBy(xpath="//*[@name='expYear']")
		WebElementFacade txtFechaExp;
		
		@FindBy(xpath="//*[@name='cvv']")
		WebElementFacade txtCvv;
		
		@FindBy(xpath="//*[@class='btn btn-success btn-lg paynowbtn go-right']")
		WebElementFacade btnPagarAhora;
		
		@FindBy(xpath="//*[@style='background-color: #ff3939; color: white; font-family: Tahoma; margin-bottom: 15px; padding: 16px; font-weight: lighter; text-transform: uppercase; letter-spacing: 6px; width: 571px; margin: auto;']")
		WebElementFacade txtFinal;
		
		public void seleccionarOpcionHotel () {
			btnHotels.click();
		}
		
		
		public void seleccionarDestino(String nombresHotele) {
			
    		   liDestino.click();
			 
			 for (int i = 0; i< liHotel.size();i++) {
				
		   	 if(liHotel.get(i).containsText(nombresHotele)) {
		   		 liHotel.get(i).click();	
			
		   	 }
		   	 }
		}
		public void ingresarCheckIn(String fechaIncial) {
			    txtCheckIn.clear();
			    txtCheckIn.sendKeys(fechaIncial);
			
		}
		
		public void ingresarCheckOut(String fechaFinal) {
				txtCheckOut.clear();
				txtCheckOut.sendKeys(fechaFinal);
			
		}
		 
		public void dosAdultos(int x) {
			
			int valor=Integer.parseInt(btnAdult.getValue());
			
			if(valor!=x) {
				if(valor<=x) {
				for (int i=valor;i<x;i++) 
				{
				btnMasAdult.click();
					
				}	
				}
				else   {
				for (int i=valor;i>x;i--) {
					
				btnMenosAdult.click();
				}	
				}
					
				}
				
			}
		
		public void ceroniños(int x) {
			

			int valor=Integer.parseInt(btnNiños.getValue());
			
			if(valor!=x) {
				if(valor<=x) {
				for (int i=valor;i<x;i++) 
				{
				btnMasNiños.click();
					
				}	
				}
				else   {
				for (int i=valor;i>x;i--) {
					
				btnMenosNiños.click();
				}	
				}
					
				}
							
		}
			
		public void hacer_click_opcion_Search () {
				btnSearch.click();
			
		}
		
		
		
		public void indicarElemento(WebElementFacade indicar) {
				
				Actions actions=new Actions(getDriver());
				actions.moveToElement(indicar).perform();
									
			}
		
		public void moverScroll (String x, String y) {
			
				((JavascriptExecutor) getDriver()).executeScript("window.scrollBy("+x+","+y+")");
		}
		
		public void seleccionar_cuarto() {
		        	
		        txtFacilities.click();
				waitFor(300).milliseconds();
				indicarElemento(txtCuarto);
				moverScroll("0","200");
				txtCuarto.click();
					
		}
		
		public void hacer_clic_en_el_botón_Book_now() {
				
			    txtLocation.click();
				waitFor(300).milliseconds();
				btnBooNow.click();
		}
		
		public void alertaAceptar() {
			
				getDriver().switchTo().alert().accept();
							
		}
		
		public void diligenciar_datos_personales (String nombre, String apellido, String email, String confirmarEmail, String contacto, String Direccion, String pais) {
			
			        txtPrimerNombre.sendKeys(nombre);
			        txtApellido.sendKeys(apellido);
			        txtEmail.sendKeys(email);
			        txtConfirmaEmail.sendKeys(confirmarEmail);
			        txtContacto.sendKeys(contacto);
			        txtDireccion.sendKeys(Direccion);
			        slPais.click();
			        txtPais2.typeAndEnter(pais);
			             	    
			        		        			
		}
		
		public void validarCupon(String cupon) {
					
					txtCupon.sendKeys(cupon);		
					btnCupon.click();
					waitFor(500).milliseconds();
					getDriver().switchTo().alert().accept();
					waitFor(500).milliseconds();
		}
		
		public void confirmar() {
			
					indicarElemento(btnCofirmar);
					moverScroll("0","50");
					btnCofirmar.click();
					waitFor(800).milliseconds();
		}
		
		public void pagar() {
			
					btnPagar.click();
					waitFor(400).milliseconds();
		}
		
		public void seleccionarPago(String tarjeta) {
			
					liPago.click();		
					liTarjetaCred.click();
					waitFor(400).milliseconds();
					
		}
			
			
		
		public void diligenciarDatosPago (String nombre, String apellido)  {
					
					txtPrimerNombre.sendKeys(nombre);
					txtApellido.sendKeys(apellido);
		    
		}
		
		public void ingresarNumeroTarjetaCredito(String contrasena) {
			
					Random rnd = new Random();
			
					int[] longitud = new int[14];
					int aleatorio[]= {1,2,3,4,5,6,7,8,9};
					int  inicia[] = {43,44,45,46,53,54,55,66};
			
					String lil=String.valueOf(inicia[rnd.nextInt(inicia.length)]);			
					txtNumeroTarjeta.sendKeys(lil);
			
			for(int i=0; i<longitud.length; i++) {
				
					String aleatorio2=String.valueOf(aleatorio[rnd.nextInt(aleatorio.length)]);
					txtNumeroTarjeta.sendKeys(aleatorio2);
			
			
			}
					txtFechaCard.selectByVisibleText("Apr (04)");	
					txtFechaExp.selectByVisibleText("2022");
					txtCvv.sendKeys(contrasena);
					btnPagarAhora.click();
			
		}
		
		public void resultadoEsperado(String comparacion) {
					
					System.out.println(txtFinal.getText());
					System.out.println(comparacion);
					Assert.assertEquals(txtFinal.getText(),comparacion);
						
		}
		
}



		   	 
			
			
			
			
			
		



