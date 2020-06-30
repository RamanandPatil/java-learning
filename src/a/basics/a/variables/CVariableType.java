package a.basics.a.variables;

/**
 * Class to show different types of variables and their usage:<br /><br />
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
 * </ul>
 */
public class CVariableType {
    public static void main(String[] args) {

    }
}
