package payroll;


public class Employee {
    public String address;
    public String name;
    public int empId;
    public PaymentClassification classification;
    public PaymentSchedule schedule;
    public PaymentMethod method;
   


    public Employee(int empId, String name, String address) {
        this.empId = empId;
        this.name = name;
        this.address = address;
    }


    
}
