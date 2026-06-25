 class OperatorsDemo {

    public static void main(String[] args) {

        // -------------------------------
        // ASSIGNMENT OPERATORS
        // -------------------------------

        int a = 10;   // Assign 10 to variable a
        int b = 5;    // Assign 5 to variable b

        System.out.println("Initial Values");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // += means a = a + value
        a += 5;                 // a = 10 + 5 = 15
        System.out.println("\na += 5  -> " + a);

        // -= means b = b - value
        b -= 2;                 // b = 5 - 2 = 3
        System.out.println("b -= 2  -> " + b);

        // *= means a = a * value
        a *= 2;                 // a = 15 * 2 = 30
        System.out.println("a *= 2  -> " + a);

        // /= means a = a / value
        a /= 5;                 // a = 30 / 5 = 6
        System.out.println("a /= 5  -> " + a);

        // %= means remainder after division
        a %= 4;                 // a = 6 % 4 = 2
        System.out.println("a %= 4  -> " + a);



        // Reset values for comparison examples
        a = 20;
        b = 10;

        System.out.println("\nAfter Reset");
        System.out.println("a = " + a);
        System.out.println("b = " + b);



        // -------------------------------
        // RELATIONAL OPERATORS
        // These operators ALWAYS return boolean
        // -------------------------------

        System.out.println("\nRelational Operators");

        // Checks whether values are equal
        System.out.println("a == b : " + (a == b));      // false

        // Checks whether values are not equal
        System.out.println("a != b : " + (a != b));      // true

        // Greater than
        System.out.println("a > b  : " + (a > b));       // true

        // Less than
        System.out.println("a < b  : " + (a < b));       // false

        // Greater than or equal
        System.out.println("a >= b : " + (a >= b));      // true

        // Less than or equal
        System.out.println("a <= b : " + (a <= b));      // false



        // -------------------------------
        // LOGICAL OPERATORS
        // Work only with boolean values
        // -------------------------------

        boolean isStudent = true;
        boolean hasID = false;

        System.out.println("\nLogical Operators");

        // AND (&&)
        // Returns true only if BOTH conditions are true
        System.out.println("isStudent && hasID = "
                + (isStudent && hasID));          // false

        // OR (||)
        // Returns true if AT LEAST ONE condition is true
        System.out.println("isStudent || hasID = "
                + (isStudent || hasID));          // true

        // NOT (!)
        // Reverses the boolean value
        System.out.println("!isStudent = "
                + (!isStudent));                  // false

        System.out.println("!hasID = "
                + (!hasID));                      // true



        // -------------------------------
        // Combining Relational + Logical
        // -------------------------------

        System.out.println("\nCombined Expressions");

        // Both relational expressions must be true
        System.out.println("(a > b) && (a == 20) = "
                + ((a > b) && (a == 20)));        // true

        // One condition is true, so OR becomes true
        System.out.println("(a < b) || (b == 10) = "
                + ((a < b) || (b == 10)));        // true

        // NOT reverses the result of relational expression
        System.out.println("!(a == b) = "
                + (!(a == b)));                   // true



        // -------------------------------
        // Short-Circuit Example
        // -------------------------------

        int x = 5;

        // First condition is false.
        // Java does NOT evaluate (++x > 5).
        if (x > 10 && ++x > 5) {
            System.out.println("Inside if");
        }

        // x remains 5 because second condition never executes.
        System.out.println("\nValue of x after short circuit = " + x);

    }
}