package com.alfabank.PracticalWork32.work1;

import java.io.*;


public class Runner {
    public void run() {
        File file = new File("D:\\Intern\\PracticeCourses\\src\\employee.txt");
        Employee employee = new Employee("Andrey","Golosievo 11",123456789,1000);

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))){
            oos.writeObject(employee);
            System.out.println("Объект занесён в файл!");
            employee = null;
            Employee employee1 = (Employee)ois.readObject();
            System.out.println(employee1);
        }catch(IOException | ClassNotFoundException ex){
            System.out.println("Ошибка!");
        }
    }
}
