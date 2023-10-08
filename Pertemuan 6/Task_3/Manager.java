package Task_3;

class Manager extends EmployeeBase {
    private String secretaryName;

    public Manager(String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);
        secretaryName = "";
    }

    public int compare(Sortable b) {
        EmployeeBase eb = (EmployeeBase) b;
        if (this.salary < eb.salary) return -1;
        if (this.salary > eb.salary) return 1;
        return 0;
    }

    public String getSecretaryName() {
        return secretaryName;
    }
}