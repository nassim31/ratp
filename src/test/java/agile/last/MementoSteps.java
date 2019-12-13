package agile.last;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MementoSteps {
	SuperHeros popeye = new SuperHeros(10, 10); 
	SuperHeros ploto = new SuperHeros(10, 5);
	CareTaker saver=new CareTaker();
	
	@Given("Popeye sauvegarde son etat")
	public void popeye_sauvegarde_son_etat(){
        saver.add(popeye.saveStateToMemento());
        try {
			assertTrue(popeye.getLifePoints()==saver.get(0).getState().getLifePoints());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@When("Popeye est attaque par Pluto")
	public void popeye_est_attaque_par_ploto() {
		int lp = popeye.getLifePoints();
		ploto.attack(popeye);
		assertEquals(popeye.getLifePoints(), lp - ploto.getPower());
	}
	
	
	@Then("Popeye peut comparer ses points de vie actuels et ceux precedents")
	public void popeye_compare(){
		try {
			assertTrue(popeye.getLifePoints() < saver.get(0).getState().getLifePoints());
			assertEquals(popeye.getLifePoints(), saver.get(0).getState().getLifePoints() - ploto.getPower());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
