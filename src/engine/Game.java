package engine;

import model.characters.*;
import model.world.Cell;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class Game {
    public static ArrayList<Hero> availableHeroes;
    public static ArrayList<Hero> heroes;
    public static ArrayList<Zombie> zombies;
    public static Cell[][] map;

    public static void loadHeroes(String path) throws FileNotFoundException {
        File file = new File(path);

        Scanner fileReader = new Scanner(file);

        while(fileReader.hasNext()){
            String line = fileReader.nextLine(); // read line
            String[] data = line.split(","); // split line by comma
            String name = data[0];
            String type = data[1];
            int maxHp = Integer.parseInt(data[2]);
            int maxActions = Integer.parseInt(data[3]);
            int attackDmg = Integer.parseInt(data[4]);
            
            Hero hero;
            switch (type) {
                case "FIGH":
                    hero = new Fighter(name, maxHp, attackDmg, maxActions);
                    break;
                case "EXP":
                    hero = new Explorer(name, maxHp, attackDmg, maxActions);
                    break;
                case "MED":
                    hero = new Medic(name, maxHp, attackDmg, maxActions);
                    break;
                default:
                    throw new IllegalStateException("Unexpected value: " + type);
            }
            availableHeroes.add(hero);

        }
    }

}
