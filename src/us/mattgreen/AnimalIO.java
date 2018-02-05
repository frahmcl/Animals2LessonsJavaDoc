package us.mattgreen;

import java.util.Scanner;

import static java.lang.System.*;

public class AnimalIO {
    public static Scanner keyboard = new Scanner(System.in);
    public AnimalIO(){

    }

    /**
     *  depending on if it is a cat or dog it returns the talkable selected
     * @return pet which is either cat or dog
     * @throws Exception
     */
    public Talkable getAnimal() throws Exception {
        String ans;
        Talkable pet = null;
        do {
            out.println("Do you want to enter a (C)at or (D)og? or (E)xit");
            ans = keyboard.nextLine();
            if ((ans != null) && ans.toUpperCase().charAt(0) == 'C'){
                pet = createCat();
            }
            else if ( ans.toUpperCase().charAt(0) == 'D'){
                pet = createDog();
            }
            else if ( ans.toUpperCase().charAt(0) == 'E'){
               throw new Exception ("Out of Input.");
            } else {
                out.println("Invalid Animal Type.");
            }
        } while ((ans.toUpperCase().charAt(0) != 'C') && (ans.toUpperCase().charAt(0) != 'D'));
        return pet;
    }

    /**
     * method to create a new dog object
     * @return dog object
     */
    private Talkable createDog() {
        String name = inputName();
        String ans;
        boolean friendly = true;
        do {
            out.println("Is the dog friendly (Y)es or (N)o? ");
            ans = keyboard.nextLine();
            if ((ans != null) && ans.toUpperCase().charAt(0) == 'Y'){
                friendly = true;
            }
            else if ( ans.toUpperCase().charAt(0) == 'N'){
                friendly = false;
            } else {
                out.println("Invalid Friendly Type.");
            }
        }while ((ans != null) && (ans.toUpperCase().charAt(0) != 'Y') && (ans.toUpperCase().charAt(0) != 'N'));
        return new Dog(friendly, name);
    }

    /**
     * method to create new cat object
     * @return cat object
     */
    private Talkable createCat() {
        String name = inputName();
        String ans;

        int miceKilled =0;
        boolean miceNumeric = false;
        while(!miceNumeric) {
            out.println("Please enter number of mice killed: ");
            ans = keyboard.nextLine();
            try {
                miceKilled = Integer.parseInt(ans);
                miceNumeric = true;

            } catch (NumberFormatException e){
                out.println(ans + "is not a number.");
            }catch (Exception e)
            {
                out.println("Bad number format.");
            }
        }
        return new Cat(miceKilled, name);
    }

    /**
     * method to name pet, works for either cat or dog
     * @return ans, which will be the pets name
     */
    private String inputName() {
        String ans;
        do {
            System.out.println("Please Enter your Pet's name:  ");
            ans = keyboard.nextLine();
            if ((ans != null) && (ans.length() < 1)){
                out.println("Pet name must be at least a Character or more.");
            }
        } while (ans != null && ans.length() < 1);
        return ans;
    }
}
