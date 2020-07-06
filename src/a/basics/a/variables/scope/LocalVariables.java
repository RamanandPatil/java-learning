package a.basics.a.variables.scope;

/**
 * Class to demo Local Variables and their scope:
 * <ul><li><strong>Local Variables:</strong> Similar to how an object stores its
 * state in fields, a method will often store its temporary state in <i>local
 * variables</i>. The syntax for declaring a local variable is similar to
 * declaring a field (for example, <code>int count = 0;</code>). There is no
 * special keyword designating a variable as local; that determination comes
 * entirely from the location in which the variable is declared — which is
 * between the opening and closing braces of a method. As such, local variables
 * are only visible to the methods in which they are declared; they are not
 * accessible from the rest of the class.</li></ul>
 */
public class LocalVariables {
    public static void main(String[] args) {
        // Here are 3 local variables
        String localString = "Hi";
        int localInt = 5;
        int argument = 15;

        System.out.println("localString: " + localString);
        System.out.println("localInt: " + localInt);
        System.out.println("argument: " + argument);

        // Call the method "someMethod" with String argument defined as local
        // variable
        someMethod(argument);

        // Print the argument value after the method call, which will modify
        // the passed argument
        System.out.println("argument after method call: " + argument);

        // Lets try anotherMethod with another in variable
        int intVariable = 100;
        System.out.println("\nintVariable before method call: " + intVariable);
        anotherMethod(intVariable);
        System.out.println("intVariable after method call: " + intVariable);
    }

    /**
     * Method to show local variable and parameter variable scope<br />
     * Receives int value as it's <strong>parameter</strong>, which was passed
     * as an <strong>argument</strong> from main method
     *
     * @param parameter the int argument passed from main method
     */
    public static void someMethod(int parameter) {
        // localString = "Hello";
        /* Above line will fail with below error:
        Error:(13, 9) java: cannot find symbol
                       symbol:   variable localString
                       location: class a.basics.a.variables.types.LocalVariables
         */

        // localInt = 10;
        /* This will also fail with similar error:
        Error:(20, 9) java: cannot find symbol
                       symbol:   variable localInt
                       location: class a.basics.a.variables.types.LocalVariables
         */

        // Let's try to change the parameter value and print it:
        parameter = parameter + 10;
        System.out.println("parameter: " + parameter);
    }


    /**
     * Method to demo variable local scope and pass by value.< br />
     * To understand what is pass by value here are few links:
     * <ul>
     *     <li>
     *         <a href="https://www.infoworld.com/article/3512039/does-java-pass-by-reference-or-pass-by-value.html">
     *             Does Java pass by reference or pass by value?</a>
     *     </li>
     *     <li>
     *         <a href="https://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value">
     *          Is Java “pass-by-reference” or “pass-by-value”?</a>
     *     </li>
     *     <li>
     *         <a href="https://stackoverflow.com/questions/13624462/where-does-class-object-reference-variable-get-stored-in-java-in-heap-or-in-s">
     *             Where does class, object, reference variable get stored in
     *             Java. In heap or in stack? Where is heap or stack
     *             located?</a>
     *      </li>
     *      <li>
     *          <a href="https://stackoverflow.com/questions/58434404/how-does-java-store-literals">
     *              How does java store literals?</a>
     *      </li>
     *      <li>
     *         <a href="https://docs.oracle.com/javase/specs/jvms/se11/html/jvms-2.html#jvms-2.5">
     *             JVM Spec: Run-Time Data Areas</a>
     *      </li>
     *
     * </ul>
     *
     * @param intVariable int variable passed as an argument from main method
     */
    public static void anotherMethod(int intVariable) {
        System.out.println("Received intVariable: " + intVariable);
        intVariable = 200;
        System.out.println("Modified intVariable to new value: " + intVariable);
        /*
         * Even though it looks like we are modifying the passed variable
         * intVariable, actually, this is a altogether new variable
         * (parameter type) which is declared in method definition and it
         * gets value assigned when main method(or any other method) calls it
         * with some value. It will not modify the actual passed argument
         * even though the names are same.
         * Here are the main reasons for this:
         * - intVariable scopes are completely different from main method and
         *  from anotherMethod
         * - Java is "Pass by Value": All object references in Java are
         *   passed by value. This means that a copy of the value will be
         *   passed to a method.
         */
    }
}
