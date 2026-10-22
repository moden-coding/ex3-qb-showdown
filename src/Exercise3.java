import java.util.ArrayList;

public class Exercise3 {

    // ===================== main: run this to see your output =====================
    public static void main(String[] args) {
        // This is what the data looks like - the three lists are lined up by index:
        System.out.println("QBs:        " + getQuarterbackNames());
        System.out.println("2025 yds/g: " + getPassingYardsPerGame(2025));
        System.out.println("2026 yds/g: " + getPassingYardsPerGame(2026));
        System.out.println();

        System.out.println("Biggest riser among the first 3 QBs: " + biggestRiser(3));
        // Expected: Josh Allen

        System.out.println("Biggest riser among all 10 QBs: " + biggestRiser(10));
        // Expected: C.J. Stroud

        System.out.println("Biggest faller among the first 4 QBs: " + biggestFaller(4));
        // Expected: Drake Maye

        System.out.println("QBs who improved among the first 4: " + countImproved(4));
        // Expected: 3
    }

    // ===================== YOUR WORK: fill in these methods =====================
    // Each method only looks at the FIRST n quarterbacks on the list (1 <= n <= 10).
    // A QB's "change" is: (2026 yards per game) - (2025 yards per game). Positive = he improved.
    //
    // What you are practicing: inside each method,
    //   1) make a NEW local ArrayList<Double> of changes, using one loop over the first n QBs, then
    //   2) loop over your change list to find what you need, and use the index to look up the QB's name.

    // Return the name of the QB (among the first n) whose change is the LARGEST.
    // Example: names [A, B, C], 2025 [200.0, 250.0, 210.0], 2026 [220.0, 240.0, 260.0]
    //          changes are [20.0, -10.0, 50.0], so biggestRiser(3) is "C" and biggestRiser(2) is "A".
    // Hint: remember the INDEX of the best change so far (start with index 0), not just the value.
    public static String biggestRiser(int n) {
        // TODO: your code here
        return "";
    }

    // Return the name of the QB (among the first n) whose change is the most NEGATIVE (the smallest).
    // Example: with the same lists as above, biggestFaller(3) is "B".
    // Hint: this is the same idea as biggestRiser, but you are tracking the smallest change instead.
    public static String biggestFaller(int n) {
        // TODO: your code here
        return "";
    }

    // Return how many of the first n QBs improved: their 2026 yards per game is strictly greater than 2025.
    // Example: with the same lists as above, countImproved(3) is 2 (A and C).
    // Hint: build the change list, then count the changes that are greater than 0.
    public static int countImproved(int n) {
        // TODO: your code here
        return 0;
    }

    // ===================== DATA: loaded for you — DO NOT EDIT BELOW THIS LINE =====================
    // Regular-season passing yards per game (passing yards / games played), rounded to 1 decimal.
    // 2025: full regular season. 2026 data through Week 6, retrieved 2026-10-21.
    // Source: ESPN player stats, cross-checked with FOX Sports (games, yards, yds/game) and NFL.com (yards).

    public static ArrayList<String> getQuarterbackNames() {
        return new ArrayList<>(java.util.List.of(
                "Patrick Mahomes", "Josh Allen", "Drake Maye", "Dak Prescott", "Jordan Love", "Justin Herbert",
                "Jared Goff", "C.J. Stroud", "Bo Nix", "Matthew Stafford"));
    }

    public static ArrayList<Double> getPassingYardsPerGame(int season) {
        if (season == 2025) {
            return new ArrayList<>(java.util.List.of(
                    256.2, 215.8, 258.5, 267.8, 225.4, 232.9, 268.5, 217.2, 231.2, 276.9));
        }
        if (season == 2026) {
            return new ArrayList<>(java.util.List.of(
                    261.8, 250.7, 243.8, 273.2, 280.7, 190.2, 297.0, 285.7, 174.8, 299.0));
        }
        return new ArrayList<>();
    }
}
