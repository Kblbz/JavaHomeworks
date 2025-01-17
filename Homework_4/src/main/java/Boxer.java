/**
 * 2. Implement the method fight() depending on weight, strength and age of the boxer:
 * You should write the dependency by yourself. The method should return true or false if our boxer won or lost.
 *
 * Requirements:
 * a) if ourBoxer.fight(anotherBoxer) returns true, then anotherBoxer.fight(outBoxer) should return false;
 */


public class Boxer {
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        boolean fightResult;
        if (anotherBoxer.weight * anotherBoxer.strength / anotherBoxer.age < this.weight * this.strength / this.age) {
            System.out.println(fightResult = true);
        } else {
            System.out.println(fightResult = false);
        }
        return fightResult;
    }


    public static void main(String[] args) {
        Boxer ourBoxer = new Boxer(25, 85, 15);
        Boxer anotherBoxer = new Boxer(31, 90, 17);
        ourBoxer.fight(anotherBoxer);
        anotherBoxer.fight(ourBoxer);
    }
}