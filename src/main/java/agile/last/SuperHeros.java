package agile.last;

import java.util.ArrayList;
import java.util.List;

public class SuperHeros extends Person {

    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    // les attributs de ma classe
    private int lifePoints;
    private int power;
    private List<Weapon> arm= new ArrayList<Weapon>();
    private static Weapon DEFAULT=new Weapon(1, "hand");

    private int choosen=0;

    //mes getters

    public int getLifePoints(){
        return this.lifePoints;
    }

    public int getPower(){
        return this.power;
    }

    public List<Weapon> getArm() {
        return arm;
    }

    // my setters
    public void setLifePoints(int lp){
        this.lifePoints+=lp;
    }

    public void setPower(int pUp){
        this.power+=pUp;
    }

    // Constructor of my Class


    public SuperHeros(String nom, int argent, int lifePoints, int power, List<Weapon> arme) {
        super(nom, argent);
        this.lifePoints = lifePoints;
        this.power = power;
        arm.add(DEFAULT);
        this.arm.addAll(arme);
    }

    public SuperHeros(String nom, int argent, List<Boisson> possessions, int lifePoints, int power, List<Weapon> arme) {
        super(nom, argent, possessions);
        this.lifePoints = lifePoints;
        this.power = power;
        arm.add(DEFAULT);
        this.arm.addAll(arme);
    }

    public SuperHeros(int lifePoints, int power, List<Weapon> arme) {
        this.lifePoints = lifePoints;
        this.power = power;
        arm.add(DEFAULT);
        this.arm.addAll(arme);
    }
    public SuperHeros(int lifePoints, int power, Weapon arme) {
        this.lifePoints = lifePoints;
        this.power = power;
        arm.add(DEFAULT);
        this.arm.add(arme);
    }

    public SuperHeros(int lifePoints, int power) {
        this.lifePoints = lifePoints;
        this.power = power;
        arm.add(DEFAULT);
    }

    // check if he is still alive
    public boolean isAlive (){
        return lifePoints>0;
    }


    public Boolean usethis(int choose){
        if((choose< arm.toArray().length) && choose>0){
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
        ennemi.setLifePoints(-lp);
    }
    //Weapons list
    public String viewWeapons(){
        String tmp ="";
        for (Weapon l: arm) {
            tmp+=l.toString();
        }
        return tmp;
    }

    public void  addWeepon(Weapon tmp){
        this.arm.add(tmp);
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