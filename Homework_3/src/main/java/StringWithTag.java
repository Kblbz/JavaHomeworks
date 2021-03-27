/**
 * 3. The web is built with HTML strings like "<i>Hello</i>" which draws Hello as italic text. In this example, the "i" tag
 * makes <i> and </i> which surround the word "Hello".
 * Given a tag and a word string, create the HTML string with tags around the word, e.g. "<i>Hello</i>".
 *
 * Task: word = Welcome to Java World, tag=p
 *
 * For example:
 * tag=h1, words=Java Tutorials -> <h1>Java Tutorials</h1>
 */

public class StringWithTag {
    public static void main(String[] args) {
        String word = "Welcome to Java World";
        StringBuilder htmlBuilder = new StringBuilder();
        htmlBuilder.append("<p>");
        htmlBuilder.append(word);
        htmlBuilder.append("</p>");
        String s = htmlBuilder.toString();
        System.out.println(s);
    }
}