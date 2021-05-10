/**
 * 6) Create a new class. Make it impossible to create a new object of this class using a constructor.
 * Provide an appropriate public method that will allow clients of your class create a new object.
 */

package mypackage1;

public class SecretRecipe {
    int secretIngridient1;
    double secretIngridient2;
    double secretIngridient3;

    private SecretRecipe() {

    }

    public static SecretRecipe makeNewSecretRecipe (int secretIngridient1, double secretIngridient2, double secretIngridient3) {
        System.out.println("New secret recipe is created");
        return new SecretRecipe();
    }

    public void sellSecretRecipe() {
        System.out.println("We can't sell you this secret recipe");
    }
}