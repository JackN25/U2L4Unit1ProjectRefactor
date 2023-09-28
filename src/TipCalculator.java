public class TipCalculator {

    //variables
    final private double totalBill;
    final private double tipPercentage;
    final private int numPeople;
    private double tipAmount;
    private double totalBillWithTip;

    public TipCalculator(double totalBill, double tipPercentage, int numPeople) {
        this.totalBill = totalBill;
        this.tipPercentage = tipPercentage;
        this.numPeople = numPeople;
    }

    public double tipAmount() {
        tipAmount = totalBill * tipPercentage;
        return tipAmount;
    }

    public double totalBillWithTip() {
        totalBillWithTip = tipAmount + totalBill;
        return totalBillWithTip;
    }

    public double tipPerPerson() {
        return tipAmount / numPeople;
    }

    public double totalPerPerson() {
        return totalBillWithTip / numPeople;
    }

}
