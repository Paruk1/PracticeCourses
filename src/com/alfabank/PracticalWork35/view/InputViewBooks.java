package com.alfabank.PracticalWork35.view;

import java.util.Scanner;

public class InputViewBooks {
    private Scanner scanner = new Scanner(System.in);

    public String inputCommand(){
        return scanner.nextLine();
    }

    public String inputBook(){
        return scanner.nextLine();
    }
    public String findAuthor(){
        return scanner.nextLine();
    }
    public Integer findYear(){
        return scanner.nextInt();
    }
    public String findPublisher(){
        return scanner.nextLine();
    }
    public Double inputProcents(){
        return scanner.nextDouble();
    }
}
