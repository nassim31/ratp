package agile.last;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CareTakerTest {

    @Test
    public void add() throws Exception { //ici j'ai tester les deux fonctionnalités 2en1
        SuperHeros venom = new SuperHeros(20, 10, new Weapon(3,"lol"));
        venom.usethis(1);
        assertEquals(venom.getPowerWithWeapon(), 30);

        SuperHeros venom2 = new SuperHeros(40, 10);
        CareTaker saver=new CareTaker();

        saver.add(venom2.saveStateToMemento());//add
        venom.attack(venom2);
    assertEquals(10, venom2.getLifePoints());
    venom2.getStateFromMemento(saver.get(0));// GET
    assertEquals(40, venom2.getLifePoints());
       try{ venom2.getStateFromMemento(saver.get(3));
       }// GET2 LES assert fonctionnet et l'exception aussi
       catch (Exception e) {
           e.printStackTrace();
       }

    }

    @Test
    public void get() {
    }
}