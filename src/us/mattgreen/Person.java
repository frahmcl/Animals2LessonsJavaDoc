package us.mattgreen;

/**
 * Created by mgreen14 on 12/27/17.
 */
public abstract class Person {
    private String name;

    /**
     *
     * @param name the name of the person
     */
    public Person(String name) {
        this.name = name;
    }

    /**
     *
     * @return the name of the person object
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name set the name of the person object
     */
    public void setName(String name) {
        this.name = name;
    }


}