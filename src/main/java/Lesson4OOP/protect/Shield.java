package Lesson4OOP.protect;

public class Shield implements Protection {
    @Override
    public int protect() {
       return 5;
    }

    public String toString() {
        return String.format("Shield: %d ", protect());
    }
}
