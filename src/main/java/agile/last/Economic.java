package agile.last;

public class Economic implements Strategy {
	public int strike(SuperHeros superhero) {
		int ind_weapon=superhero.chooseBestWeapon();
		superhero.usethis(ind_weapon);
		return superhero.getPowerWithWeapon();
	}
}
