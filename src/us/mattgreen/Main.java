package us.mattgreen;

import java.util.ArrayList;
import java.io.IOException;

/**
 * creates a loop to capture how many talkables the user wants to create and stores them in a txt
 * document
 */
public class Main {

    private final static FileOutput outFile = new FileOutput("animals.txt");
    private final static FileInput inFile = new FileInput("animals.txt");
    public static void main(String[] args) {

        ArrayList<Talkable> zoo = new ArrayList<>();

        boolean addAnotherAnimal=true;
        AnimalIO input = new AnimalIO();
        do {
            try {
                zoo.add(input.getAnimal());
            }

            catch (Exception e){
                System.out.println(e.getMessage());
                addAnotherAnimal=false;
        }
        } while (addAnotherAnimal);

        for (Talkable thing: zoo) {
            printOut(thing);
        }
        outFile.fileClose();
        inFile.fileRead();
        inFile.fileClose();
        FileInput indata = new FileInput("animals.txt");
        String line;
        while ((line = indata.fileReadLine()) != null) {
            System.out.println(line);
        }
        indata.fileClose();
    }

    public static void printOut(Talkable p)  {
        System.out.println(p.getName() + " says=" + p.talk());
        outFile.fileWrite(p.getName() + "|" + p.talk());
    }
}
