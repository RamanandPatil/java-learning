package a.basics.a.variables;

/**
 * Class to show different types of variables and their usage rules:<br /><br />
 * <em><b>Advanced Concept:</b></em><br />
 * The Java programming language defines the following kinds of variables:<br />
 * <ul>
 * <li><strong>Instance Variables (Non-Static Fields)</strong> Technically
 * speaking, objects store their individual states in "non-static fields",
 * that is, fields declared without the <code>static</code> keyword.
 * Non-static fields are also known as <i>instance variables</i> because
 * their values are unique to each <i>instance</i> of a class (to each
 * object, in other words); the <code>currentSpeed</code> of one bicycle is
 * independent from the <code>currentSpeed</code> of another.</li>
 * <li><strong>Class Variables (Static Fields)</strong> A <i>class
 * variable</i> is any field declared with the <code>static</code> modifier;
 * this tells the compiler that there is exactly one copy of this variable in
 * existence, regardless of how many times the class has been instantiated. A
 * field defining the number of gears for a particular kind of bicycle could
 * be marked as <code>static</code> since conceptually the same number of
 * gears will apply to all instances. The code <code>static int numGears = 6;
 * </code> would create such a static field. Additionally, the keyword
 * <code>final</code> could be added to indicate that the number of gears
 * will never change.</li>
 * <li><strong>Local Variables</strong> Similar to how an object stores its
 * state in fields, a method will often store its temporary state in <i>local
 * variables</i>. The syntax for declaring a local variable is similar to
 * declaring a field (for example, <code>int count = 0;</code>). There is no
 * special keyword designating a variable as local; that determination comes
 * entirely from the location in which the variable is declared — which is
 * between the opening and closing braces of a method. As such, local
 * variables are only visible to the methods in which they are declared; they
 * are not accessible from the rest of the class.</li>
 * <li><strong>Parameters</strong> You've already seen examples of
 * parameters, both in the <code>Bicycle</code> class and in the
 * <code>main</code> method of the "Hello World!" application. Recall that
 * the signature for the <code>main</code> method is <code>public static void
 * main(String[] args)</code>. Here, the <code>args</code> variable is the
 * parameter to this method. The important thing to remember is that
 * parameters are always classified as "variables" not "fields". This applies
 * to other parameter-accepting constructs as well (such as constructors and
 * exception handlers) that you'll learn about later in the tutorial.</li>
 * </ul
 */
public class VariableType {
    // This is an instance variable or non-static variable or a field
    int instanceVariable;

    // This is a static variable or class variable or a field
    static int staticVariable;

    /**
     * This is a main method, starting point of the java program execution.
     *
     * @param args This is a "parameter" type of the variable, which is also
     *             local to main method
     */
    public static void main(String[] args) { // args is a parameter
        // This is a local variable defined in a method (code block with {})
        int localVariable;

        // Let us try to print all the variables:


        // 1. Instance variable:

        // System.out.println(instanceVariable);

        /*
         * Above print will give a compilation error:
         * Error:(63, 28) java: non-static variable instanceVariable cannot
         * be referenced from a static context
         *
         * The instance variable can be only access via a class instance(object)
         * like below:
         */
        VariableType classInstance = new VariableType();
        System.out
                .println("instanceVariable: " + classInstance.instanceVariable);
        /* Observe the statement:
         * VariableType classInstance = new VariableType();
         * This is similar to "int intVariable = 10"
         * Remember the format: dataType variableName = dataTypeValue
         * Here dataType is VariableType, variableName is classInstance and
         * dataTypeValue is new VariableType().
         * new keyword is used to create a new instance of the class in a memory
         *
         * This will print 0 to the console as it is an instance variable of
         * type int.
         */


        // 2. Static variable:

        System.out.println("staticVariable: " + staticVariable);
        /*
         * The above line will compile and run successfully, as it is static
         * and will print 0 to console as it is int type.
         */


        // 3. Local variable:

        // System.out.println("localVariable: " + localVariable);
        /*
         * The above line will give compile time error:
         * Error:(102, 48) java: variable localVariable might not have been
         * initialized
         * Important Note: Local variable cannot be used before they are
         * initialized first The reason is:
         *  - They won't get default values like instance and static variables.
         *  And reason for not getting default value is:
         *  - They are kind of temporary and local to method(local scope)
         * Other points about local variables:
         *  - They resides on stack memory(not on heap, like instance variables)
         *  - They will stay in memory only while the method is executing
         *  - There is no use of local variables outside the method, hence it
         *    doesn't make any sense to keep it uninitialized.
         * As such, local variables are only visible to the methods in which
         * they are declared; they are not accessible from the rest of the
         * class.
         * Read more about this here: https://bit.ly/3glPu1L
         *
         * So, let us initialize and use the local variable now:
         */
        localVariable = 7;
        System.out.println("localVariable: " + localVariable);


        // 4. Parameter:
        System.out.println("parameter: " + args);
        /*
         * The above line will compile and run successfully.
         * It will print something like "[Ljava.lang.String;@6108b2d7" to
         * console as it is of type String Array.
         */
    }
}
