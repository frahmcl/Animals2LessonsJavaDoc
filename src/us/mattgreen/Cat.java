package us.mattgreen;

/**
 * Created by mgreen14 on 12/27/17.
 */
public class Cat extends Pet implements Talkable {
    private int mousesKilled;

    /**
     *
     * @param mousesKilled pass how many mice killed for cat
     * @param name pass cats name
     */
    public Cat(int mousesKilled, String name) {
        super(name);
        this.mousesKilled = mousesKilled;
    }

    /**
     *
     * @return how many mice are killed
     */
    public int getMousesKilled() {
        return mousesKilled;
    }

    /**
     * if a cat kills an addition mouth, this will add to the total
     */
    public void addMouse() {
        mousesKilled++;
    }

    /**
     *
     * @return overrides talkable for to show cats meow
     */
    @Override
    public String talk() {
        return "Meow";
    }

    /**
     *
     * @return return the cats name and stats for mice killed
     */
    @Override
    public String toString() {
        return "Cat: " + "name=" + name + " mousesKilled=" + mousesKilled;
    }
}

