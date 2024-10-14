# CS3230-Measurable

## Given Starter Code
You are given the following starter code:
* `Measurable` interface, describes any class whose objects can be measured.
* `Data` class, designed to computes the average and the maximum of the measures of the given objects.

## Your Tasks
You need to implement the following items based on the given starter code:

### Complete `Data` class
* Finish the method `public static Measurable max(Measurable[] objects)` to the `Data` class that returns the object with the largest measure.

### Complete `Country` class
* Finish the class `Country` that implements the `Measurable` interface. The class should have two instance variables: country’s `name` of string type and total `area` of the country which is the double type. In this class, add a constructor `public Country(String name, double area)`; also add getters and setters for the two instance variables.

### Complete `Quiz` class
* Finish the class `Quiz` that implements the `Measurable` interface. The class should have a `score` of double type and a `grade` of string type as its instance variables. The `grade` represents a letter grade such as "B+". In this class, add a constructor `public Quiz(double score, String grade)`; also add getters and setters for the two instance variables.

### Complete `Tree` class
* Finish the class `Tree` that implements the `Measurable` interface. The class should have a `height` of double type and a `type` of string type as its instance variables. The `type` represents the type of a tree, such as "Willow". In this class, add a constructor `public Tree(String type, double height)`; also add getters and setters for the two instance variables.

## Testing
Unit tests have been written to test your code. While crafting your solution, feel free to run tests at any point to verify the correctness of your code. To execute tests on your local machine, you can either right-click on the `src/test/java` package in the left pane and choose `Run All Tests`, or use the mvn test command from the IntelliJ Maven button on the right vertical bar, or open a command prompt or terminal, navigate to the project folder, and execute the command `mvn test`. You can run tests for a particular program by right-clicking on the corresponding test code and choosing to run the test. As an example, within IntelliJ, you can right-click on the `HelloWorldTest` file under the test directory and then select `Run HelloWorldTest`.

## Submission
Ensure that your source code is committed and pushed to GitHub.com. Additionally, adhere to any instructions provided on Canvas for the submission of any other necessary documents to fulfill the grading requirements. When you're prepared to upload your solution code to GitHub.com, proceed to commit and push your changes. Feel free to stage, commit, and push the code to GitHub as often as necessary. GitHub.com will autonomously execute tests on its platform to validate your code.
