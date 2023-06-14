package Lesson3OOP;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Personal implements Iterable<User>{
    List<User> users = new ArrayList<>();

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            int i = 0;
            @Override
            public boolean hasNext() {
                return i < users.size();
            }
            @Override
            public User next() {
                return users.get(i++);
            }
        };
    }

    public int size(){
        return users.size();
    }

    public Personal addUser(User user){
        users.add(user);
        return this;
    }

    public List<User> getListOfUsers(){
        List<User> listOfUsers = new ArrayList<>(users);
        return listOfUsers;
    }
}
