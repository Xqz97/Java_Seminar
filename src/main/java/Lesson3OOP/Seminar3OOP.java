package Lesson3OOP;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Seminar3OOP {
    public static void main(String[] args) {
        Personal personal1 = new Personal().addUser(new User("Roman", "Tusutov", 35))
                .addUser(new User("Kate", "Middltown", 28))
                .addUser(new User("Andro", "Andronov", 42));

        for (User i: personal1) {
            System.out.println(i);
        }

        Personal personal2 = new Personal().addUser(new User("Tanya", "Ivanova", 18));
        User user1 = new User("Nina", "Kox", 98);
        user1.setSubordinate(personal1);
        personal2.addUser(user1);
        User boss1 = new User("Boss", "Big", 37);
        boss1.setSubordinate(personal2);

        List<User> sortUser = personal1.getListOfUsers();
        Collections.sort(sortUser);
        System.out.println(sortUser);
        System.out.println("--- Иерархия компании ---");
        Company company1 = new Company(boss1);
        for (User i: company1) {
            System.out.println(i);
        }
    }
}
