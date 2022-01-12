public class Fuel {

    // Values used for fuelType
    public static final int    GAS      = 1;  // denotes a car that uses gas
    public static final int    ELECTRIC = 2;  // denotes a car that uses electricity

    // Values used to compute CO2 emission
    public static final double CO2EMITTED_GASCOMBUSTION = 8.887; // 8.887 kg of CO2 released with the combustion of each gallon of gasoline
    public static final double CO2EMITTED_ELECTRICITYCOMBUSTION = 0.453;   // 0.453 kg of CO2 are emitted to generate 1 kWh on average

    // Instance variables
    private int    type;        // GAS or ELECTRIC
    private double usage;       // miles the car can drive per gallon if fuelType is GAS, or
                                // miles the car can drive per kWh    if fuelType is ELECTRIC
    private double charger;

    // Constructor for gas-powered cars
    public Fuel (double usage) {
        this.type = GAS;
        this.usage = usage;
    }

    // Constructor for electric cars
    public Fuel (double usage, double charger) {
        this.type = ELECTRIC;
        this.usage = usage;
        this.charger = charger;
    }

    // Accessor methods
    public int getType () {
        return type;
    }
    public double getUsage () {
        return usage;
    }
    public double getCharger () {
        return charger;
    }

    // String representation of Fuel
    public String toString () {
        String str = "\nFuel";
        String fuel = (type == GAS) ? "Gas" : "Electric";
        str += "\n\tType: " + fuel;
        str += "\n\tUsage: " + usage;
        if (type == ELECTRIC) {
            str += "\n\tcharger: " + charger;
        }
        return str;
    }

    // Returns true if this object equals other, false otherwise
    public boolean equals (Object other) {

        if ( other == null || !(other instanceof Fuel) ) {
            return false;
        }
        Fuel o = (Fuel)other;
        return type == o.getType() && usage == o.getUsage();
    }
}