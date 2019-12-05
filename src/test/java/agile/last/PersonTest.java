package agile.last;

import org.junit.Assert;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

public class PersonTest {

    @Test
    public void drinkBottle () {
        Boisson a=new Boisson("a");
        Boisson b=new Boisson("bdeViellllll");
        Boisson p=new Boisson("pdeforceeee");
        List<Boisson> c=new ArrayList<Boisson>();
        c.add(a);
        c.add(b);
        c.add(p);
        Person BOB=new Person("toto", 12, c);
        BOB.drinkBottle("Vie");
        c.remove(1);
        List<Boisson> kl=BOB.getPossessions();
        Assert.assertArrayEquals(c.toArray(),kl.toArray());
        Assert.assertEquals(false, BOB.drinkBottle("nada"));
        BOB.drinkBottle("Force");
        c.remove(1);
        Assert.assertArrayEquals(c.toArray(),kl.toArray());
    }

    @Test
    public void hasBottle () {
        Boisson a=new Boisson("a");
        Boisson b=new Boisson("b");
        List<Boisson> c=new ArrayList<Boisson>();
        c.add(a);
        c.add(b);
        Person BOB=new Person("toto", 12, c);
        Person TOTO=new Person("bob", 25);
        Assert.assertEquals(true, BOB.hasBottle());
        Assert.assertEquals(false, TOTO.hasBottle());
    }

    @Test
    public void buyBottle () {
        Boisson a=new Boisson("a",10,15.2);
        Boisson b=new Boisson("b",30,60.0);
        Person BOB=new Person("toto", 12);
        Assert.assertEquals(true, BOB.buyBottle(a));
        Assert.assertEquals(false, BOB.buyBottle(b));
    }
}