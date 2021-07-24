package work12;

import java.util.Scanner;

public class Runner {

    public void run() {

        Employee employee = new Employee();
        Employee employee1 = new Employee("Parail","Andriy");
        Employee employee2 = new Employee("Pozenko","Sasha");

        System.out.println(Employee.getNumberOfEmployees());

    }
}
