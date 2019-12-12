package agile.last;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FullForceSteps {

		Weapon arm1 = new Weapon(5, "arm1"); 
		Weapon arm2 = new Weapon(10, "arm2"); 
		SuperHeros popeye = new SuperHeros(10, 10); 
		SuperHeros ploto = new SuperHeros(10, 5);
		Strategy full = new FullForce();
		int power_avant = popeye.getPower();
        Boisson b=new Boisson("potionforce",30,20.0);
        

		
		@Given("Ploto attaque Popeye")
		public void ploto_attaque_popeye() {
			int lp = popeye.getLifePoints();
			ploto.attack(popeye);
			assertEquals(popeye.getLifePoints(), lp - ploto.getPower());
		}
		
		@When("Popeye choisit la strategie full pour riposter")
		public void popeye_choisit_la_strategie_full_pour_riposter() {
			popeye.addWeapon(arm1); popeye.addWeapon(arm2);
			popeye.setArgent(40);
			popeye.buyBottle(b);
			int lp = ploto.getLifePoints();
			popeye.attack(ploto);
			assertEquals(ploto.getLifePoints(), lp-popeye.getPowerWithWeapon());
		}
		
		@Then("Popeye voit sa force augmenter encore plus")
		public void popeye_voit_sa_force_augmenter_encore_plus() {
			double power_apres = (double)popeye.strike(full);
			double power = (power_avant + b.getPuissance())*arm2.getRendement() ;
			System.out.println(power);
			System.out.println(power_apres);
			assertTrue(power_apres == power );
			assertTrue(power_avant < power_apres);
		}
}
