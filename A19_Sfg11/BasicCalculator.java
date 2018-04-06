/**
 * Assignment: A19 - Implementing the Interface Segregation Principle (ISP)
 * @author Sarah Gibbons
 * @version 12/1/17
 */
public class BasicCalculator implements CalculatorDisplay{
    @Override
    public void basicView() {
        System.out.println("\t SUCCESS: BasicCalculator: implemented basicView");
    }

}