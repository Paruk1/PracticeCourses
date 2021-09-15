package com.alfabank.PracticalWork32.work3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public void run(){
        File file = new File("D:\\Intern\\PracticeCourses\\src\\users.txt");
        User[] users = createUsers();


        try(ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream(file));
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            for (User element: users) {
                ous.writeObject(element);
                element = null;
            }
            User user;
            while((user = (User)ois.readObject()) != null){
                System.out.println(user);
            }
        } catch (EOFException e){
        } catch (IOException | ClassNotFoundException ioException) {
            ioException.printStackTrace();
        }
    }

    public User[] createUsers() {
        return new User[] {
                new User("Andrey","Parail",19),
                new User("Sasha","Pozenko",21),
                new User("Diana","Vasilenko",22)
        };
    }


}