package lab3.Student;

import java.util.Objects;

public class Mark {
    private int value;

    public Mark(final int value)
    {
        this.value = value;
    }

    public void setValue(final int value) {
        if (value < 0 | value > 5)
            System.out.println("Error: wrong mark");
        else
            this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mark mark = (Mark) o;
        return value == mark.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
