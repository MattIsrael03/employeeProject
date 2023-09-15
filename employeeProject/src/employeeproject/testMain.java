package employeeproject;

import employeeproject.basePlusCommissionEmployee;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class testMain {
    
    public static void main(String[] args) throws ParseException {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        basePlusCommissionEmployee employee1 = new basePlusCommissionEmployee(1, "Israel", dateFormat.parse("2023-06-25"), dateFormat.parse("1998-10-4"), 50000, 5000);
        System.out.println("Employee 1 Information:\n");
        employee1.displayInfo();
        System.out.println();

        System.out.println("\nEmployee 2 Information:\n");
    }
}

