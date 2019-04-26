package bank;

public abstract class Money {
    public int num;
    public double value;

    public Money(int num) {
        this.num = num;

    }

    public Money() {
        this.num = 1;

    }

    public void setvalue(double v) {
        this.value = v;
    }

    public double getvalue() {
        return value * num;
    }
}