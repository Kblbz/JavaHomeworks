import java.util.HashMap;
import java.util.Map;


public class ChameleonCar extends Car {


    public ChameleonCar() {
        super("Chameleon", "Huge");

    }

    public void changeOuterColor(String mood) {
        switch (mood) {
            case "Sunny":
                System.out.println("Changing color to Yellow");
                break;
            case "Spring":
                System.out.println("Changing color to Emerald green");
                break;
            case "Ocean":
                System.out.println("Changing color to Wavy blue");
                break;
            case "Naughty":
                System.out.println("Changing color to Rainbow");
                break;
            default:
                System.out.println("Silver color");
                break;
        }
    }




}
