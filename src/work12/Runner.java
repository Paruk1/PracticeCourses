package work12;

import java.util.Scanner;

public class Runner {

    public void run(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите кол-во элементов ряда");
        System.out.println("Pi = " + MyCalculate.calcPi(scanner.nextInt()));
    }
}
