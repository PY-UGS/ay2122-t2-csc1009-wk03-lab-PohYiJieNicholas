import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate = new Date();

    public Loan(){
        this.annualInterestRate = 2.5;
        this.numberOfYears = 1;
        this.loanAmount = 1000;
    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount){
            this.annualInterestRate = annualInterestRate;
            this.numberOfYears = numberOfYears;
            this.loanAmount = loanAmount;
    }

    public double getAnnualInterestRate(){
        return this.annualInterestRate;
    }

    public void setAnnulInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears(){
        return this.numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount(){
        return this.loanAmount;
    }

    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount;
    }


    public Date getLoanDate(){
        return this.loanDate;
    }

    public double getMonthlyPayment(){
        double monthlyInterestRate = (this.annualInterestRate/12)/100; 
        double x = 1;

        //power of numberOf
        for(int i = 0; i < this.numberOfYears*12; i++){
            x *= (1+monthlyInterestRate);
        }

        return this.loanAmount*monthlyInterestRate/(1-(1/x));

    }

    public double getTotalPayment(){
        return getMonthlyPayment() * this.numberOfYears * 12;
    }

}
