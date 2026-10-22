# Exercise 3: QB Showdown — Who Improved?

Stretch / homework (~25 minutes). You'll compare real passing yards per game for 10 starting quarterbacks: 2025 vs. 2026 so far.

## What to do
1. Open `src/Exercise3.java`.
2. Fill in the three methods under **YOUR WORK**. Each one only looks at the first `n` QBs on the list.
   The skill you're practicing: build a **new local list** of changes with one loop, then scan that list with a second loop.
3. Run `main`. Compare your output to the `// Expected:` comments under each line.
4. Don't change anything below the **DO NOT EDIT** line. That's where the data lives.
   You get it by calling `getQuarterbackNames()` and `getPassingYardsPerGame(season)`.

## Checking your work with the tests
- Open `test/Exercise3Test.java` and run it, just like you run `main`. It prints PASS or FAIL for each method.
- Or, in the terminal: `javac -d out src/*.java test/*.java` then `java -cp out Exercise3Test`
- Each failing test prints a message. **Read the failure message first.** It tells you which `n` went wrong, what the right answer was, and a hint.
- At the start, every test fails. That's normal. Each method you finish should change from FAIL to PASS.
