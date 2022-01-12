
/**
 * 
 * HeartTransplantDriver
 * 
 * Use this class to test HeartTransplant's methods.
 * 
 * @author Haolin (Daniel) Jin
 */

public class HeartTransplantDriver {
	    public static void main (String[] args) {

        HeartTransplant ht = new HeartTransplant();

        // Initialize Patients.
        int numberOfLines = StdIn.readInt();
        ht.readPatients(numberOfLines);
        StdOut.println(ht.getPatients().length + " patients read from file.");
 
        // Initialize SurvivabilityByAge.
        numberOfLines = StdIn.readInt();
        ht.readSurvivabilityByAge(numberOfLines);
        StdOut.println(ht.getSurvivabilityByAge().getDataSize() + " survivability rates by age lines read from file.");

        // Initialize SurvivabilityByCause.
        numberOfLines = StdIn.readInt();
        ht.readSurvivabilityByCause(numberOfLines);
        StdOut.println(ht.getSurvivabilityByCause().getDataSize() + " survivability rates by cause lines read from file.\n");

        // Prints all patients.
        StdOut.println("ALL patients: ");
        for (Patient p : ht.getPatients()) {   
            StdOut.println(p);
        }
        StdOut.println();

        // Prints survivability by age data.
        StdOut.println("Survivability By Age: ");
        ht.getSurvivabilityByAge().printAllData();
        StdOut.println();

        // Prints survivability by cause data.
        StdOut.println("Survivability By Cause: ");
        ht.getSurvivabilityByCause().printAllData();
        StdOut.println();

        // Prints all patients with age above 18.
        StdOut.println("Patients above age 90: "); 
        Patient patientsByAge[] = ht.getPatientsWithAgeAbove(90);
        for (Patient p : patientsByAge ) {   
            StdOut.println(p.toString() );
        }
        StdOut.println();

        // Prints all patients whose heart disease was caused by accident.
        StdOut.println("Patients whose heart disease was caused by accidents: ");
        Patient patientsByCause[] = ht.getPatientsByHeartConditionCause(Patient.CAUSE_ACCIDENT);
        for (Patient p : patientsByCause) {
            StdOut.println(p.toString() );
        }
        StdOut.println();

        // Prints 4 patients with the highest likelihood of survival post transplant.
        StdOut.println("TOP 4 PATIENTS with highest potential for survivability: ");
        for( int i = 0; i < 4; i++) {
            StdOut.println( ht.getPatientForTransplant().toString() );
        }
    }
}