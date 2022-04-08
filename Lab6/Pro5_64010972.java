public class Pro5_64010972 {

    public static void main(String[] args) {
        System.out.println("Income    Single    Married    Separately    Head");
        for (double t = 50000; t <= 60000; t += 1000) {
            Tax tax = new Tax();
            tax.setTaxableIncome(t);
            tax.setFilingStatus(Tax.SINGLE_FILER);
            double s = tax.getTax();
            tax.setFilingStatus(Tax.MARRIED_JOINTLY_OR_QUALIFYING_WIDOW);
            double m = tax.getTax();
            tax.setFilingStatus(Tax.MARRIED_SEPARATELY);
            double me = tax.getTax();
            tax.setFilingStatus(Tax.HEAD_OF_HOUSEHOLD);
            double h = tax.getTax();
            System.out.printf("%-9.1f %-9.1f %-10.1f %-13.1f %-6.1f\n", t, s, m, me, h);
        }
    }
}

class Tax {
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;
    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax() {
        rates = new double[]{ 0.10, 0.15, 0.25, 0.28, 0.33, 0.35 };
        brackets = new int[][]{
                { 8350, 33950, 82250, 171550, 372950 }, // Single filer
                { 16700, 67900, 137050, 20885, 372950 }, // Married jointly or qualifying widow(er)
                { 8350, 33950, 68525, 104425, 186475 }, // Married separately
                { 11950, 45500, 117450, 190200, 372950 } // Head of household
        };
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus() {
        return this.filingStatus;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public int[][] getBrackets() {
        return this.brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return this.rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return this.taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }    

    public double getTax() {
        if (taxableIncome <= brackets[filingStatus][0])
            return taxableIncome * rates[0];

        if (taxableIncome <= brackets[filingStatus][1])
            return (brackets[filingStatus][0] * rates[0]) +
                (taxableIncome - brackets[filingStatus][0]) * rates[1];

        if (taxableIncome <= brackets[filingStatus][2])
            return (brackets[filingStatus][0] * rates[0]) +
                (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1] +
                (taxableIncome - brackets[filingStatus][1]) * rates[2];

        if (taxableIncome <= brackets[filingStatus][3])
            return (brackets[filingStatus][0] * rates[0]) +
                (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1] +
                (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2] +
                (taxableIncome - brackets[filingStatus][2]) * rates[3];

        if (taxableIncome <= brackets[filingStatus][4])
            return (brackets[filingStatus][0] * rates[0]) +
                (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1] +
                (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2] +
                (brackets[filingStatus][3] - brackets[filingStatus][2]) * rates[3] +
                (taxableIncome - brackets[filingStatus][3]) * rates[4];

        return (brackets[filingStatus][0] * rates[0]) +
            (brackets[filingStatus][1] - brackets[filingStatus][0]) * rates[1] +
            (brackets[filingStatus][2] - brackets[filingStatus][1]) * rates[2] +
            (brackets[filingStatus][3] - brackets[filingStatus][2]) * rates[3] +
            (brackets[filingStatus][4] - brackets[filingStatus][3]) * rates[4] +
            (taxableIncome - brackets[filingStatus][4]) * rates[5];
    }
}