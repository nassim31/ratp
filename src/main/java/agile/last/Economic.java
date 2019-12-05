package agile.last;

public class Economic implements Strategy {
	@Override
	public void strike(SuperHeros superhero) {
		int ind_weapon=0;
		for(int i=0; i<superhero.getArm().size();i++){
			if(superhero.getArm().get(ind_weapon).getRendement()<superhero.getArm().get(i).getRendement()) {
				ind_weapon = i;
			}
		}
		superhero.usethis(ind_weapon);
		//return superhero;
	}
}
