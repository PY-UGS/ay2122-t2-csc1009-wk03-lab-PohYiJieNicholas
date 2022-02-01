import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double interestRate = input.nextDouble();

        System.out.print("Enter number of years as an integer: ");
        int years = input.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95:  ");
        double loanAmount = input.nextDouble();

        Loan loan = new Loan(interestRate,years,loanAmount);

        System.out.println("The loan was created on "+loan.getLoanDate());

        System.out.printf("The monthly payment is %.2f \n", loan.getMonthlyPayment());
        System.out.printf("The total payment is %.2f", loan.getTotalPayment());

        
    }
}
