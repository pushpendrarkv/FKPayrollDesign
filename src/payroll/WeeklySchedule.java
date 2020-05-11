package payroll;

import java.util.Calendar;



public class WeeklySchedule implements PaymentSchedule {
  @Override
  public boolean isPayDate(Calendar payDate) {
    return payDate.get(Calendar.DAY_OF_WEEK) == 5;
  }

  @Override
  public Calendar getPayPeriodStartDate(Calendar payDate) {
    payDate.add(Calendar.DAY_OF_MONTH,payDate.get(Calendar.DAY_OF_WEEK)-1);
   return payDate;  
  }

}
