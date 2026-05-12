public class InvestmentTracker
{
    double principalVal;
    double interestRateVal;
    int yearsVal;

    public InvestmentTracker(double principal, double interestRate, int years)
    {
        principalVal = principal;
        interestRateVal = interestRate;
        yearsVal = years;
    }

    public double calculateTotal()
    {
        return principalVal * Math.pow((1 + interestRateVal), yearsVal);
    }

    public static void main(String[] args)
    {
        InvestmentTracker investment = new InvestmentTracker(1000, 0.05, 10);

        double total = investment.calculateTotal();

        System.out.println("Final investment value: $" + total);
    }
}
