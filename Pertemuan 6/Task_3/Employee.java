package Task_3;

class Employee extends EmployeeBase {
    public Employee(String n, double s, int day, int month, int year) {
        super(n, s, day, month, year);
    }

    public int compare(Sortable b) {
        EmployeeBase eb = (EmployeeBase) b;
        if (this.salary < eb.salary) return -1;
        if (this.salary > eb.salary) return 1;
        return 0;
    }
}