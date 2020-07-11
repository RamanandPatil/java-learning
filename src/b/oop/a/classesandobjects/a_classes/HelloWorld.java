package b.oop.a.classesandobjects.a_classes;

/**
 * <h1><a href="https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html">
 * Classes</a></h1>
 * <p>This class shows Java's basic and simplest program which prints "Hello
 * World!" to the console. Lets go line by line and word by word to understand
 * this basic class structure.</p><br />
 * Consider first line: <code>"public class HelloWorld"</code><br />
 * <ul>
 * <li><code>public</code>: This is a java reserved keyword called
 * <strong>access level modifier</strong> or <strong>access modifier</strong> or
 * <strong>access specifier</strong>.<br /><br />
 * <p>Classes can have below Access level modifiers:
 * <ul>
 * <li>At the top level(inside a file, like the below)<code>: public</code>,
 * or <i>package-private</i> (no explicit modifier).</li>
 * <li>At the member level(to a class inside a class)<code>: public</code>,
 * <code>private</code>,
 * <code>protected</code>, or <i>package-private</i> (no explicit modifier).
 * </li></ul></p>
 * </li>
 * <li><code>class</code>: This is another java reserved keyword. This is
 * used to declare a new class.</li>
 * <li>HelloWorld: This is a name given to the new class. You can name you
 * class anything you want, with the same naming rules as any java identifier.
 * But convention is to use CamelCasing with first letter being Capital.</li>
 * </ul>
 * <p>The first and last curly braces"{" and "}" is the class boundary,
 * everything inside it are called class members. Variables are called as
 * fields, or member variables, methods are called as member functions
 * </p>
 */
public class HelloWorld {
    // This is a field, or class variable or static variable.
    private static String greetings = "Hello World!";

    /**
     * This is a special method called constructor, which has same name as class
     * and doesn't have return type.
     */
    public HelloWorld() {
    }

    /**
     * This is a main method
     *
     * @param args received String array as an argument, passed from outside
     *             program.
     */
    public static void main(String[] args) {
        System.out.println(greetings);
    }
}
