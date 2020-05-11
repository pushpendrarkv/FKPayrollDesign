package payroll;







public class HourlyClassification implements PaymentClassification{

    public double hourlyRate;
   
    public HourlyClassification(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay(Paycheck paycheck) {
      return 1;//yettocalculate
    }
}