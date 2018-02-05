package us.mattgreen;

/**
 * Created by mgreen14 on 12/27/17.
 */
public class Dog extends Pet implements Talkable {
    private boolean friendly;

    /**
     * Dog Constructor:
     * @param friendly shows if dog is friendly or not
     * @param name gives name of dog
     */
    public Dog(boolean friendly, String name) {
        super(name);
        this.friendly = friendly;
    }

    /**
     *
     * @return the dogs status if friendly or not
     */
    public boolean isFriendly() {
        return friendly;
    }

    /**
     *
     * @return overrides talkable for dogs Bark
     */
    @Override
    public String talk() {
        return "Bark";
    }

    /**
     *
     * @return dogs name and status of friendly
     */
    @Override
    public String toString() {
        return "Dog: " + "name=" + name + " friendly=" + friendly;
    }


}