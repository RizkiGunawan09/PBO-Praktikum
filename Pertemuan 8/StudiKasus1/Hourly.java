public class Hourly extends Employee{
    private int hoursWorked;

    //----------------------------------------------------------
    //  Constructor: Sets up this hourly employee using the
    //  specified information.
    //----------------------------------------------------------
    public Hourly (String name, String address, String phone, String socialSecurityNumber, double payRate) {
        super (name, address, phone, socialSecurityNumber, payRate);
        hoursWorked = 0;
    }

    //----------------------------------------------------------
    //  Adds the specified number of hours to this employee's
    //  accumulated hours.
    //----------------------------------------------------------
    public void addHours (int moreHours) {
        hoursWorked += moreHours;
    }

    //----------------------------------------------------------
    //  Computes and returns the pay for this hourly employee.
    //----------------------------------------------------------
    @Override
    public double pay() {
        double payment = payRate * hoursWorked;
        hoursWorked = 0;
        return payment;
    }

    //----------------------------------------------------------
    //  Returns information about this hourly employee as a
    //  string.
    //----------------------------------------------------------
    @Override
    public String toString() {
        String result = super.toString();
        result += "\nCurrent hours: " + hoursWorked;
        return result;
    }
}
