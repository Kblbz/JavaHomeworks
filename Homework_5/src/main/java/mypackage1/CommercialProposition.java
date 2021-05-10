/**
 * 5) Answer the question: What is a private access? Create a simple program to demonstrate the private access.
 * Tips:
 *  - Create two classes
 *  - In on of them create private members
 *  - In the second class create an object of the first class
 *  - Try to access the private members
 */

/**
 * 8) Create a new class. Add 5 private fields. Add getter and setters to all the fields.
 */

package mypackage1;

public class CommercialProposition {
    public static void main(String[] args) {
        RateParametrers rateParametrers = new RateParametrers();
        rateParametrers.getCostPerKm();
        rateParametrers.setCostPerKm(60);
        rateParametrers.getCostPerKm();
        rateParametrers.transportationCost(80, 632, 0);
        rateParametrers.getCostPerKm();
    }
}
