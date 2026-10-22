import java.util.Objects;

// Run this file to check your work. It prints PASS or FAIL for each method, plus a hint when something is wrong.
// Expected values below come from the verified passing stats (see instructor/DATA_SOURCES.md).
// They are typed in here on purpose, so the tests do not depend on your file.
public class Exercise3Test {

    public static void main(String[] args) {
        System.out.println("Checking Exercise 3...\n");
        run("biggestRiser", Exercise3Test::biggestRiser);
        run("biggestFaller", Exercise3Test::biggestFaller);
        run("countImproved", Exercise3Test::countImproved);
        finish();
    }

    static void biggestRiser() {
        checkRiser(3, "Josh Allen");
        checkRiser(1, "Patrick Mahomes");
        checkRiser(5, "Jordan Love");
        checkRiser(7, "Jordan Love");
        checkRiser(8, "C.J. Stroud");
        checkRiser(10, "C.J. Stroud");
    }

    static void checkRiser(int n, String expected) {
        String actual = Exercise3.biggestRiser(n);
        expect(expected, actual, "With n = " + n + ": expected the biggest riser to be " + expected + " but got \""
                + actual + "\". Did you build the change list for exactly the first " + n + " QB" + (n == 1 ? "" : "s")
                + " (indexes 0 to " + (n - 1) + "), and remember the INDEX of the largest change?");
    }

    static void biggestFaller() {
        checkFaller(4, "Drake Maye");
        checkFaller(1, "Patrick Mahomes");
        checkFaller(2, "Patrick Mahomes");
        checkFaller(6, "Justin Herbert");
        checkFaller(9, "Bo Nix");
        checkFaller(10, "Bo Nix");
    }

    static void checkFaller(int n, String expected) {
        String actual = Exercise3.biggestFaller(n);
        expect(expected, actual, "With n = " + n + ": expected the biggest faller to be " + expected + " but got \""
                + actual + "\". The biggest faller has the SMALLEST change (2026 minus 2025). Did you build the change list"
                + " for exactly the first " + n + " QB" + (n == 1 ? "" : "s") + "?");
    }

    static void countImproved() {
        checkImproved(4, 3);
        checkImproved(1, 1);
        checkImproved(3, 2);
        checkImproved(6, 4);
        checkImproved(8, 6);
        checkImproved(10, 7);
    }

    static void checkImproved(int n, int expected) {
        int actual = Exercise3.countImproved(n);
        expect(expected, actual, "With n = " + n + ": expected " + expected + " QB" + (expected == 1 ? "" : "s")
                + " to have improved but got " + actual + ". Count only changes that are greater than 0, and only for the first "
                + n + " QB" + (n == 1 ? "" : "s") + ".");
    }

    // ===================== test runner (you don't need to read below here) =====================

    private static int passed = 0;
    private static int failed = 0;
    private static int crashed = 0;

    private static class Failure extends RuntimeException {
        Failure(String message) {
            super(message);
        }
    }

    private static void expect(Object expected, Object actual, String message) {
        if (!Objects.equals(expected, actual)) {
            throw new Failure(message);
        }
    }

    private static void run(String name, Runnable test) {
        try {
            test.run();
            passed++;
            System.out.println("PASS   " + name);
        } catch (Failure f) {
            failed++;
            System.out.println("FAIL   " + name);
            System.out.println("         " + f.getMessage());
        } catch (RuntimeException e) {
            crashed++;
            System.out.println("CRASH  " + name);
            System.out.println("         Your method stopped with an error: " + e);
            System.out.println("         Check your list indexes - the last valid index is size() - 1.");
        }
    }

    private static void finish() {
        int total = passed + failed + crashed;
        System.out.println();
        System.out.println(passed + " of " + total + " methods passed." + (passed == total ? " Great work!" : ""));
        System.exit(passed == total ? 0 : 1);
    }
}
