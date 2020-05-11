package payroll;







public class CommissionedClassification implements PaymentClassification {

    public double commission;
    public double baseRate;
  

    public CommissionedClassification(double baseRate, double commission) {
        this.baseRate = baseRate;
        this.commission = commission;
    }
    @Override
    public double calculatePay(Paycheck paycheck) {
      return 1;////yet to calculate
    }

  }