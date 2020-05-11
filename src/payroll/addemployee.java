package payroll;


import java.util.*;


public class addemployee {

    public static void playWithAddEmployee() {
     System.out.println("ENTER EMPLOYEE TYPE YOU WANT TO ADD");
     System.out.println("1.TO ADD HOURLY EMPLOYEE 2.FOR MONTHLY SALARIED  3.FOR COMMISSIONED EMPLOYEE");
     Scanner objj =new Scanner(System.in);
     int choice=objj.nextInt();
     System.out.println("ENTER EMPLOYEE NAME");
     Scanner obj =new Scanner(System.in);

     String name=obj.nextLine();
     System.out.println("ENTER EMPLOYEE ADDRESS:  ");
     String adrs=obj.nextLine();
     System.out.println("Enter An ID for employee");
     int id = obj.nextInt();

     switch (choice) {
         case 1:
         
         System.out.println("Enter hourlyrate for employee");
         double rate= obj.nextDouble();
         PayrollDatabase md=new PayrollDatabase();
         AddHourlyEmployee hemp=new AddHourlyEmployee(id, name, adrs,rate, md);
             break;
         case 2:
         System.out.println("Enter salary for employee");
         double Salary= obj.nextDouble();
        
         PayrollDatabase md2=new PayrollDatabase();
         AddSalariedEmployee semp=new AddSalariedEmployee(id, name, adrs, Salary, md2);
         break;
         
         case 3:
         System.out.println("Enter salary for employee");
         double salary= obj.nextDouble();
         System.out.println("Enter commission rate for employee");
         double crate= obj.nextDouble();
         PayrollDatabase md3=new PayrollDatabase();
         AddCommissionedEmployee cemp=new AddCommissionedEmployee(id,name,adrs,salary,crate,md3);
         break;
         default:
             break;
     }    


    }
}