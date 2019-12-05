package agile.last;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;



public class AttaquerSteps {
	Weapon arm = new Weapon(10, "arm"); // création d'une nouvelle arme.
	SuperHeros nassim = new SuperHeros(10, 2, arm); // création du super héro nassim
	
	SuperHeros ennemi = new SuperHeros(10, 5); // création du super héro ennemi

	@Given("Nassim change arme")
	public void nassim_change_arme() {
		nassim.usethis(1); // Nassim choisit l'arme (arm) pour attaquer ennemi
		assertTrue(ennemi.isAlive()); // on s'assure que ennemi est toujours en vie
	}
	
	@When("Nassim attaque ennemi")
	public void nassim_attaque_ennemi() {
		nassim.attack(ennemi); // Nassim procède à l'attaque
	}
	
	@Then("Ennemi perd la vie")
	public void ennemi_perd_la_vie() {
		assertFalse(ennemi.isAlive()); // ennemi perd la vie
	}
}
