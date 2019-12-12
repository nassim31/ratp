package agile.last;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EconomicSteps {
	Weapon arm1 = new Weapon(5, "arm1"); 
	Weapon arm2 = new Weapon(10, "arm2"); 
	SuperHeros popeye = new SuperHeros(10, 10); 
	SuperHeros ploto = new SuperHeros(10, 5);
	Strategy eco = new Economic();
	int power_avant = popeye.getPower();

	
	@Given("Popeye est attaque par ploto")
	public void popeye_est_attaque_par_ploto() {
		int lp = popeye.getLifePoints();
		ploto.attack(popeye);
		assertEquals(popeye.getLifePoints(), lp - ploto.getPower());
	}
	
	@When("Popeye choisit la strategie eco pour riposter")
	public void popeye_choisit_la_strategie_eco_pour_riposter() {
		popeye.addWeapon(arm1); popeye.addWeapon(arm2);
		int lp = ploto.getLifePoints();
		eco.strike(popeye);
		popeye.attack(ploto);
		assertEquals(ploto.getLifePoints(), lp-popeye.getPowerWithWeapon());
	}
	
	@Then("Popeye voit sa force augmenter")
	public void popeye_voit_sa_force_augmenter() {
		int power_apres = popeye.getPowerWithWeapon();
		assertEquals(power_apres, power_avant*arm2.getRendement());
		assertTrue(power_avant < power_apres);
	}
}

