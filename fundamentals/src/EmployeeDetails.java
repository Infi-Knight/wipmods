public class EmployeeDetails {

    static String etable[][] = {
            {"Emp No", "Emp name", "Join Date", "Designation Code", "Department", "Basic", "HRA", "IT"},
            {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
            {"1002", "Sushma", "23/08/2012", "c", "PM", "30000", "12000", "9000"},
            {"1003", "Rahul", "12/11/2008", "k", "Acct", "10000", "8000", "1000"}
    };

    static String designationTable[][] = {
            {"Designation Code", "Designation", "DA"},
            {"e", "Engineer", "20000"},
            {"c", "Consultant", "32000"},
            {"k", "Clerk", "12000"}
    };

    static int findSalary (String empNo) {
        int emp_row = isValidEmployee(empNo);
        int salary = 0;
        int basic = 0;
        int da = 0;
        int it = 0;
        int hra = 0;

        if (emp_row != 0) {
            basic = Integer.parseInt(etable[emp_row][5]);
            hra = Integer.parseInt(etable[emp_row][6]);
            it = Integer.parseInt(etable[emp_row][7]);

        }
        salary = basic + hra - it;

        String empCode = etable[emp_row][3];
        for (int i = 1; i < designationTable.length; i++) {
            if (designationTable[i][0] == empCode) {
                da = Integer.parseInt(designationTable[i][2]);
                break;
            }
        }

        return  salary+da;
    }

    static void printEmployee(int salary, int index) {
        System.out.printf("%-30s%-30s%-30s%-30s%-30s\n", "Emp No", "Emp name", "Department", "Designation", "Salary");
        String empNo = etable[index][0];
        String empName = etable[index][1];
        String dept = etable[index][4];
        String desg = "";
        String empCode = etable[index][3];
        for (int i = 1; i < designationTable.length; i++) {
            if (designationTable[i][0] == empCode) {
                desg = designationTable[i][1];
                break;
            }
        }

        System.out.printf("%-30s%-30s%-30s%-30s%-30d\n", empNo, empName, dept, desg, salary);
    }

    static  int isValidEmployee(String empNo) {
        for (int i = 1; i < etable.length; i++) {
            if (etable[i][0].equals(empNo)){
                return i;
            }
        }
        return 0;
    }

    public static void main(String args[]) {

        if (args.length > 0) {
            int isValidEmp = isValidEmployee(args[0]);
            if (isValidEmp != 0) {
                printEmployee(findSalary(args[0]), isValidEmp);
            } else {
                System.out.println("There is no employee with empid " + args[0]);
            }
        }
    }
}
