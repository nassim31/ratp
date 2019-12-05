package agile.last;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @org.junit.jupiter.api.Test
    void drinkBottle () {
        Boisson a=new Boisson("a");
        Boisson b=new Boisson("bdeViellllll");
        Boisson p=new Boisson("p");
        List<Boisson> c=new ArrayList<>();
        c.add(a);
        c.add(b);
        c.add(p);
        Person BOB=new Person("toto", 12, c);
        BOB.drinkBottle("ghjhgggjvIeukhlkjgkgh");
        c.remove(1);
        List<Boisson> kl=BOB.getPossessions();
        Assert.assertArrayEquals(c.toArray(),kl.toArray());


    }

    @org.junit.jupiter.api.Test
    void hasBottle () {
        Boisson a=new Boisson("a");
        Boisson b=new Boisson("b");
        List<Boisson> c=new ArrayList<>();
        c.add(a);
        c.add(b);
        Person BOB=new Person("toto", 12, c);
        Assert.assertEquals(true, BOB.hasBottle());
    }

    @org.junit.jupiter.api.Test
    void buyBottle () {
        Boisson a=new Boisson("a",10,15.2);
        Boisson b=new Boisson("b",30,60.0);
        Person BOB=new Person("toto", 12);
        Assert.assertEquals(true, BOB.buyBottle(a));
        Assert.assertEquals(false, BOB.buyBottle(b));

    }
}