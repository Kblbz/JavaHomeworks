/**
 * 1. Create a class "Human". A human should have the following attributes: weight, age, first name, last name, height.
 * Requirements:
 * a) Create a class Human with all the required fields to store the information (variable types you could choose by yourself).
 * b) Add to the class a constructor with parameters which initialize all the fields.
 */

public class Human {

    String firstName;
    String lastName;
    int height;
    int weight;
    int age;

    public Human (String firstName, String lastName, int height, int weight, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
        this.age = age;
    }
}
