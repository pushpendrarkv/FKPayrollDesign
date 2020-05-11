package payroll;


import java.util.Calendar;

public class Paycheck {

  public final Calendar payDate;
  public Calendar startDate;
  public double grossPay;
  public double deductions;
  public double netPay;

  public Paycheck(Calendar startDate, Calendar payDate) {
    this.startDate = startDate;
    this.payDate = payDate;
  }
}
