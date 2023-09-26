//importing packages
import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //Ask for bill
        System.out.print("Enter the total bill: ");
        String totalBillPlaceholder = s.nextLine();
        double totalBill = Double.parseDouble(totalBillPlaceholder);

        //Ask for tip percent
        System.out.print("Enter the percent tip(only whole numbers without % sign): ");
        String tipPercentPlaceholder = s.nextLine();
        double tipPercent = Double.parseDouble(tipPercentPlaceholder);

        //Ask for amount of people
        System.out.print("Enter the amount of people: ");
        String numOfPeoplePlaceholder = s.nextLine();
        int numOfPeople = Integer.parseInt(numOfPeoplePlaceholder);

        //calculations
        double tipPercentDecimal = tipPercent / 100;
        double tipAmount = totalBill * tipPercentDecimal;
        double totalBillWithTip = tipAmount + totalBill;
        double tipPerPerson = tipAmount / numOfPeople;
        double totalPerPerson = totalBillWithTip / numOfPeople;

        //Rounding and formatting
        DecimalFormat df = new DecimalFormat("#.00");
        df.setRoundingMode(RoundingMode.HALF_UP);

        //Output
        System.out.println("The amount you need to tip for the meal is " + df.format(tipAmount));
        System.out.println("The total cost of the bill is " + df.format(totalBillWithTip));
        System.out.println("The amount of tip per person is " + df.format(tipPerPerson));
        System.out.println("The total amount per person is " + df.format(totalPerPerson));
    }
}