package a.basics.a.variables.scope;

/**
 * Class to demo Instance Variables and their scope:<br /><br />
 * <strong>Instance Variables (Non-Static Fields)</strong> Technically
 * speaking, objects store their individual states in "non-static fields", that
 * is, fields declared without the <code>static</code> keyword. Non-static
 * fields are also known as <i>instance variables</i> because their values are
 * unique to each <i>instance</i> of a class (to each object, in other words);
 * the <code>currentSpeed</code> of one bicycle is independent from the
 * <code>currentSpeed</code> of another.<br /><br />
 * <strong>Some important rules to remember:</strong>
 * <ul><li>
 *     Methods:
 *     <ul>
 *         <li>Instance methods cannot be called from static methods without
 *         creating an instance of the class. But the vice versa is true,
 *         i.e. static methods can be called directly from instance method
 *         without creating an instance of a class </li>
 *         <li>While calling(invoking) static or instance method from outside
 *         the class which holds them, it is required to use
 *         dot notation. To be precise, static methods should be called like
 *         ClassName.staticMethodName() and instance methods should be called
 *         by instanceName.instanceMethodName()</li>
 *         <li>While calling(invoking) static or instance method within the
 *         same class which holds them, it is not required..., but this or
 *         className can be used.
 *         this and classname are also optional</li>
 *     </ul>
 * </li>
 * <li>
 *     Variables:
 *     <ul>
 *
 *     </ul>
 * </li>
 * </ul>
 */
public class InstanceVariables {
    /*
     * Private scope means, this variable can be accesses anywhere within the
     *  class. (Any method or  block of code) but not outside the class.
     * Not accessible outside the current class:
     *  - Even if the other class is in same package or different package
     *  - Even if the class is a child class of this class
     */
    private String privateInstanceVariable = "privateInstanceVariable";

    /*
     * Public scope means, this variable can be accesses from anywhere in the
     *  program or project or module. (Any class, method, or block of code)
     * Accessible to all classes:
     *  - Even if the other class is in same package or different package
     *  - Even if the class is a child class of this class
     */
    public String publicInstanceVariable = "publicInstanceVariable";

    /*
     * Default or package-private scope (without any access modifier) means,
     * this variable can be accesses from anywhere in the current class and
     * any class in the same package.(Any class, method, or block of code in
     * the current package only).
     * Not accessible outside package:
     *  - Even if the class is a child class of this class
     *  - Even if the other class is in sub-package
     */
    String defaultInstanceVariable = "defaultInstanceVariable";

    /*
     * Protected scope means, this variable can be accessed from anywhere in
     * the current class and current package but not accessible to any other
     * class in different package if it is not a child class.
     * Accessible only in the current package and its subclasses, i.e.:
     * - Classes in the current package
     * - Classes in the different package only if the class is subclass
     *   of current class
     */
    protected String protectedInstanceVariable = "protectedInstanceVariable";

    /**
     * @param args the passed input string array argument
     */
    public static void main(String[] args) {
        System.out.println("\nInstanceVariables.main():");
        InstanceVariables instance1 = new InstanceVariables();
        System.out.println(instance1.privateInstanceVariable);
        System.out.println(instance1.publicInstanceVariable);
        System.out.println(instance1.defaultInstanceVariable);
        System.out.println(instance1.protectedInstanceVariable);

        // Modify publicInstanceVariable for testing in anotherStaticMethod
        instance1.publicInstanceVariable += "+main";
        System.out.println(instance1.publicInstanceVariable);
        anotherStaticMethod();
    }

    /**
     *
     */
    private static void anotherStaticMethod() {
        System.out.println("\nInstanceVariables.anotherStaticMethod():");
        InstanceVariables instance1 = new InstanceVariables();
        System.out.println(instance1.privateInstanceVariable);
        System.out.println(instance1.publicInstanceVariable);
        System.out.println(instance1.defaultInstanceVariable);
        System.out.println(instance1.protectedInstanceVariable);
        /*
         * Even though the main method has modified the
         * privateInstanceVariable, you can see that it is not changed in
         * anotherStaticMethod. This is because of:
         * - instance1 from main method and instance1 from anotherStaticMethod
         *   are completely different(remember the local scope). And hence
         *   the fields/variables associated with them are different. i.e.
         *   They each have their own copy of all instance variables.
         */
        instance1.instanceMethod();
        System.out.println(instance1.publicInstanceVariable);

    }

    /**
     * Notice that I have used variable names without any instance name
     * with it, this means: they belong to current instance, on which the
     * method is called, which is "instance1" from anotherStaticMethod above.
     */
    private void instanceMethod() {
        System.out.println("\nInstanceVariables.instanceMethod():");
        System.out.println(privateInstanceVariable);
        System.out.println(publicInstanceVariable);
        System.out.println(defaultInstanceVariable);
        System.out.println(protectedInstanceVariable);
        // Modify publicInstanceVariable for testing in anotherInstanceMethod
        publicInstanceVariable += "+instanceMethod";
        System.out.println(publicInstanceVariable);
        // anotherInstanceMethod();
    }

    /**
     * Method to how instance variables are affected if they belong to the same
     * instance, even though the actual instance is not in the scope of this
     * method.
     */
    private void anotherInstanceMethod() {
        System.out.println("\nInstanceVariables.anotherInstanceMethod():");
        System.out.println(privateInstanceVariable);
        System.out.println(publicInstanceVariable);
        System.out.println(defaultInstanceVariable);
        System.out.println(protectedInstanceVariable);
    }

}
