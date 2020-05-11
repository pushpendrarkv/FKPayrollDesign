
package payroll;

public class AddCommissionedEmployee extends AddEmployeeTransaction{

    private final double baseRate;
    private final double commission;

    public AddCommissionedEmployee(final int empId, final String name, final String address, final double baseRate,
            final double commission, final PayrollDatabase db) {
        super(empId, name, address, db);
        this.commission = commission;
        this.baseRate = baseRate;
    }

    @Override
    protected PaymentClassification MakeClassification() {
        return new CommissionedClassification(baseRate, commission);
    }

    @Override
    protected PaymentSchedule MakeSchedule() {
        return new BiWeeklySchedule();
    }
}
