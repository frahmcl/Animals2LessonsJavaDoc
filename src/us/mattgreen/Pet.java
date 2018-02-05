package us.mattgreen;

/**
 * Created by mgreen14 on 12/27/17.
 */
public abstract class Pet {
    protected String name;

    /**
     *
     * @param name pass the name to generic pet
     */
    public Pet(String name) {
        this.name = name;
    }

    /**
     *
     * @return name of generic pet
     */
    public String getName() {
        return name;
    }


}