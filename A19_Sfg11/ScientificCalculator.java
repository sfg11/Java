/**
 * Assignment: A19 - Implementing the Interface Segregation Principle (ISP)
 * @author Sarah Gibbons
 * @version 12/1/17
 */

public class ScientificCalculator implements ScientificDisplay, CalculatorDisplay {
    @Override
    public void basicView(){
        System.out.println("\t SUCCESS: ScientificCalculator: implemented basicView()");
    }
    @Override
    public void scientificView() {
        System.out.println("\t SUCCESS: ScientificCalculator: implemented scientificView()");
    }
}
