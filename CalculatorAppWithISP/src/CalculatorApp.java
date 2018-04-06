/**
 * Assignment: A19 - Implementing the Interface Segregation Principle (ISP)
 * @author Sarah Gibbons
 * @version 12/1/17
 */
public class CalculatorApp {
    public static void main(String[] args) {
        System.out.println("Modified with Interface Segregation Principle (ISP) implemented.");

        BasicCalculator();
        ScientificCalculator();
        ProgrammerCalculator();

    }

    private static void BasicCalculator() {
        System.out.println("\n1. Methods of Basic display:");
        CalculatorDisplay basicDisplay = new BasicCalculator();
        basicDisplay.basicView();
    }

    private static void ScientificCalculator() {
        System.out.println("\n2. Methods of Scientific display:");
        ScientificDisplay scientificDisplay = new ScientificCalculator();
        scientificDisplay.scientificView();
        ((CalculatorDisplay)scientificDisplay).basicView();
    }

    private static void ProgrammerCalculator() {
        System.out.println("\n3. Methods of Programmer display:");
        ProgrammingDisplay programmingDisplay = new ProgrammingCalculator();
        programmingDisplay.programmerView();
        ((CalculatorDisplay)programmingDisplay).basicView();
    }
}
