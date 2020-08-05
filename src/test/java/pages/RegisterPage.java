package pages;

import java.util.LinkedHashMap;

import core.Element;
import enums.HobbiesEnum;
import map.RegisterMap;

public class RegisterPage {

	RegisterMap registerMap = new RegisterMap();

	public String getTitulo() {
		return registerMap.titulo.getText().trim();
	}

	public void setFirstName(CharSequence... valor) {
		registerMap.firstName.sendKeys(valor);
	}

	public void setLastName(CharSequence... valor) {
		registerMap.lastName.sendKeys(valor);
	}

	public void setAddress(CharSequence... valor) {
		registerMap.address.sendKeys(valor);
	}

	public void setEmailAddress(CharSequence... valor) {
		registerMap.emailAddress.sendKeys(valor);
	}

	public void setPhone(CharSequence... valor) {
		registerMap.phone.sendKeys(valor);
	}

	public void clickMale() {
		registerMap.male.click();
	}

	public void clickFeMale() {
		registerMap.female.click();
	}

	public void clickHobbies(HobbiesEnum hobbie) {

		LinkedHashMap<HobbiesEnum, Element> hobbies = new LinkedHashMap<HobbiesEnum, Element>();

		hobbies.put(HobbiesEnum.CRICKET, registerMap.cricket);
		hobbies.put(HobbiesEnum.MOVIES, registerMap.movies);
		hobbies.put(HobbiesEnum.HOCKEY, registerMap.hockey);

		hobbies.get(hobbie).click();
	}

	public void selectLanguages(String language) throws Exception {
		registerMap.clickLanguage.click();
		registerMap.languages.selectList(language);
	}

	public void selectSkills(String skill) {
		registerMap.skills.select(skill);
	}

	public void selectCountry(String country) {
		registerMap.country.select(country);
	}

	public void selectCountryDois(String countryDois) {
		registerMap.countryDois.select(countryDois);
	}

	public void selectBirthYear(String year) {
		registerMap.birthYear.select(year);
	}

	public void selectBirthMonth(String month) {
		registerMap.birthMonth.select(month);
	}

	public void selectBirthDay(String day) {
		registerMap.birthDay.select(day);
	}

	public void setPassword(CharSequence... valor) {
		registerMap.password.sendKeys(valor);
	}

	public void setSecondPassword(CharSequence... valor) {
		registerMap.secondPassword.sendKeys(valor);
	}

	public void setUpload(CharSequence... valor) {
		registerMap.upload.sendKeys(valor);
	}

}
