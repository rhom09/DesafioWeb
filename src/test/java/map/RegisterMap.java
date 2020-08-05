package map;

import core.Element;
import enums.ByValue;

public class RegisterMap {
	
	public Element titulo = new Element(ByValue.CSSSELECTOR, "h1");
	public Element firstName = new Element(ByValue.CSSSELECTOR, "input[placeholder='First Name']");
	public Element lastName = new Element(ByValue.CSSSELECTOR, "input[placeholder='Last Name']");
	public Element address = new Element(ByValue.CSSSELECTOR, "textarea[ng-model='Adress']");
	public Element emailAddress = new Element(ByValue.CSSSELECTOR, "input[ng-model='EmailAdress']");
	public Element phone = new Element(ByValue.CSSSELECTOR, "input[ng-model='Phone']");
	public Element upload = new Element(ByValue.ID, "imagesrc");
	public Element male = new Element(ByValue.CSSSELECTOR, "input[value='Male']");
	public Element female = new Element(ByValue.CSSSELECTOR, "input[value='FeMale']");
	public Element cricket = new Element(ByValue.ID, "checkbox1");
	public Element movies = new Element(ByValue.ID, "checkbox2");
	public Element hockey = new Element(ByValue.ID, "checkbox3");
	public Element clickLanguage = new Element(ByValue.ID, "msdd");
	public Element languages = new Element(ByValue.CSSSELECTOR, "a.ui-corner-all");
	public Element skills = new Element(ByValue.ID, "Skills");
	public Element country = new Element(ByValue.ID, "countries");
	public Element countryDois = new Element(ByValue.ID, "country");
	public Element birthYear = new Element(ByValue.ID, "yearbox");
	public Element birthMonth = new Element(ByValue.CSSSELECTOR, "select[ng-model='monthbox']");
	public Element birthDay = new Element(ByValue.ID, "daybox");
	public Element password = new Element(ByValue.ID, "firstpassword");
	public Element secondPassword = new Element(ByValue.ID, "secondpassword");
	public Element submitButton = new Element(ByValue.ID, "submitbtn");
}
