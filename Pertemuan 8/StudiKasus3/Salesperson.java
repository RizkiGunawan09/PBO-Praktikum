// ******************************************************
//  Salesperson.java
//
//  Reprensents a salesperson who has a first name, last
//  name, and total number of sales.
// ******************************************************

public class Salesperson implements Comparable{
    private String firstName, lastName;
    private int totalSales;

    //-------------------------------------------------------
    //  Constructor:   Sets up the sales person object with
    //                 the given data.
    //-------------------------------------------------------
    public Salesperson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    //------------------------------------------
    //  Returns the sales person as a string
    //------------------------------------------
    @Override
    public String toString() {
        return lastName + ", " + firstName + ": \t" + totalSales;
    }

    //------------------------------------------
    //  Returns true if the sales people have
    //  the same name.
    //------------------------------------------
    @Override
    public boolean equals(Object other) {
        return (lastName.equals(((Salesperson)other).getLastName()) &&
                firstName.equals(((Salesperson)other).getFirstName()));
    }

    //--------------------------------------------------
    //  Order is based on total sales with the name
    //  (last, then first) breaking a tie.
    //--------------------------------------------------
    @Override
    public int compareTo(Object other) {
        int result;

        // Compare total sales first
        if (this.totalSales < ((Salesperson) other).getSales()) {
            result = -1;
        } else if (this.totalSales > ((Salesperson) other).getSales()) {
            result = 1;
        } else {
            // If total sales are the same, compare last names
            result = this.lastName.compareTo(((Salesperson) other).getLastName());

            // If last names are the same, compare first names
            if (result == 0) {
                result = this.firstName.compareTo(((Salesperson) other).getFirstName());
            }
        }

        return result;
    }


    //-------------------------
    //  First name accessor.
    //-------------------------
    public String getFirstName() {
        return firstName;
    }

    //-------------------------
    //  Last name accessor.
    //-------------------------
    public String getLastName() {
        return lastName;
    }

    //-------------------------
    //  Total sales accessor.
    //-------------------------
    public int getSales() {
        return totalSales;
    }
}
