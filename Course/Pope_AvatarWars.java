// Chris Pope
// CIS125 Intro to Programming Logic
// 7-8-26 Avatar Wars

package Course;

import java.util.Random;
import java.util.Scanner;

public class Pope_AvatarWars {

    public static int getAvatarChoice(Scanner scnr) {
        int avatarType = 0;
        System.out.println("Enter you choice of Avatar");
        System.out.println("1. Warrior");
        System.out.println("2. Mage");
        avatarType = scnr.nextInt();
        scnr.nextLine(); // captures the end of line character left on the stack
        return avatarType;
    }

    public static String getMagicType(Scanner scnr) {
        System.out.println("Enter magic type (fire/ice/earth)");
        String magicType = scnr.next();
        scnr.nextLine();

        return magicType;
    }

    public static int setPowerLevel(String magicType, Random random) {
        int powerLevel = 0;
        final int MIN1 = 50;
        final int MAX1 = 100;
        final int MIN2 = 20;
        final int MAX2 = 70;

        if (magicType.equalsIgnoreCase("fire")) {
            powerLevel = random.nextInt(MAX1 - MIN1 + 1) + MIN1;
        } else if (magicType.equalsIgnoreCase("ice")) {
            powerLevel = random.nextInt(MAX2 - MIN2 + 1) + MIN2;
        } else if (magicType.equalsIgnoreCase("earth")) {
            powerLevel = random.nextInt(MAX2 - MIN2 + 1) + MIN2;
        }
        return powerLevel;
    }

    public static int getRandomStat(Random random) {
        int num = random.nextInt(10) + 1;
        return num;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Avatar Wars");
        
        Random random = new Random();
        Scanner scnr = new Scanner(System.in);

        int avatarChoice = getAvatarChoice(scnr);


        if ((avatarChoice < 1) || (avatarChoice > 2)) {
            System.out.println("Please enter a valid choice");
        } else if (avatarChoice == 1) {
            int strength = getRandomStat(random);
            int defense = getRandomStat(random);
            
            if ((strength > 7) && (defense > 7)) {
                System.out.println("You are Jedi trained.");
            } else if ((strength > 5) || (defense > 5)) {
                System.out.println("You are quite capable and eligible to join the Jedi training.");
            } else {
                System.out.println("You are a NOVICE. Keep training.");
            }
        } else {
            String magicType = getMagicType(scnr);
            int powerLevel = setPowerLevel(magicType, random);

            if (magicType.equalsIgnoreCase("fire")) {
                System.out.println("Your power level for fire is " + powerLevel + " kilodyne.");
            } else if (magicType.equalsIgnoreCase("ice")) {
                System.out.println("Your power level for ice is " + powerLevel + " kilodyne.");
            } else if (magicType.equalsIgnoreCase("earth")) {
                System.out.println("Your power level for earth is " + powerLevel + " kilodyne.");
            }
        }
        scnr.close();
    }

} 
