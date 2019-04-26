package bank;

public class Quarter extends Money {

    public Quarter() {
        super.setvalue(.25);
        System.out.println("Adding $0.25");
    }

    public Quarter(int num) {
        super.setvalue(.25 * num);
        double total = num * 0.25;
        System.out.println("Adding $" + total);
    }
}