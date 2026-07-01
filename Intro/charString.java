package Intro;

public class charString {
    public static void main(String[] args) {
        System.out.println("\nCharacter and String Examples");
        String quote = "To be or not to be";
        String quoteUpperCase = "";

        System.out.println("Length: " + quote.length());
        System.out.println("Char at Pos: " + quote.charAt(11));
        System.out.println("Uppercase: " + quote.toUpperCase());

        quoteUpperCase = quote.toUpperCase();
        System.out.println("Equals " + quote.equals(quoteUpperCase));

        //To display an ASCII decimal number as a character, using
        int decimalNumber = 65;
        char asciiChar = (char) decimalNumber; //cast the decimal to a char
        System.out.println(asciiChar);

        //To display a Unicode symbol as a character use '\u9999'; where the 9999 is the Unicode value
        char ch = '\u0041'; // Unicode for 'A'
        System.out.println(ch);

        //To display a Unicode symbol in hexadecimal
        int hexValue = 0X1F606;
        String symbol = new String(Character.toChars(hexValue));
        System.out.println(symbol);

        for (int num = 33; num <= 125; num ++) {
            System.out.println("ASCII Num: " + num + " Character: " + (char)(num));
        }
        
        //String name = "chris";

        //boolean result = name.equalsIgnoreCase("chris");
        //int result = name.length(); //gives the length of the string
        //char result = name.charAt(0); //gives the character at () location
        //int result = name.indexOf("B"); //finds capital B or any other character or string
        //boolean result = name.isEmpty(); //true if string is empty. ex String name = ""
        //String result = name.toUpperCase(); //changes entire string to uppercase
        //String result = name.toLowerCase(); //changes entire string to lowercase
        //String result = name.trim(); //Removes spaces around string
        //String result = name.replace("o", "a"); //Replaces a character or string with...

        //System.out.println(result);
    }
}