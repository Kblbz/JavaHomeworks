/**
 * 9) What is the difference between static and non-static field of a class?
 */
/**
 * A static variable is also called a class variable and is common across the objects of the class and this variable
 * can be accessed using class name as well.
 *
 * Access
 * A static variable can be accessed by static members as well as non-static member functions.
 * A non-static variable can not be accessed by static member functions.
 *
 * Sharing
 * A static variable acts as a global variable and is shared among all the objects of the class.
 * A non-static variables are specific to instance object in which they are created.
 *
 * Memory allocation
 * Static variables occupies less space and memory allocation happens once.
 * A non-static variable may occupy more space. Memory allocation may happen at run time.
 *
 * Keyword
 * A static variable is declared using static keyword.
 * A normal variable is not required to have any special keyword.
 */
/**
 * Create an example to demonstrate this concept.
 */

public class Student {
    static String college = "MTI";
    static int nextId = 0;
    private int id = 0;
    public String studentName;
    public String course;

    {
        id = nextId;
        nextId++;
    }

    public Student(String studentName, String course) {
        this.studentName = studentName;
        this.course = course;
    }

    public void displayRecord() {
        System.out.println("[" + id + ", " + studentName + ", " + college + ", " + course + "]");
    }

    public int getId() {
        return this.id;
    }

    public static void main(String[] args) {
        Student morgan = new Student("Mark Morgan", "Mathematics");
        System.out.println(morgan.studentName + " id: " + morgan.getId());
        morgan.displayRecord();
        System.out.println("Next id: " + Student.nextId);

        System.out.println("");

        Student cho = new Student("Emma Cho", "Architecture");
        System.out.println(cho.studentName + " id: " + cho.getId());
        cho.displayRecord();
        System.out.println("Next id: " + Student.nextId);
    }
}