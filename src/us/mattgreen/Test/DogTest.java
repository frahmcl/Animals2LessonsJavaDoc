import us.mattgreen.Dog;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    public DogTest() {
    }

    @Test
    public void testSomething() {
        Dog Retriever = new Dog(true, "Puddles");
        Assert.assertEquals("Cool", true, Retriever.isFriendly());
        Assert.assertEquals("Pooddles", Retriever.getName());
    }
}
