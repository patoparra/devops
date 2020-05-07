//implementación de todos los pasos de los escenarios de prueba
package seleniumgluecode;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Test {
	
	private WebDriver driver = Hooks.getDriver();

	@Given("^El usuario se encuentra en la pagina Home de imalittletester$")
	public void el_usuario_se_encuentra_en_la_pagina_Home_de_imalittletester() throws Throwable {
		String titleHomePage = "imalittletester – Testing. With Java, Selenium, TestNG, Maven, Spring, IntelliJ and friends.";
		Assert.assertEquals(titleHomePage, driver.getTitle());
	    //throw new PendingException();
	}
	
	@When("^Hace clic sobre el boton The little tester comics$")
	public void hace_clic_sobre_el_boton_The_little_tester_comics() throws Throwable {
		WebElement tittleComicsLocator = driver.findElement(By.id("menu-item-2008"));
		tittleComicsLocator.click();
	}
	
	@Then("^Se debe redirigir a la pantalla Comics$")
	public void se_debe_redirigir_a_la_pantalla_Comics() throws Throwable {
		WebElement pageTittleLocator = driver.findElement(By.className("page-title"));
		//Thread.sleep(1000);
		Assert.assertTrue("No se redirecciono correctamente a la pagina de comics", pageTittleLocator.isDisplayed());
	    Assert.assertEquals("Category: comics", pageTittleLocator.getText());
	}
}