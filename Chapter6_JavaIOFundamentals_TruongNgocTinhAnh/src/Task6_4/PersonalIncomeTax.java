package Task6_4;

/**
 * Author: Truong Ngoc Tinh Anh
 * Date: 14 - 09 -2016
 * Version: 01
 * Enum for personal income tax
 */
public enum PersonalIncomeTax {
    RATE1(5000000, 0.05, 250000),
    RATE2(10000000, 0.1, 500000),
    RATE3(18000000, 0.15, 1200000),
    RATE4(32000000, 0.2, 2800000),
    RATE5(52000000, 0.25, 5000000),
    RATE6(80000000, 0.3, 8400000),
    RATE7(0, 0.35, 0);

    private double taxableIncome;
    private double taxRate;
    private double maxOfTax;

    private PersonalIncomeTax(double taxableIncome, double taxRate, double maxOfTax) {
        this.taxableIncome = taxableIncome;
        this.taxRate = taxRate;
        this.maxOfTax = maxOfTax;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public double getMaxOfTax() {
        return maxOfTax;
    }
    
    
    //Function calculate Personal Income Tax
    
    public double calculatePersonalIncomeTax(double taxableIncome) {
        double result = 0;
        switch (this) {
            case RATE1:
                result = taxableIncome * RATE1.getTaxRate();
                break;
            case RATE2:
                result = (taxableIncome - RATE1.getTaxableIncome()) * RATE2.getTaxRate()
                        + RATE1.getMaxOfTax();
                break;
            case RATE3:
                result = (taxableIncome - RATE2.getTaxableIncome()) * RATE3.getTaxRate()
                        + RATE2.getMaxOfTax() + RATE1.getMaxOfTax();
                break;
            case RATE4:
                result = (taxableIncome - RATE3.getTaxableIncome()) * RATE4.getTaxRate()
                        + RATE3.getMaxOfTax() + RATE2.getMaxOfTax() + RATE1.getMaxOfTax();
                break;
            case RATE5:
                result = (taxableIncome - RATE4.getTaxableIncome()) * RATE5.getTaxRate()
                        + RATE4.getMaxOfTax() + RATE3.getMaxOfTax() + RATE2.getMaxOfTax()
                        + RATE1.getMaxOfTax();
                break;
            case RATE6:
                result = (taxableIncome - RATE5.getTaxableIncome()) * RATE6.getTaxRate()
                        + RATE5.getMaxOfTax() + RATE4.getMaxOfTax() + RATE3.getMaxOfTax()
                        + RATE2.getMaxOfTax() + RATE1.getMaxOfTax();
                break;
            case RATE7:
                result = (taxableIncome - RATE6.getTaxableIncome()) * RATE7.getTaxRate()
                        + RATE6.getMaxOfTax() + RATE5.getMaxOfTax() + RATE4.getMaxOfTax()
                        + RATE3.getMaxOfTax() + RATE2.getMaxOfTax() + RATE1.getMaxOfTax();
                break;
        }
        return result;
    }
}
