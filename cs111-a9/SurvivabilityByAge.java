import java.util.ArrayList;

/*
 * Given patient's age, this class represents the average survivability of patients post transplant.
 */
public class SurvivabilityByAge {

    // Example for age = 50, years = 5, rate = 74.7
    // 5 years after the transplant patients with age less 
    // than 50 years old have a survivability rate of 74.7%
    private int dataSize;
    private ArrayList<Integer>  ages;       // patients with age less than age
    private ArrayList<Integer>  years;      // years post transplant
    private ArrayList<Double>   rates;      // survival rate

    public SurvivabilityByAge() {
        dataSize = 0;
        this.ages   = new ArrayList<Integer>();
        this.years  = new ArrayList<Integer>();
        this.rates  = new ArrayList<Double> ();
    }


    /*
     * Returns dataSize
     */
    public double getDataSize() {
        
        return dataSize;
    }


    /*
     * Returns rate of survivability with given age and years post transplant, 
     * returns -1.0 if not found
     */
    public double getRate(int age, int year) {
        for (int i = 0; i < ages.size(); i++) {
            if( ages.get(i)==age && years.get(i)==year ) {
                return rates.get(i);
            }
        }
        return -1.0;
    }


    /*
     * add the survivability rate relating to age and number of years after the transplant to the object
     * can be accessed by using getData() method in the future.
     */
    public void addData(int age, int year, double rate) {
        ages.add(age);
        years.add(year);
        rates.add(rate);
        dataSize++;
    }


    /*
     * prints out all data, (for testing purpose only)
     */
    public void printAllData() {
        for (int i = 0; i < ages.size(); i++) {
            StdOut.println( "At age " + ages.get(i) + " the survivability is " + rates.get(i) + " after " + years.get(i) +" years." );
        }
    }

    /*
     * Returns the string representation of the survivability at a age after y years.
     * returns "NE" if not found
     */
    public String toString(int a, int y) {
        for (int i = 0; i < ages.size(); i++) {
            if( ages.get(i) == a && years.get(i) == y ) {
                return "At age " + a + " the survivability is " + rates.get(i) + " after " + y +" years.";
            }
        }
        return "NF";
    }
}