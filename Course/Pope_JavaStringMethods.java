//Chris Pope
//CIS125 - Intro to Programming
// 6-30-2026 Java String Methods

package Course;

public class Pope_JavaStringMethods {
    
    public static void main(String[] args) {
    
    String name = "Chris";
    String petName = "Tater";
    
    System.out.println("Hi there! My name is " + name + "!");
    System.out.println("I have a dog named " + petName + ".");
    System.out.println("Sometimes I say his name really quiet like " + petName.toLowerCase() + ".");
    System.out.println("But sometimes, I have to say his name really loud like " + petName.toUpperCase() + ".");
    System.out.println("Some people spell it differently like " + petName.replace("e", "o") + ".");
    System.out.println("His name is " + petName.length() + " letters long.");
    System.out.println("And lastly, his name starts with " + petName.charAt(0) + "!");
    
    /*
    What other data types besides String did you use and why?
    - I only used String because the story I was telling didn't require more than that.

    What did you like about this assignment?
    - Any chance I can talk about my dog is a good time for me.  Also, it's really cool
    how I can modify the string without having to reassign it.

    What did you struggle with?
    - As far as the String methods? Not really much, just having to remember what needs to be
    entered and making sure all of the "", +, and ; are in appropriate places. It takes longer
    to keep finding the +. Otherwise, yes I know this is late and I won't get points for it, but
    I still had fun doing it.
 */
    }    
}