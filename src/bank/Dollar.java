package bank;

public class Dollar extends Money {

    public Dollar() {
        super.setvalue(1);
        System.out.println("Adding $1");
    }

    public Dollar(int num) {
        super.setvalue(1 * num);
        System.out.println("Adding $" + num);
    }
}