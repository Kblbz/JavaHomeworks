/**
 * 5. Create a simple class with a bunch of constructors.
 * All these constructors should take different number of parameters.
 * Demonstrate in your class, how we can call one constructor from another
 */

public class Client {
    String firstName;
    String lastName;
    String city;
    int age;

    public Client (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Client's full name: first name and last name");
    }

    public Client (String firstName, String lastName, String city) {
        this(firstName, lastName);
        this.city = city;
        System.out.println("Client's full name & city");
    }

    public Client (String firstName, String lastName, String city, int age) {
        this(firstName, lastName, city);
        this.age = age;
        System.out.println("Client's full name, city & age");
    }
}


