package payroll;


import java.util.Calendar;

public class BiWeeklySchedule implements PaymentSchedule {

  @Override
  public boolean isPayDate(Calendar payDate) {
    return payDate.get(Calendar.DAY_OF_WEEK) == 5 && payDate.get(Calendar.WEEK_OF_YEAR % 2) == 0;
  }

  @Override
  public Calendar getPayPeriodStartDate(Calendar payDate) {
    payDate.add(Calendar.DAY_OF_MONTH,payDate.get(Calendar.DAY_OF_WEEK)-1+7);
   return payDate;  
  }


}
