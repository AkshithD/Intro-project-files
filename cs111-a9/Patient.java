
/**
 * 
 * Patient class represents a patient with a heart disease either 
 * waiting for a heart transplant surgery or that hava already undergone
 * surgery.
 * 
 * @author Ana Paula Centeno
 * @author Haolin (Daniel) Jin
 */

public class  Patient {
    //Heart Condition Cause Code 
    public static final int CAUSE_VIRAL                = 0;
    public static final int CAUSE_CONGENITAL           = 1;
    public static final int CAUSE_ACCIDENT             = 2;
    public static final int CAUSE_HEART_ARTERY_DISEASE = 3;
    public static final int CAUSE_HEART_MUSCLE_DISEASE = 4; 
    
    // State Of Health Code. Health is independent of heart.
    public static final int HEALTH_POOR                = 5;
    public static final int HEALTH_GOOD                = 6;
    public static final int HEALTH_EXCELLENT           = 7;
    
    // Urgency Code
    public static final int URGENCY_EXTREME            = 8;
    public static final int URGENCY_MODERATE           = 9;

    // Ethnicity Code
    public static final int ETHNICITY_AFRICAN_AMERICAN = 10;
    public static final int ETHNICITY_CAUCASIAN        = 11;
    public static final int ETHNICITY_HISPANIC         = 12;
    
    // Gender Code
    public static final int GENDER_FEMALE               = 13;
    public static final int GENDER_MALE                 = 14;
    public static final int OTHER                       = 15;

    // Condition after 3 years post transplant
    public static final int POST_TRANSPLANT_CONDITION_DEAD       = 16;
    public static final int POST_TRANSPLANT_CONDITION_DOING_WELL = 17;
    public static final int POST_TRANSPLANT_CONDITION_EXCELLENT  = 18;

    // Instance variables or fields
    private int id;             // unique identification of the person
    private int ethnicity;      // integer between [10, 12] representing the ethnicity of the patient 
    private int gender;         // integer between [13, 15] representing the gender of the patient
    private int age;            // integer representing the age of the patient
    private int cause;          // integer between [0, 4] representing the cause of condition
    private int stateOfHealth;  // integer between [5, 7] representing the current state of health
    private int urgency;        // integer between [8, 9] representing the urgency of the patient, higher integer meaning more urgent.
    private boolean needHeart;  // boolean representing if the patient is still waiting for a heart fo transplant, 
                                // if true, the patient is still waiting for a heart for transplant,
                                // if false, the patient no longer need a heart for transplant

    /*
     * Constructor
     * needHeart is default to true
     */
    public Patient (int id, int ethnicity, int gender, int age, int cause, int urgency, int stateOfHealth) {
        this.id = id; 
        this.ethnicity = ethnicity;
        this.gender = gender;
        this.age = age;
        this.cause = cause;
        this.urgency = urgency;
        this.stateOfHealth = stateOfHealth;
        this.needHeart = true;
    }

    /*
     * Returns the Patient's age
     */
    public int getAge() {
        return age;
    }

    /*
     * Returns the Patient's ethinicity
     */
    public int getEthnicity() {
        return ethnicity;
    }

    /*
     * Returns the Patient's gender
     */
    public int getGender() {
        return gender;
    }

    /*
     * Returns the Patient's cause for the heart condition
     */
    public int getCause() {
        return cause;
    }

    /*
     * Returns the Patient's urgency for the transplant
     */
    public int getUrgency() {
        return urgency;
    }

    /*
     * Returns the Patient's state of health
     */
    public int getStateOfHealth() {
        return stateOfHealth;
    }

    /*
     * Returns boolean for if the Patient is still waiting for a heart
     */
    public boolean getNeedHeart() {
        return needHeart;
    }

    /*
     * Set needHeart's status 
     */
    public void setNeedHeart(boolean needHeart){
        this.needHeart = needHeart;
    }

    /*
     * returns true if current object stores the same value as other
     */
    public boolean equals (Object other) {

        if ( other == null || !(other instanceof Patient)) {
            return false;
        }
        Patient o = (Patient) other;

        return (
            id == o.id && 
            age == o.age && 
            ethnicity == o.ethnicity && 
            gender == o.gender && 
            cause == o.cause &&
            urgency == o.urgency &&
            stateOfHealth == o.stateOfHealth && 
            needHeart == o.needHeart
            );
    }

    /*
     * Returns the string representation of the Patient
     */
    public String toString() {

        String ret = "" + id;
       
        if (ethnicity == ETHNICITY_AFRICAN_AMERICAN) {
            ret += ", african american";
        } else if (ethnicity == ETHNICITY_CAUCASIAN) {
            ret += ", caucasian";
        } else {
            ret += ", hispanic";
        }

        if (gender == GENDER_FEMALE){
            ret += ", female";
        } else if(gender == GENDER_MALE){
            ret += ", male";
        }else{
            ret += ", other";
        }

        ret += ", " + age;

        if (cause == CAUSE_ACCIDENT) {
            ret += ", accident";
        } else if ( cause == CAUSE_CONGENITAL) {
            ret += ", congenital";
        } else if ( cause == CAUSE_HEART_ARTERY_DISEASE) {
            ret += ", heart artery disease";
        } else if ( cause == CAUSE_HEART_MUSCLE_DISEASE) {
            ret += ", heart muscle disease";
        } else {
            ret += ", viral";
        }

        if (urgency == URGENCY_EXTREME) {
            ret += ", extreme";
        } else {
            ret += ", moderate";
        }

        if (stateOfHealth == HEALTH_EXCELLENT) {
            ret += ", excellent";
        } else if (stateOfHealth == HEALTH_GOOD) {
            ret += ", good";
        } else {
            ret += ", poor";
        }
        if( needHeart ){
            ret += ", waiting for heart for transplant";
        }else{
            ret += ", has heart for transplant";
        }

        return ret;
    }
}