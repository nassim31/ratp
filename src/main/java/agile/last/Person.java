package agile.last;

import java.util.ArrayList;
import java.util.List;


public class Person{
    protected String nom;
    protected int argent;
    protected List<Boisson> possessions= new ArrayList<Boisson>();
    protected int lifePoints;
    protected int power;
    protected boolean powerUp=false;
    protected int powerBerforPowerUp=0;

    public Person() {
    }

    public Person(String nom, int argent) {
        this.nom = nom;
        this.argent = argent;
    }

    public Person(String nom, int argent, List<Boisson> possessions) {
        this.nom = nom;
        this.argent = argent;
        this.possessions = possessions;
    }

    public Person(int lifePoints, int power) {
        this.nom="";
        this.argent=0;
        this.lifePoints = lifePoints;
        this.power = power;
        this.powerBerforPowerUp = power;
    }


    
    protected int getLifePoints(){
        return this.lifePoints;
    }

    public int getPower(){
        return this.power;
    }
    public void setPower(int pUp){
        this.power+=pUp;
    }


    // my setters
    public void setLifePoints(int lp){
        this.lifePoints=lp;
    }

    public Person(String nom, int argent, List<Boisson> possessions, int lifePoints, int power) {
        this.nom = nom;
        this.argent = argent;
        this.possessions = possessions;
        this.lifePoints = lifePoints;
        this.power = power;
        this.powerBerforPowerUp = power;
    }

    public Person(String nom, int argent, int lifePoints, int power) {
        this.nom = nom;
        this.argent = argent;
        this.lifePoints = lifePoints;
        this.power = power;
        this.powerBerforPowerUp = power;
    }

    //--------------Setters & Getters-----------------------------
    public String getNom () {
        return nom;
    }

    public void setNom (String nom) {
        this.nom = nom;
    }

    public int getArgent () {
        return argent;
    }

    public void setArgent (int argent) {
        this.argent = argent;
    }

    public List<Boisson> getPossessions () {
        return possessions;
    }

    public void setPossessions (List<Boisson> possessions) {
        this.possessions = possessions;
    }
//   ----------------------------------------------------------

    public void boireVie(Boisson vie){
	    this.lifePoints+= ((int) vie.getPuissance());
	}

    public void boireForce(Boisson force){
	    this.powerBerforPowerUp=this.power;
	    this.powerUp=true;
	    this.power+= ((int) force.getPuissance());
	}
    
    public boolean drinkBottle(String B_name){
        Boisson ef=new Boisson(B_name);
        String effet=ef.effects();
        if(effet.equals("nada"))
            return false;
        int pos=-1;
        for ( Boisson b:possessions ) {
            if ( b.effects().equals(effet) ){
                pos=possessions.indexOf(b);
                break;
            }
        }

        Boolean found=(pos>-1);
        /////------Comment agire sur vital------------
        if ( found ){
            if (effet.equals("vie"))
            this.boireVie(this.possessions.get(pos));
            if (effet.equals("force")){
                this.boireForce(this.possessions.get(pos));
            }

            possessions.remove(pos);
            return true;
        }
        return false;
    }

    public boolean hasBottle() {
        return !(possessions.isEmpty());
    }

    public boolean buyBottle(Boisson b) {
        if(b.getPrix()<this.getArgent()){
            this.argent=this.argent-b.getPrix();
            this.possessions.add(b);
            return true;
        }
        return false;
    }

	public Boisson selectBottle(List<Boisson> boissons, int i) {
		if(i<boissons.size()) {
			return boissons.get(i);
		}
		return null;
	}

    public void paratager(Person pote, Boisson B){
        int pos=possessions.indexOf(B);
        double pui=possessions.get(pos).getPuissance()/2.0;
        possessions.get(pos).setPuissance(pui);
        String effet=B.effects();
        this.drinkBottle(effet);
        ////////Pote ajoute-------------------


    }
}