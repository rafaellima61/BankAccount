package dominio;

public class Account {
    private String name;
    private int number;
    private double depositValue;

    public Account(String name, int number, boolean initialDeposit, double depositValue) {
        this.name = name;
        this.number = number;
        this.depositValue = depositValue;
    }

    public Account() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getDepositValue() {
        return depositValue;
    }

    public void setDepositValue(double depositValue) {
        this.depositValue = depositValue;
      }
    public void addDeposit(double amount) {
        this.depositValue += amount;
    }

    public void withDrawDeposit(double amount) {
        double fee = 5.00;
        this.depositValue -= (amount + fee);
    }
}
