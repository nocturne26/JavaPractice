// Chris Pope
// CIS125 Intro to Programming
// 7-7-26 Methods Mania


/* This one little bit of code took me 5 hours to figure out. Switch
is definitely an in interesting code to work with. I just couldn't
figure out how to use the expression right. If i could have figured out
the syntax and how set up the return if statement to actually end the code,
I would have been done hours ago.

Other than that, my other big struggle was figuring out what went into the 
method vs main. Keeping UI and business separate, and then assigning the return
on the main, were steps that held me up. Another difficult step was figuring
out how to assign the species to its base rate. I initially attempted an if 
statement, but couldn't quite get that to work, then I tried using switch
as a statement, and kept getting syntax errors, so I tried switching it over
to the expression, but didn't get that one right either. 

Lots of back and forth, I think I finally have it where I need it to be. 
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

    public static void main(String[] args) {

        String species = "dog";
        int ageYears = 4;
        boolean hasPreExisting = true;

        double estMonthlyPremium = calculatePremium(species, ageYears, hasPreExisting);

        if (estMonthlyPremium == -1.0) {
            System.out.println("Invalid Species");
        } else {
             System.out.println("Your estimated monthly premium is: $" + estMonthlyPremium);
        }
    }
}