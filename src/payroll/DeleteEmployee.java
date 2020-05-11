package payroll;

import java.util.Scanner;

public class DeleteEmployee {
    public static void playWithDeleteEmployee(){
        int id;
        System.out.println("Enter ID of employee to be added");
        Scanner obj=new Scanner(System.in);
        id=obj.nextInt();
        //obj.close();
        PayrollDatabase pd=new PayrollDatabase();
        Employee e=pd.getEmployee(id);
        assert(e!=null);
        pd.deleteEmployee(id);
        Employee j=pd.getEmployee(id);
        assert(j==null);

    }
}
