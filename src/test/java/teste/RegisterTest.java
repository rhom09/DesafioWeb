package teste;

/*import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;*/

import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import core.Driver;
import enums.HobbiesEnum;
import pages.RegisterPage;

public class RegisterTest extends BaseTest {

	RegisterPage registerPage = new RegisterPage();

	@Test
	public void testCadastro() throws Exception {

		Driver.setUrl("http://demo.automationtesting.in/Register.html");
		registerPage.setFirstName("Romilton", Keys.ENTER);
		registerPage.setLastName("Viana");
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
