public class Lease {

    // Instance variables
    private double dueAtSigning;        // dollar amount due at signing the lease
    private int    leaseLength;         // lease length in months
    private double monthlyCost;         // monthly lease cost
    private int mileageAllowance;       // mileage allowance per month

    // Constructor
    public Lease (double dueAtSigning, int leaseLength, double monthlyCost,int mileageAllowance) {
        this.dueAtSigning     = dueAtSigning;
        this.leaseLength      = leaseLength;
        this.monthlyCost      = monthlyCost;
        this.mileageAllowance = mileageAllowance;
    }

    // Accessor methods
    public double getDueAtSigning () {
        return dueAtSigning;
    }
    public int getLeaseLength () {
        return leaseLength;
    }
    public double getMonthlyCost () {
        return monthlyCost;
    }
    public double getMileageAllowance () {
        return mileageAllowance;
    }
    // String represenation of Lease
    public String toString () {
        String str = "\nLease";
        str += "\n\tDue at signing: " + dueAtSigning;
        str += "\n\tLease Length: " + leaseLength;
        str += "\n\tMontly cost: " + monthlyCost;
        str += "\n\tmileage allowance: " + mileageAllowance;
        return str;
    }

    // Returns true if this object equals other, false otherwise
    public boolean equals (Object other) {

        if ( other == null || !(other instanceof Lease) ) {
            return false;
        }
        Lease o = (Lease)other;
        return (dueAtSigning == o.getDueAtSigning() &&
            leaseLength == o.getLeaseLength() &&
            monthlyCost == o.getMonthlyCost() &&
            mileageAllowance == o.getMileageAllowance());
    }
}