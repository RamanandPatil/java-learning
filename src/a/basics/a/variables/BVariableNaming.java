package a.basics.a.variables;

/**
 * Class to demonstrate the variable naming conventions: As per the
 * <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/variables.html">
 * official Java tutorial document</a>:
 * <ul>
 * <li>Variable names are case-sensitive. A variable's name can be any legal
 * identifier — an unlimited-length sequence of Unicode letters and digits,
 * beginning with a letter, the dollar sign "<code>$</code>", or the
 * underscore character "<code>_</code>". The convention, however, is to
 * always begin your variable names with a letter, not "<code>$</code>" or
 * "<code>_</code>". Additionally, the dollar sign character, by convention,
 * is never used at all. You may find some situations where auto-generated
 * names will contain the dollar sign, but your variable names should always
 * avoid using it. A similar convention exists for the underscore character;
 * while it's technically legal to begin your variable's name with
 * "<code>_</code>", this practice is discouraged. White space is not
 * permitted.</li>
 * <li>Subsequent characters may be letters, digits, dollar signs, or
 * underscore characters. Conventions (and common sense) apply to this rule
 * as well. When choosing a name for your variables, use full words instead
 * of cryptic abbreviations. Doing so will make your code easier to read and
 * understand. In many cases it will also make your code self-documenting;
 * fields named <code>cadence</code>, <code>speed</code>, and
 * <code>gear</code>, for example, are much more intuitive than abbreviated
 * versions, such as <code>s</code>, <code>c</code>, and <code>g</code>. Also
 * keep in mind that the name you choose must not be a
 * <a href="https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html">
 * keyword or reserved word</a>.</li>
 * <li>If the name you choose consists of only one word, spell that word in
 * all lowercase letters. If it consists of more than one word, capitalize
 * the first letter of each subsequent word. The names <code>gearRatio</code>
 * and <code>currentGear</code> are prime examples of this convention. If
 * your variable stores a constant value, such as <code>static final int
 * NUM_GEARS = 6</code>, the convention changes slightly, capitalizing every
 * letter and separating subsequent words with the underscore character. By
 * convention, the underscore character is never used elsewhere.</li>
 * </ul>
 */
public class BVariableNaming {
    public static void main(String[] args) {

        // Examples of valid Variable names:
        int myvar;
        int myVar;
        int MYVAR;
        int _myVar;
        int $myVar;
        int myVar1;
        int myVar_1;

        // Examples of invalid Variable names:

    }
}
