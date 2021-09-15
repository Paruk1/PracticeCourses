package com.alfabank.PracticalWork32.work2;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Runner {
    public void run(){
        File file = new File("D:\\Intern\\PracticeCourses\\src\\users.txt");
        User user = new User("Andrey","Parail",19);
        User user1 = new User("Andrey","Parail",189);
        addUser(user,file);
        addUser(user1,file);
        print(file);
    }
    public void addUser(User user, File file){
        try(RandomAccessFile raf = new RandomAccessFile(file,"rw")) {
            long endPoint = raf.length();
            raf.seek(endPoint);
            raf.writeBytes(user.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void print(File file){
        try(RandomAccessFile raf = new RandomAccessFile(file,"rw")){
            String line;
            while((line = raf.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
