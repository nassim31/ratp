package agile.last;

import java.util.ArrayList;
import java.util.List;

public class SuperHeros extends Person {

    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    // les attributs de ma classe

    private List<Weapon> arm= new ArrayList<Weapon>();
    private  Weapon DEFAULT=new Weapon(1, "hand");

    public SuperHeros(int lifePoints, int power) {
        super(lifePoints, power);
        this.arm.add(DEFAULT);
    }

    public SuperHeros(int lifePoints, int power, List<Weapon> arme) {
        super(lifePoints, power);
        arm.add(DEFAULT);
        arm.addAll(arme);
    }
    public SuperHeros(int lifePoints, int power, Weapon arme) {
        super(lifePoints, power);
        arm.add(DEFAULT);
        arm.add(arme);
    }

    private int choosen=0;

    //mes getters



    public List<Weapon> getArm() {
        return arm;
    }
    // Constructor of my Class


    public SuperHeros(String nom, int argent, List<Boisson> possessions, int lifePoints, int power, List<Weapon> arme) {
        super(nom, argent, possessions, lifePoints, power);
        arm.add(DEFAULT);
        arm.addAll(arme);
    }

    public SuperHeros(String nom, int argent, int lifePoints, int power, List<Weapon> arme) {
        super(nom, argent, lifePoints, power);
        arm.add(DEFAULT);
        arm.addAll(arme);
    }

    // check if he is still alive
    public boolean isAlive (){
        return this.lifePoints>0;
    }

    public int chooseBestWeapon() {
	    int ind_weapon=0;
		for(int i=0; i<this.getArm().size();i++){
			if(this.getArm().get(ind_weapon).getRendement()<this.getArm().get(i).getRendement()) {
				ind_weapon = i;
			}
		}
		return ind_weapon;
    }

    public Boolean usethis(int choose){
        if((choose< arm.toArray().length) && choose>=0){
            this.choosen=choose;
            return true;
        }else {
            return false;
        }
    }
    public int getPowerWithWeapon(){
        return arm.get(choosen).getRendement()*power;
    }
    public void attack(SuperHeros ennemi){
        int lp =  this.getPowerWithWeapon();
        ennemi.setLifePoints(ennemi.getLifePoints()-lp);
    }
    //Weapons list
    public String viewWeapons(){
        String tmp ="";
        for (Weapon l: this.arm) {
            tmp+=l.toString();
        }
        return tmp;
    }

    public void  addWeepon(Weapon tmp){
        this.arm.add(tmp);
    }
    
    public int strike(Strategy methode) {
    	int hit = methode.strike(this);
    	this.power=this.powerBerforPowerUp;
    	this.powerUp=false;
    	return hit;
    }


}

//Before fusion des deux classe
    /*  public SuperHeros( int lifePoints,int power )
        {
            this.lifePoints=lifePoints;
            this.power=power;
            this.arm.add(new Weapon(1,"Default"));
        }
        public SuperHeros( int lifePoints,int power,Weapon wep )
        {
            this.lifePoints=lifePoints;
            this.power=power;
            this.arm.add(new Weapon(1,"Default"));
            this.arm.add(wep);
            this.choosen++;
        }*/