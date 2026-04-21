public class InvestmentTracker
{
    double Principal;
    double InterestRate;
    int Years;

    public InvestmentTracker(double principal, double interestRate, int years)
    {
        Principal = principal;
        InterestRate = interestRate;
        Years = years;
    }

    public double calculateTotal()
    {
        return Principal * Math.pow((1 + InterestRate), Years);
    }

    public static void main(String[] args)
    {
        InvestmentTracker investment = new InvestmentTracker(1000, 0.05, 10);

        double total = investment.calculateTotal();

        System.out.println("Final investment value: $" + total);
    }
}
