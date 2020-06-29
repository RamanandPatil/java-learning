package a.basics.a.variables;

/**
 * Class Demonstrating the Java variables: How to declare, initialize, update
 * and use in the calculations.
 */
public class Variables {
    public static void main(String[] args) {
        // Variable declaration
        // Format:
        //      Type variableName;
        int variable1;

        // Variable initialization
        // Format:
        //      variableName = variableValue;
        variable1 = 10;

        // Variable modification
        // Format(same as initialization):
        //      variableName = newVariableValue;
        variable1 = 20;

        // We can use variable itself in the right side:
        variable1 = variable1 + 30; // variable1 is now updated to 20 + 30 = 50

        // We can club declaration and initialization in one line itself:
        int variable2 = 15;

        // Calculations using variables:
        int sum = variable1 + variable2;

        // Print the values of all variables
        System.out.println("variable1: " + variable1);
        System.out.println("variable2: " + variable2);
        System.out.println("Sum: " + sum);


        // New way to declare variables from JDK-11:
        var variable3 = 100;
        var variable4 = "Hello";

        // While using "var" declaration and initialization both are must
        // unlike using the type format.
        // Below will give the compilation error:
        /*
        var variable5;
        variable5 = 5;

        This gives below error:
        Error:(47, 13) java: cannot infer type for local variable variable5
  (cannot use 'var' on variable without initializer)
         */

    }
}
