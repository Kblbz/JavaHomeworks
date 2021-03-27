/**
 * 7. Given a user's email address: john_smith@example.com. Create two strings "login" and "domain" which will be
 *    substrings of full email address.
 *    The First Name and Last Name of the user should be in the following format: "Name Surname".
 */


public class EmailSubStrings {
    public static void main(String[] args) {
        String s = "john_smith@example.com";
        int index = s.indexOf('@');

        int length = s.length();
        String b = s.substring((index+1), length);

        String a = s.substring(0, index);
        int index1 = a.indexOf('_');
        int length1 = a.length();

        String c = a.substring(0, index1);
        String d = a.substring((index1+1), length1);
        String e = String.join (" ", (c.substring(0,1).toUpperCase() + c.substring(1)), (d.substring(0,1).toUpperCase() + d.substring(1)));
        System.out.println(b);
        System.out.println(e);
    }
}


