/*7. In the Example class, implement a couple of equals / hashCode methods in accordance with the rules for implementing
        these methods (check details with your favorite search engine).
        Both the first and last strings should participate in the comparison using the equals method and the hashcode calculation.*/

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Example {
    private final String first, last;

    public Example(String first, String last) {
        this.first = first;
        this.last = last;
    }

    @Override
    public boolean equals(final Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (getClass() != o.getClass())return false;
        Example example = (Example) o;

        return this.first == example.first && this.last == example.last;
    }

    @Override
    public int hashCode() {
        return Objects.hash(11*first.hashCode() + 37*last.hashCode());
    }

    public static void main(String[] args) {
        Set<Example> s = new HashSet<>();
        s.add(new Example("Donald", "Duck"));
        System.out.println(s.contains(new Example("Donald", "Duck")));
    }
}
