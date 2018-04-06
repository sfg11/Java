/**
 * Assignment: A19 - Implementing the Interface Segregation Principle (ISP)
 * @author Sarah Gibbons
 * @version 12/1/17
 */
public class ProgrammingCalculator implements ProgrammingDisplay, CalculatorDisplay {
    @Override
    public void basicView() {
        System.out.println("\t SUCCESS: ProgrammingCalculator: implemented basicView()");
    }

    @Override
    public void programmerView() {
        System.out.println("\t SUCCESS: ProgrammingCalculator: implemented programmerView()");
    }
}
