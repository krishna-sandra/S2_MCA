import java.util.Scanner;

class Employee {
    int eNo;
    String eName;
    double eSalary;

    Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }

    void display() {
        System.out.println("Employee Number: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: " + eSalary);
    }
}

class EmployeeSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for employee " + (i + 1));
            System.out.print("Employee Number: ");
            int eNo = sc.nextInt();
            sc.nextLine();  
            System.out.print("Employee Name: ");
            String eName = sc.nextLine();
            System.out.print("Employee Salary: ");
            double eSalary = sc.nextDouble();
            employees[i] = new Employee(eNo, eName, eSalary);
        }
        System.out.print("Enter employee number to search: ");
        int searchNo = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (employees[i].eNo == searchNo) {
                employees[i].display();
                break;
            }
        }
        sc.close();
    }
}