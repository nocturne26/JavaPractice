// Chris Pope
// CIS125 Intro to Programming
// 7-7-26 Methods Mania

/* 12. This one little bit of code took me 5 very sleep deprived hours to figure out. 
Switch is definitely an in interesting code to work with. I just couldn't
figure out how to use the expression right. If i could have figured out
the syntax and how set up the return if statement to actually end the code,
I would have been done hours ago.

Other than that, my other big struggle was figuring out what went into the 
method vs main. Keeping UI and business separate, and then assigning the return
on the main were steps that held me up. Another difficult step was figuring
out how to assign the species to its base rate. I initially attempted an if 
statement, but couldn't quite get that to work, then I tried using switch
as a statement, and kept getting syntax errors, so I tried switching it over
to the expression, but didn't get that one right either. Lots of back and forth, 
I think I finally have it where I need it to be. 

Test Data:
1. "dog", 8, true = 
2. "horse", 10, false = "Invalid Species"

-----------

11. 
This code assignment was much easier than the first one I did. I 
really focused on what I needed to break down and what questions
I needed to ask. I have learned that I really do like the switch 
expressions. It's so clean and easy to just switch one to the other
and definitely eliminates the need for deep if/else statements in 
the uses I've had for it so far.

Test Data:
1. 8, 1500, "warrior", false = true = Level Up! Congratulations!
2. 2, 1354, "Mage", true = true = Level Up! Congratulations!
3. 3, 100, "rOGUE", false = false = Try again next time!
4. 10, 2000, "togue", true = Enter valid class

------------

10.
This was definitely easier than the last two. The problem solving was really simple. My first 
thought was switch, because I really like those, but if else statements proved easier and simple 
here. I'm a big football fan (Huskers of course because I'm from Nebraska), so this was a fun 
method to write.

Test Data:
1:	0, 0, 0, 0, 0	    No Data
2:	30, 35, 420, 4,	0	Pro Bowl
3:	22,	30,	240, 2,	1	Starter
4:	15, 30, 160, 1, 2	Backup
5:	8, 25, 75, 0, 3	    Benched
-------------
*/

package Course;

public class Pope_Methods_Mania {

    public static double calculatePremium(String species, int ageYears, boolean hasPreExisting) {
        final double PREEXISTING_SURCHARGE = 15.0;
        final double AGE_SURCHARGE = 0.1;
        final int AGE_THRESHOLD = 5;
        double totalAgeSurcharge = 0.0;
        double estMonthlyPremium = 0.0;
        double baseRate = switch (species.toLowerCase()) {
            case "dog" -> 30.0;
            case "cat" -> 20.0;
            case "bird" -> 10.0;
            default -> -1.0;
        };

        if (baseRate == -1.0) {
            return -1.0;
        }

        estMonthlyPremium = baseRate;

        if (ageYears > AGE_THRESHOLD) {
            totalAgeSurcharge = (((ageYears - AGE_THRESHOLD) * AGE_SURCHARGE) * baseRate);
            estMonthlyPremium = baseRate + totalAgeSurcharge;
        }

        if (hasPreExisting) {
            estMonthlyPremium = baseRate + totalAgeSurcharge + PREEXISTING_SURCHARGE;
        }
        return estMonthlyPremium;
    }

    public static boolean canLevelUp(int currentLevel, int xp, String characterClass, boolean hasQuestBonus) {
        int xpThreshold = 0;
        double questMultiplier = 0.8;

        int xpMultiplier = switch (characterClass.toLowerCase()) {
            case "warrior" -> 150;
            case "mage" -> 120;
            case "rogue" -> 100;
            default -> -1;
        };

        if (xpMultiplier == -1) {
            return false;
        }

        xpThreshold = currentLevel * xpMultiplier;

        if (hasQuestBonus) {
            xpThreshold *= questMultiplier;
        }

        if (xp >= xpThreshold) {
            return true;
        } else {
            return false;
        }
    }

    public static String getPasserRating(int completions, int attempts, int yards, int touchdowns, int interceptions) {
        final int PRO_BOWL = 100;
        final int STARTER = 75;
        final int BACKUP = 50;
        final int PERCENT_MULTIPLIER = 100;
        final int TD_BONUS = 4;
        final int TURNOVER_PENALTY = 4;
        double rating = 0;

        if (attempts == 0) {
            return "No Data";
        }

        rating = (((double) completions / attempts) * PERCENT_MULTIPLIER) + ((double) yards / attempts)
                + (touchdowns * TD_BONUS)
                - (interceptions * TURNOVER_PENALTY);

        if (rating >= PRO_BOWL) {
            return "Pro Bowl";
        } else if (rating >= STARTER) {
            return "Starter";
        } else if (rating >= BACKUP) {
            return "Backup";
        } else {
            return "Benched";
        }
    }

    public static void main(String[] args) {

//HARD - 12. Pet Insurance Premium Estimator
        //Call #1
        double estMonthlyPremium1 = calculatePremium("dog", 8, true);
        if (estMonthlyPremium1 == -1.0) {
            System.out.println("Pet Insurance Premium");
            System.out.println("Call #1:");
            System.out.println("Invalid Species. Please try again!");
        } else {
            System.out.println("Pet Insurance Premium");
            System.out.println("Call #1:");
            System.out.println("Your estimated monthly premium is: $" + estMonthlyPremium1 + ".");
        }

        System.out.println();

        //Call #2
        double estMonthlyPremium2 = calculatePremium("horse", 10, false);
        if (estMonthlyPremium2 == -1.0) {
            System.out.println("Call #2:");
            System.out.println("Invalid Species. Please try again!");
        } else {
            System.out.println("Call #2:");
            System.out.println("Your estimated monthly premium is: $" + estMonthlyPremium2 + ".");
        }

        System.out.println();
    


// HARD - 11. RPG Character Level-Up Eligibility
        
        //Call #1
        boolean levelUp1 = canLevelUp(3, 100, "rOGUE", false);
        if (levelUp1) {
            System.out.println("RPG Character Level-Up");
            System.out.println("Call #1:");
            System.out.println("Level Up! Congratulations!");
        } else {
            System.out.println("RPG Character Level-Up");
            System.out.println("Call #1:");
            System.out.println("Try again next time!");
        }

        System.out.println();

        //Call #2
        boolean levelUp2 = canLevelUp(8, 1500, "warrior", false);
        if (levelUp2) {
            System.out.println("Call #2:");
            System.out.println("Level Up! Congratulations!");
        } else {
            System.out.println("Call #2:");
            System.out.println("Try again next time!");
        }
        
        System.out.println();


// HARD - 10. Football Passer Rating Category

        // Call #1
        String performanceCategory1 = getPasserRating(0, 0, 0, 0, 0);
        if (performanceCategory1.equals("No Data")) {
            System.out.println("Football Passer Rating Category");
            System.out.println("Call #1:");
            System.out.println("Insufficient data to calculate a performance tier.");
        } else {
            System.out.println("Football Passer Rating Category");
            System.out.println("Call #1:");
            System.out.println("Your football performance tier level is " + performanceCategory1 + ".");
        }

        System.out.println();

        // Call #2
        String performanceCategory2 = getPasserRating(30, 35, 420, 4, 0);
        if (performanceCategory2.equals("No Data")) {
            System.out.println("Call #2:");
            System.out.println("Insufficient data to calculate a performance tier.");
        } else {
            System.out.println("Call #2:");
            System.out.println("Your football performance tier level is " + performanceCategory2 + ".");
        }
    }
}