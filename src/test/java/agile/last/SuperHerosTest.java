package agile.last;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;


public class SuperHerosTest {

    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    protected double fValeur1;
    protected double fValeur2;

    /**
     * Constructeur de la classe-test SuperHerosTest
     */
    public SuperHerosTest () {
    }

    /**
     * Met en place les engagements.
     * <p>
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp () // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        SuperHeros venom = new SuperHeros(20,10);
        List<Weapon> weap = new ArrayList<Weapon>();
        Weapon excalibur = new Weapon(10, "excalibur");
        Weapon baton = new Weapon(3,"baton");
        weap.add(excalibur);
        weap.add(baton);
        SuperHeros venom2 = new SuperHeros(20,10, weap);
    }

    @Test
    public void isAliveTest () {
        SuperHeros venom = new SuperHeros(20, 10);
        assertEquals(venom.isAlive(), true);
    }

    @Test
    public void attackWithWeaponTest () {
    	List<Weapon> weap = new ArrayList<Weapon>();
        Weapon excalibur = new Weapon(10, "excalibur");
        Weapon baton = new Weapon(3,"baton");
        weap.add(excalibur);
        weap.add(baton);
        SuperHeros venom = new SuperHeros(20, 10, weap);
        venom.usethis(2);
        assertEquals(venom.getPowerWithWeapon(), 30);
    }
    
    @Test
    public void strikeEconomicTest() {
    	List<Weapon> weap = new ArrayList<Weapon>();
        Weapon excalibur = new Weapon(10, "excalibur");
        Weapon baton = new Weapon(3,"baton");
        weap.add(baton);
        weap.add(excalibur);
        SuperHeros venom = new SuperHeros("venom", 50, 20, 10, weap);
        assertEquals(2, venom.chooseBestWeapon());
        assertEquals(100, venom.strike(new Economic()));
    }
    
    @Test
    public void strikeFullForceTest() {
    	List<Weapon> weap = new ArrayList<Weapon>();
        Weapon excalibur = new Weapon(10, "excalibur");
        Weapon baton = new Weapon(3,"baton");
        Boisson pforce=new Boisson("pforce",10,15);
        weap.add(baton);
        weap.add(excalibur);
        SuperHeros venom = new SuperHeros("venom", 50, 20, 10, weap);
        venom.buyBottle(pforce);
        assertEquals(2, venom.chooseBestWeapon());
        assertEquals(250, venom.strike(new FullForce()));   
    }

    /**
     * Supprime les engagements
     * <p>
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown () // throws java.lang.Exception
    {
        //Libérez ici les ressources engagées par setUp()
    }



    @Test
    public void usethis () {
        SuperHeros venom2 = new SuperHeros(20,10, new Weapon(10, "excalibur"));
        Assert.assertEquals(true, venom2.usethis(1));
        Assert.assertEquals(false, venom2.usethis(6));
    }

    @Test
    public void viewWeapons () {
        SuperHeros venom2 = new SuperHeros(20,10 );
        Assert.assertEquals("this is it", "hand/1", venom2.viewWeapons());
    }

    @Test
    public void addWeepon () {
        SuperHeros venom2 = new SuperHeros(20,10 );
        venom2.addWeepon(new Weapon(1, "lol"));
        Assert.assertEquals("this is it", "hand/1lol/1", venom2.viewWeapons());

    }
}
