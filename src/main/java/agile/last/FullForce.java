package agile.last;

public class FullForce implements Strategy {
	public int strike(SuperHeros superhero) {
		int ind_weapon=superhero.chooseBestWeapon();
		superhero.usethis(ind_weapon);
		superhero.drinkBottle("force");
		return superhero.getPower();
	}
}
