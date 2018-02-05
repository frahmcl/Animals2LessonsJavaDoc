package us.mattgreen;

/**
 * Created by mgreen14 on 12/27/17.
 */
public class Student extends Person implements Talkable {
    private int age;

    /**
     * Student Constructor:
     * @param age pass age of student
     * @param name pass name of student
     */
    public Student(int age, String name) {
        super(name);
        this.age = age;
    }

    /**
     *
     * @return age of student
     */
    public int getAge() {
        return age;
    }

    /**
     *
     * @param age of student
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Overrides talkable
     * @return what the student says
     */
    @Override
    public String talk() {
        return "Can we talk about my grade.";
    }
}
