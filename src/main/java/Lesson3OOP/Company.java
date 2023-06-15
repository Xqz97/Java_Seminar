package Lesson3OOP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company implements Iterable<User> {
    private User user;

    public Company(User user) {
        this.user = user;
    }

    private List<User> deepTree(User i) {
        List<User> subordinatesOfUser = new ArrayList<>();
        subordinatesOfUser.add(i);
        if (i.getSubordinate() == null || i.getSubordinate().size() == 0) {
            return subordinatesOfUser;
        }
        for (User j : i.getSubordinate()) {
            subordinatesOfUser.addAll(deepTree(j));
        }
        return subordinatesOfUser;
    }

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            List<User> iterUser = deepTree(user);
            Iterator<User> iterator = iterUser.iterator();
            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }
            @Override
            public User next() {
                return iterator.next();
            }
        };
    }
}
