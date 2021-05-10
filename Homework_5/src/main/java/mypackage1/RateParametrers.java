/**
 * 5) Answer the question: What is a private access? Create a simple program to demonstrate the private access.
 * Tips:
 *  - Create two classes
 *  - In on of them create private members
 *  - In the second class create an object of the first class
 *  - Try to access the private members
 *
 *
 *  The private keyword is an access modifier used for attributes, methods and constructors, making them only accessible
 *  within the declared class.
 */

/**
 * 8) Create a new class. Add 5 private fields. Add getter and setters to all the fields.
 */

package mypackage1;

public class RateParametrers {
    private int loadFactor;
    private double rateIndex;
    private double costPerKm;
    private double distance;
    private double discount;

    public RateParametrers() {
        this.loadFactor = 6;
        this.rateIndex = 1.2;
        this.costPerKm = 100.0;
        this.distance = distance;
        this.discount = discount;
    }

    public int getLoadFactor() {
        System.out.println("Current load factor is " + loadFactor);
        return loadFactor;
    }

    public double getRateIndex() {
        System.out.println("Current rate index is " + rateIndex);
        return rateIndex;
    }

    public double getCostPerKm() {
        System.out.println("Current cost per km is " + costPerKm + " UAH");
        return costPerKm;
    }

    public double getDistance() {
        System.out.println("Current distance is " + distance + " km");
        return distance;
    }

    public double getDiscount() {
        System.out.println("Current discount is " + discount*100 + "%");
        return discount;
    }

    public void setLoadFactor(int newLoadFactor) {
        if (newLoadFactor >=1 && newLoadFactor <=8) {
            this.loadFactor = loadFactor;
            System.out.println("New load factor: " +  newLoadFactor);
        } else {
            throw new IllegalArgumentException("The value " + newLoadFactor + " is incorrect. Please, " +
                    "provide a value between 1 and 8");
        }
    }

    public void setRateIndex(double newRateIndex) {
        if (newRateIndex >=1 && newRateIndex <=4) {
            this.rateIndex = rateIndex;
            System.out.println("New rate index: " +  newRateIndex);
        } else {
            throw new IllegalArgumentException("The value " + newRateIndex + " is incorrect. Please, " +
                    "provide a value between 1 and 4");
        }
    }

    public void setCostPerKm (double newCostPerKm) {
        if (newCostPerKm >=50) {
            this.costPerKm = costPerKm;
            System.out.println("New cost per km: " + newCostPerKm + " UAH");
        } else {
            throw new IllegalArgumentException("The value " + newCostPerKm + " is incorrect. Please, " +
                    "provide a value more than 50");
        }
    }

    public void setDistance (double newDistance) {
        if (newDistance >=100) {
            this.distance = distance;
            System.out.println("New cost per km: " + newDistance + " km");
        } else {
            throw new IllegalArgumentException("The value " + newDistance + " is incorrect. Please, " +
                    "provide a value more than 100");
        }
    }

    public void setDiscount (double newDiscount) {
        if (newDiscount >=0.0 && newDiscount <=0.2) {
            this.discount = discount;
            System.out.println("New discount: " + newDiscount*100 + "%");
        } else {
            throw new IllegalArgumentException("The value " + newDiscount + " is incorrect. Please, " +
                    "provide a value between 0.0 and 0.2");
        }
    }

    public void transportationCost(/**int loadFactor, double rateIndex, */double costPerKm, double distance, double discount) {
        System.out.println("Transportation cost: " + costPerKm * distance * (1-discount) + " UAH");
    }
}