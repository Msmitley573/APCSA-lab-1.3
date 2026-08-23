# Lab 1.3 — Expressions and Output

In this lab you will finish six short methods in `ExpressionsLab.java`. Each
one is only a few lines long. Together they cover everything in Topic 1.3.

Plan on 30 to 45 minutes.

## First — switch to Java 17 or newer

This lab needs **Java 17 or higher**. GitHub Codespaces starts you on Java 11,
which is too old, so switching versions is the first thing you do in a new
Codespace.

Step 1. See the list of Java versions you can install:

```sh
sdk list java
```

Look in the **Identifier** column on the right. Find any identifier that starts
with a number of `17` or higher and ends in `-tem`, like `21.0.8-tem`. Any of
them will work for this lab. Newer is fine.

Step 2. Install the one you picked and make it your default. Replace
`21.0.8-tem` below with the identifier you chose:

```sh
sdk install java 21.0.8-tem
sdk default java 21.0.8-tem
```

The install takes a minute. `sdk default` is what makes new terminals keep
using it.

Step 3. Check that it worked:

```sh
java -version
```

The first line should show a number of 17 or higher. If it still says `11`,
close the terminal, open a new one, and check again.

You only have to do this once per Codespace. If you stop and reopen the same
Codespace later, your Java version is still there. If you create a new
Codespace, do this again.

## What you will practice

- Printing with `System.out.print` and `System.out.println`, and knowing
  exactly where the cursor ends up after each one.
- Writing string literals that contain the three escape sequences: `\"`, `\\`,
  and `\n`.
- Using the five arithmetic operators `+`, `-`, `*`, `/`, `%`, and knowing
  which ones happen first.
- Telling the difference between integer division and real division.

## Getting started

1. Open this folder in your editor.
1. Open `src/main/java/ExpressionsLab.java`. That is the only file you need to
   change.
1. Each part is marked with a comment that starts with `TODO`. Replace the
   placeholder line under it with your own code.

To run your program and see your output:

```sh
mvn -q compile exec:java
```

Your teacher will run a separate set of tests on your work when you turn it in.

## Part 1 — Escape sequences

```java
public static String signMessage()
```

Return a string that would print as these two lines:

```text
The sign said "Watch your step".
Saved to C:\labs\topic13
```

You need all three escape sequences to build it:

| You type | You get |
| --- | --- |
| `\"` | a double quote |
| `\\` | one backslash |
| `\n` | a new line |

This method **returns** the string. It does not print anything itself.

## Part 2 — `print` versus `println`

```java
public static void printScoreboard()
```

Print exactly these three lines. The second line is blank:

```text
Red Blue Green

Done
```

Rules for how to build it:

- Use `System.out.print` for `"Red "` and for `"Blue "`. Notice the space at
  the end of each one.
- Use `System.out.println` for `"Green"`, which ends the first line.
- Use `System.out.println()` with nothing inside the parentheses to make the
  blank line.
- Use `System.out.println` for `"Done"`.

Remember: `print` leaves the cursor where it is, `println` moves it to the
next line.

## Part 3 — Operators and precedence

```java
public static int totalCost(int adults, int children)
```

Museum tickets cost $12 per adult and $7 per child. Every visit also has a
flat $5 parking fee, no matter how many people came. Return the total cost in
dollars.

For example, `totalCost(2, 3)` is 24 plus 21 plus 5, which is `50`.

Multiplication happens before addition, so you can write this in one line
without parentheses.

## Part 4 — Integer division and remainder

```java
public static int fullBoxes(int cookies, int perBox)
public static int leftoverCookies(int cookies, int perBox)
```

You are packing cookies into boxes.

- `fullBoxes` returns how many boxes you can fill **completely**. Use `/`.
- `leftoverCookies` returns how many cookies are left over. Use `%`.

Examples:

| Call | Result | Why |
| --- | --- | --- |
| `fullBoxes(17, 5)` | `3` | 5 + 5 + 5 fits, and 2 are left over |
| `leftoverCookies(17, 5)` | `2` | the 2 that did not fill a box |
| `fullBoxes(7, 10)` | `0` | you cannot fill even one box of 10 |

That last row is the one people get wrong. When both numbers are `int`, `/`
throws the decimal part away. It does not round. `7 / 10` is `0`, not `1`.

## Part 5 — The int and double rule

```java
public static double exactAverage(int a, int b, int c)
```

Return the exact average of three test scores, keeping the decimal part.

`exactAverage(90, 85, 81)` must be `85.33333333333333`.

Be careful here. `a + b + c` is an `int`, and dividing an `int` by the `int`
`3` gives you integer division, which would throw away the decimal part and
give you `85.0`. The result type comes from the operands, not from what you
are returning. Make one of the operands a `double`.

## Part 6 — The `+` operator with strings

```java
public static String summaryLine(int a, int b)
```

Return the label followed by the **sum** of the two numbers.

`summaryLine(3, 4)` must return `Total: 7`.

Watch out. This looks right but is wrong:

```java
return "Total: " + a + b;   // gives Total: 34
```

Once a string is on the left of `+`, everything after it gets joined on as
text instead of added. Use parentheses to force the addition to happen first.

## Before you turn it in

- [ ] `java -version` shows 17 or higher. If it says `11`, go back to the top
      of this README.
- [ ] Every `TODO` comment has been replaced with real code.
- [ ] `mvn -q compile exec:java` runs without errors.
- [ ] Part 2 prints the blank line in the right place. Count the lines.
- [ ] You did not rename any method, change any parameter list, or change any
      return type. The grader compiles against those exact signatures, so a
      rename means a zero even if your logic is perfect.
- [ ] You may change `main` however you like. It is not graded.

## Optional extension, not graded

Predict what happens when you call `fullBoxes(12, 0)`. Then add that call to
`main` and run it.

Read the error message Java gives you. What is it called, and does it happen
when the program is compiled or when it is running?
