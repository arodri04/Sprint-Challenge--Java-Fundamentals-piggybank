package bank;

import java.util.ArrayList;

public class Main {
    private static void workWithData() {
        ArrayList<Money> piggyBank = new ArrayList<>();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar(1));
        piggyBank.add(new Penny(10));

        double saved = 0;
        for (Money m : piggyBank) {
            saved += m.getvalue();
        }
        System.out.println("there is : $" + saved + "in the piggy bank");
    }

    public static void main(String[] args) {
        workWithData();
    }
}