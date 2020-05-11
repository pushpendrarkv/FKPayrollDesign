package payroll;
import java.util.Scanner;
public class Mainfun {
public static void main(String [] args) {
    System.out .println("ENTER YOUR CHOICE");
    System.out .println("0. TO EXIT  1. ADD EMPLOYEE  2.DELETE EMPLOYEE");
    Scanner obj=new Scanner(System.in);
    int i=obj.nextInt();
    
    while(i!=0){
    switch(i){
        case 1:
        addemployee.playWithAddEmployee();
        break;
        case 2:
        DeleteEmployee.playWithDeleteEmployee();
        break;
    }
    System.out .println("0. TO EXIT  1. ADD EMPLOYEE  2.DELETE EMPLOYEE");
    i=obj.nextInt();

}
obj.close();
}
}

