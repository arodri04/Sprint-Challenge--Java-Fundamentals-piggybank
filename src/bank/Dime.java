package bank;

public class Dime extends Money {

    public Dime() {
        super.setvalue(.1);
        System.out.println("Adding $0.10");
    }

    public Dime(int num) {
        double total = num * 0.1;
        super.setvalue(.1 * num);
        System.out.println("Adding $" + total);
    }
}