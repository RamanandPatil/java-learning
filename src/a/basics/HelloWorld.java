package a.basics;

/**
 * Hello World class
 */
public class HelloWorld {

    // This is a single line comment, which will be ignored by java compiler.

    /* This is a multiline comments, which will also be ignored by Java
    compiler. It starts with forwards slash(/) star(*) and ends with star(*)
    forward slash(/).*/

    /* Below is a Javadoc comment, used to describe the details of the code
     * blocks following it. This is used while generating JavaDocs html pages.
     */

    /**
     * Main method of the program. Starting point of the Java Application.
     *
     * @param args arguments passed to the main method
     */
    public static void main(String[] args) {
        // This will print "Hello World!" on the console
        System.out.println("Hello World!");
        // System: Class
        // out: Instance or Object of PrintStream class
        // println: method of PrintStream class (method of "out" instance)
        // "Hello World!": String literal

        // This will print 4
        System.out.println(2 + 2);

        /*
         * Guess what this will print?
         * Remember - "BODMAS": (Bracket, Of, Division, Multiplication,
         * Addition and Subtraction)
         * OR - "PEMDAS": (Parentheses, Exponents, Multiplication, Division,
         * Addition and Subtraction)
         */

        System.out.println(10 + 4 * 25 / 5 * 5 - 10);
        // Prints 10 + (4 * (25 / 5) * 5) - 10)  =  10 + (4 * 5 * 5) - 10  =
        // 10 + 100 - 10  =  100

        System.out.println(2 + 3.143); // Prints 5.143
        System.out.println(55.85 - 33.63); // Prints 22.22
    }
}
