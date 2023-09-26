import java.util.Scanner;
public class TipCalculator {

    //variables
    private double totalBill;
    private double tipPercentage;
    private int numPeople;
    private double tipAmount;
    private double totalBillWithTip;
    private double tipPerPerson;
    private double totalPerPerson;

    Scanner s = new Scanner(System.in);
    public TipCalculator(double totalBill, double tipPercentage, int numPeople) {
        this.totalBill = totalBill;
        this.tipPercentage = tipPercentage;
        this.numPeople = numPeople;
    }

    public double tipAmount() {
        return totalBill * tipPercentage;
    }

    public double totalBillWithTip() {
        return tipAmount + totalBill;
    }

    public double tipPerPerson() {
        return tipAmount / numPeople;
    }

    public double totalPerPerson() {
        return totalBillWithTip / numPeople;
    }

}
