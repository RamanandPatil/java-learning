package a.basics.a.variables.scope;

/**
 * Class to demo Instance Variables and their scope:
 * <ul><li><strong>Instance Variables (Non-Static Fields)</strong> Technically
 * speaking, objects store their individual states in "non-static fields", that
 * is, fields declared without the <code>static</code> keyword. Non-static
 * fields are also known as <i>instance variables</i> because their values are
 * unique to each <i>instance</i> of a class (to each object, in other words);
 * the <code>currentSpeed</code> of one bicycle is independent from the
 * <code>currentSpeed</code> of another.</li></ul>
 */
public class InstanceVariables {
    // Private scope means, this variable can be accesses anywhere within the
    // class. (Any method, any block of code) but not outside the class.
    private String privateInstanceVariable = "privateInstanceVariable";
    String defaultInstanceVariable = "defaultInstanceVariable";
    public String publicInstanceVariable = "publicInstanceVariable";

    public static void main(String[] args) {
        System.out.println("\nInstanceVariables.main():");
        InstanceVariables instance1 = new InstanceVariables();
        System.out.println(instance1.privateInstanceVariable);
        System.out.println(instance1.publicInstanceVariable);
        System.out.println(instance1.defaultInstanceVariable);

        // Modify privateInstanceVariable for testing in anotherStaticMethod
        instance1.privateInstanceVariable += "+main";
        System.out.println(instance1.privateInstanceVariable);
        anotherStaticMethod();
    }

    private static void anotherStaticMethod() {
        System.out.println("\nInstanceVariables.anotherStaticMethod():");
        InstanceVariables instance1 = new InstanceVariables();
        System.out.println(instance1.privateInstanceVariable);
        System.out.println(instance1.publicInstanceVariable);
        System.out.println(instance1.defaultInstanceVariable);
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
    }

    private void instanceMethod() {
        System.out.println("\nInstanceVariables.instanceMethod():");
        System.out.println(privateInstanceVariable);
        System.out.println(publicInstanceVariable);
        System.out.println(defaultInstanceVariable);
        // Modify privateInstanceVariable for testing in anotherInstanceMethod
        privateInstanceVariable += "+instanceMethod";
        System.out.println(privateInstanceVariable);

        anotherInstanceMethod();
    }

    private void anotherInstanceMethod() {
        System.out.println("\nInstanceVariables.anotherInstanceMethod():");
        System.out.println(privateInstanceVariable);
        System.out.println(publicInstanceVariable);
        System.out.println(defaultInstanceVariable);
    }

}
