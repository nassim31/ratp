package agile.last;

import static org.junit.Assert.assertEquals;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ArmeSteps {

	Weapon arm = new Weapon(10, "arm"); // création d'une nouvelle arme
	SuperHeros nassim = new SuperHeros(10, 2); //création du super héros nassim
	

	@Given("Nassim ajoute une nouvelle arme dans son arsenal")
	public void nassim_ajoute_une_nouvelle_arme_dans_son_arsenal() {
		assertEquals(nassim.getPower(), 2); // on s'assure que la puissance de Nassime est égale à 2 avant d'utiliser son arme
		nassim.addWeapon(arm); // Nassim ajoute l'arme
	}
	
	@When("Nassim choisit cette arme")
	public void nassim_choisit_cette_arme() {
		assertEquals(nassim.getArm().indexOf(arm), 1); // on s'assure de la position de l'arme dans l'arsenal de Nassim
		nassim.usethis(1); // nassim choisit d'utiliser l'arme
	}
	
	@Then("Nassim verifie la puissance de l arme")
	public void nassim_verifie_la_puissance_de_l_arme() {
		assertEquals(nassim.getPowerWithWeapon(), 20); // Nassim vérifie la puissance de son arme
	}
}
