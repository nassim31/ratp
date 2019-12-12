package agile.last;

public class Economic implements Strategy {
	@Override
	public int strike(SuperHeros superhero) {
		int ind_weapon=superhero.chooseBestWeapon();
		superhero.usethis(ind_weapon);
		return superhero.getPowerWithWeapon();
	}
}
