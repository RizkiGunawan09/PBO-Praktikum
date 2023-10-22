public class Employee extends StaffMember{
    protected String socialSecurityNumber;
    protected double payRate;

    //----------------------------------------------------------
    //  Constructor: Sets up this employee with the specified
    //  information.
    //----------------------------------------------------------
    public Employee (String name, String address, String phone, String socialSecurityNumber, double payRate) {
        super (name, address, phone);
        this.socialSecurityNumber = socialSecurityNumber;
        this.payRate = payRate;
    }

    //----------------------------------------------------------
    //  Returns information about an employee as a string.
    //----------------------------------------------------------
    @Override
    public String toString() {
        String result = super.toString();
        result += "\nSocial Security Number: " + socialSecurityNumber;
        return result;
    }

    //----------------------------------------------------------
    //  Returns the pay rate for this employee.
    //----------------------------------------------------------
    @Override
    public double pay() {
        return payRate;
    }
}
