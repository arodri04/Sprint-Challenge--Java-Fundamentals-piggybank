package bank;

public class Penny extends Money {

    public Penny() {
        super.setvalue(.01);
        System.out.println("Adding $0.01");
    }

    public Penny(int num) {
        super.setvalue(.01 * num);
        double total = num * 0.01;
        System.out.println("Adding $" + total);
    }
}