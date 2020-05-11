package payroll;


import java.util.Calendar;

public class MonthlySchedule implements PaymentSchedule {
  public boolean isPayDate(Calendar payDate) {
    return isLastDayOfMonth(payDate);
  }

  private boolean isLastDayOfMonth(Calendar date) {
    int lastday=date.getActualMaximum(Calendar.DAY_OF_MONTH);
    return lastday==date.get(Calendar.DAY_OF_MONTH);
  }

  @Override
  public Calendar getPayPeriodStartDate(Calendar payDate) {
    return null;
  }
}
