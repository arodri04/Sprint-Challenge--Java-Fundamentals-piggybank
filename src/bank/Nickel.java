package bank;

public class Nickel extends Money {

    public Nickel() {
        super.setvalue(.05);
        System.out.println("Adding $0.05");
    }

    public Nickel(int num) {
        super.setvalue(.05 * num);
        double total = num * 0.05;
        System.out.println("Adding $" + total);
    }
}