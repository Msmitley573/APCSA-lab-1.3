/**
 * AP CSA Lab 1.3 - Expressions and Output
 *
 * Fill in the body of each method below. Do not rename anything, do not change
 * the parameter lists, and do not change the return types. The grader compiles
 * against these exact signatures.
 *
 * Run the program with:  mvn -q compile exec:java
 * Or from your IDE, just run main.
 */
public class ExpressionsLab
{
    // ---------------------------------------------------------------
    // PART 1: Escape sequences
    //
    // Return (do NOT print) a String that would print as these two lines:
    //
    //     The sign said "Watch your step".
    //     Saved to C:\labs\topic13
    //
    // You will need all three escape sequences: \" and \\ and \n
    // ---------------------------------------------------------------
    
    
        // TODO Part 1: replace this placeholder with the real string
     public static  String signMessage()
    {
    return  "The sign said \"Watch your step\".\nSaved to C:\\labs\\topic13";
    }

    // ---------------------------------------------------------------
    // PART 2: print vs println
    // 
    // Print exactly these three lines (the second line is blank):
    //
    //     Red Blue Green
    //
    //     Done
    //
    // Rules: print "Red " and "Blue " with System.out.print, finish the first
    // line with System.out.println, then use System.out.println() with nothing
    // inside the parentheses to make the blank line.
    // ---------------------------------------------------------------
    public static void printScoreboard()
    { System.out.print("Red "); System.out.print("Blue "); System.out.println("Green");
     System.out.println();
     System.out.println("Done");
    } 

    // ---------------------------------------------------------------
    // PART 3: Arithmetic operators and precedence
    //
    // Museum tickets cost $12 per adult and $7 per child. Every visit also
    // has a flat $5 parking fee, no matter how many people came.
    //
    // Return the total cost in dollars.
    // Example: totalCost(2, 3) is 24 + 21 + 5, which is 50.
    // ---------------------------------------------------------------
    public static int totalCost(int adults, int children)
    {
        // TODO Part 3: return the total cost
        return adults * 12 + children * 7 + 5;
    }

    // ---------------------------------------------------------------
    // PART 4a: Integer division
    //
    // You are packing cookies into boxes. Return how many boxes you can fill
    // completely. Leftover cookies do not count.
    // Example: fullBoxes(17, 5) is 3, because 5 + 5 + 5 fits and 2 are left.
    // ---------------------------------------------------------------
    public static int fullBoxes(int cookies, int perBox)
    {
        // TODO Part 4a: return the number of completely filled boxes
        return cookies / perBox;
    }

    // ---------------------------------------------------------------
    // PART 4b: The remainder operator
    //
    // Return how many cookies are left over after filling every full box.
    // Example: leftoverCookies(17, 5) is 2.
    // ---------------------------------------------------------------
    public static int leftoverCookies(int cookies, int perBox)
    {
        // TODO Part 4b: return the leftover cookies
        return cookies % perBox;
    }

    // ---------------------------------------------------------------
    // PART 5: The int / double rule
    //
    // Return the exact average of three test scores, keeping the decimal part.
    // Example: exactAverage(90, 85, 81) is 85.33333333333333
    //
    // Careful: a + b + c is an int, and dividing an int by the int 3 throws
    // the decimal part away. Make one operand a double.
    // ---------------------------------------------------------------
    public static double exactAverage(int a, int b, int c)
    {
        // TODO Part 5: return the exact average
        return (a+b+c)/3.0;
    }

    // ---------------------------------------------------------------
    // PART 6: The + operator with Strings
    //
    // Return a label followed by the SUM of the two numbers.
    // Example: summaryLine(3, 4) returns  Total: 7
    //
    // Careful: "Total: " + 3 + 4 gives Total: 34, because once a String is on
    // the left of +, everything after it is joined as text instead of added.
    // ---------------------------------------------------------------
    public static String summaryLine(int a, int b)
    {
        // TODO Part 6: return the label plus the sum
        return "Total: " + (a+b);
    }

    // ---------------------------------------------------------------
    // Run this to see your own work. The grader does not test main, so you
    // may change it freely while you experiment.
    // ---------------------------------------------------------------
    public static void main(String[] args)
    {
        System.out.println("--- Part 1 ---");
        System.out.println(signMessage());

        System.out.println("--- Part 2 ---");
        printScoreboard();

        System.out.println("--- Parts 3 to 6 ---");
        System.out.println("totalCost(2, 3)          = " + totalCost(2, 3));
        System.out.println("fullBoxes(17, 5)         = " + fullBoxes(17, 5));
        System.out.println("leftoverCookies(17, 5)   = " + leftoverCookies(17, 5));
        System.out.println("exactAverage(90, 85, 81) = " + exactAverage(90, 85, 81));
        System.out.println("summaryLine(3, 4)        = " + summaryLine(3, 4));
    }
}
