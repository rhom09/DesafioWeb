package steps;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.Keys;

import core.Driver;
import enums.HobbiesEnum;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import pages.RegisterPage;

public class RegisterSteps {
	RegisterPage registerPage = new RegisterPage();

	@Dado("que estou na pagina Register com o titulo {string}")
	public void queEstouNaPaginaRegisterComOTitulo(String titulo) {

		Driver.setUrl("http://demo.automationtesting.in/Register.html");
		assertEquals(titulo, registerPage.getTitulo());
	}

	@Quando("o campo firstName esta preenchido com {string}")
	public void oCampoFirstNameEstaPreenchidoCom(String firstName) {
		registerPage.setFirstName(firstName);
	}

	@Quando("o campo lastName esta preenchido com {string}")
	public void oCampoLastNameEstaPreenchidoCom(String lastName) {
		registerPage.setLastName(lastName);
	}

	@Quando("os campos do formulario estao preenchidos com dados validos")
	public void osCamposDoFormularioEstaoPreenchidosComDadosValidos() throws Exception {
		registerPage.setAddress("Via Transversal sul, 130");
		registerPage.setEmailAddress("rhom0909@gmail.com", Keys.ENTER);
		registerPage.setPhone("11959906029", Keys.ENTER);
		registerPage.clickMale();
		registerPage.clickHobbies(HobbiesEnum.MOVIES);
		registerPage.selectLanguages("English");
		registerPage.selectSkills("Java");
		registerPage.selectCountry("Brazil");
		registerPage.selectCountryDois("Australia");
		registerPage.selectBirthYear("1987");
		registerPage.selectBirthMonth("April");
		registerPage.selectBirthDay("8");
		registerPage.setPassword("123456");
		registerPage.setSecondPassword("123456");
		registerPage.setUpload(System.getProperty("user.dir")+"/lib/imagem.png");

	}

}
