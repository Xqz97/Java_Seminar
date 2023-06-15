package Lesson3OOP;

public class User implements Comparable<User>{
    private String firstName;
    private String lastName;
    private int age;

    private Personal subordinate;

    public void setSubordinate(Personal subordinate) {
        this.subordinate = subordinate;
    }

    public Personal getSubordinate() {
        return subordinate;
    }

    public User(String thirstName, String lastName, int age) {
        this.firstName = thirstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("\nFirst Name: %s, Last Name: %s, Age: %d", firstName, lastName, age);
    }

    @Override
    public int compareTo(User o) {
        int compareFirstNames = this.firstName.compareTo(o.firstName);
        if (compareFirstNames != 0) return compareFirstNames;
        int compareLastNames = this.lastName.compareTo(o.lastName);
        if (compareLastNames != 0) return compareLastNames;
        return this.age - o.age;
    }
//  return this.age - o.age;

//    @Override
//    public int compareTo(User o) {
//        if (this.age < o.age) {
//            return -1;
//        } else if (this.age > o.age) {
//            return 1;
//        }
//        return 0;
//    }


}
