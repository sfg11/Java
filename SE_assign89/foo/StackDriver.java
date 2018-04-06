public class StackDriver {

    /**
     * @param args the command line arguments
     */

    public static void display(Stack s) {
        System.out.println("Continutul stivei este: "+s);
    }

    public static void main(String[] args) {
        try {
            Stack s1 = new StackImpl1();
            s1.push("a");
            s1.push("b");
            display(s1);

            Stack s2 = new StackImpl2();
            s2.push(new Integer(1));
            s2.push(new Double(3.14));
            display(s2);
        } catch(StackException e) {
            System.err.println("Eroare la lucru cu stiva!");
            e.printStackTrace();
        }
    }

}
