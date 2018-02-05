package us.mattgreen.Test;

import us.mattgreen.Cat;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    public CatTest() {
    }

    @Test
    public void createCat() {
        Cat newCat = new Cat(5, "Bobo");
        Assert.assertEquals(5, newCat.getMousesKilled());
        Assert.assertEquals("Bobbo", newCat.getName());
    }
}