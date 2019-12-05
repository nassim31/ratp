package agile.last;

import java.util.ArrayList;
import java.util.List;

public class Person{
    public Person() {
    }

    private String nom;
    private int argent;
    private List<Boisson> possessions= new ArrayList<Boisson>();

    public Person (String nom, int argent) {
        this.nom = nom;
        this.argent = argent;
    }

    public Person (String nom, int argent, List<Boisson> possessions) {
        this.nom = nom;
        this.argent = argent;
        this.possessions = possessions;
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



    public void paratager(Person pote, Boisson B){
        int pos=possessions.indexOf(B);
        double pui=possessions.get(pos).getPuissance()/2.0;
        possessions.get(pos).setPuissance(pui);
        String effet=B.effects();
        this.drinkBottle(effet);
        ////////Pote ajoute-------------------


    }
}