import java.util.ArrayList;

/*
 * Given patient's disease cause, this class represents the average survivability of patients post transplant.
 */
public class SurvivabilityByCause {

    // Example for cause = 4, years = 1, rate = 89.4
    // 1 year after the transplant patients which had heart muscle disease as
    // the condition cause have a survivability rate of 89.4% 
    private int dataSize;
    private ArrayList<Integer>  causes;
    private ArrayList<Integer>  years;
    private ArrayList<Double>   rates;

    public SurvivabilityByCause() {
        dataSize = 0;
        this.causes  = new ArrayList<Integer>();
        this.years  = new ArrayList<Integer>();
        this.rates  = new ArrayList<Double> ();
    }

    /*
     * Returns rate, returns -1.0 if not found
     */
    public double getRate(int cause, int year) {
        
        for(int i = 0; i < causes.size(); i++) {
            if( causes.get(i)==cause && years.get(i)==year ) {
                return rates.get(i);
            }
        }

        return -1.0;
    }

    /*
     * Returns dataSize
     */
    public double getDataSize() {
        return dataSize;
    }

    /*`
     * add the survivability rate relating to cause and number of years after the transplant to the object
     * can only be accessed by using getData() method in the future.
     */
    public void addData(int cause, int year, double rate) {
        causes.add(cause);
        years.add(year);
        rates.add(rate);
        dataSize++;
    }

    private static String causeToString(int cause){
        switch (cause) {
            case Patient.CAUSE_VIRAL:
            return "viral";

            case Patient.CAUSE_CONGENITAL:
            return "congenital";
            
            case Patient.CAUSE_ACCIDENT:
            return "accident";

            case Patient.CAUSE_HEART_ARTERY_DISEASE:
            return "heart artery disease";

            case Patient.CAUSE_HEART_MUSCLE_DISEASE:
            return "heart muscle disease";

            default:
            return "NO MATCH";
        }
    }
    /*
     * Returns the string representation
     */
    public String toString(int cause, int year) {
        String ret = causeToString(cause);
        double rate = getRate(cause, year);

        if( rate == -1) return "NF";
        return ret + ", " + years + ", " + rate;
    }

    public void printAllData(){
        for (int i = 0; i < causes.size(); i++) {
            StdOut.println( "after " + years.get(i) + " years, patients caused by "+causeToString(causes.get(i)) + " has a survival rate of " + rates.get(i) );
        }
    }
}