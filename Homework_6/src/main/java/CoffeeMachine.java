public class CoffeeMachine {
    public CoffeeGrinder coffeeGrinder = new CoffeeGrinder();
    public HeatingUnit heatingUnit = new HeatingUnit();
    public int quantityWater;

    public CoffeeMachine (CoffeeGrinder coffeeGrind, HeatingUnit heatingUn) {
        this.coffeeGrinder = coffeeGrind;
        this.heatingUnit = heatingUn;
        this.quantityWater = quantityWater;
    }

    public void grindCoffee() {
        coffeeGrinder.grind(10.0, "fine");
    }

    public void heatWater () {
        heatingUnit.heat(95);
    }

    public void brewCoffee (int quantityWater) {
        System.out.println("Portion of coffee is brewed with "+ quantityWater +" millilitres of water");
    }

}


