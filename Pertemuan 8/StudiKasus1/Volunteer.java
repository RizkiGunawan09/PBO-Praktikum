public class Volunteer extends StaffMember{
    //----------------------------------------------------------
    //  Constructor: Sets up this volunteer using the specified
    //  information.
    //----------------------------------------------------------
    public Volunteer (String name, String address, String phone) {
        super (name, address, phone);
    }

    //----------------------------------------------------------
    //  Returns a zero pay value for this volunteer.
    //----------------------------------------------------------
    @Override
    public double pay() {
        return 0.0;
    }
}
