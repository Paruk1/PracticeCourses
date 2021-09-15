package com.alfabank.PracticalWork31;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Arrays;


public class Runner {
    public void run(String[] args){
        if(args.length < 1){
            System.out.println("Пустой путь!");
        }else if(!Files.isDirectory(Paths.get(args[0]))){
            System.out.println("Этот путь указывает не на директорию!");
        }else{
            printDirectory(args[0]);
        }

    }
    private void printDirectory(String arg) {
        File file = new File(arg);

        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
    }

    public void run2(String[] args){
        if(args.length < 1){
            System.out.println("Пустой путь!");
        }
        Path path = Paths.get(args[0]);
        if(!Files.isDirectory(path.getParent())){
            System.out.println("Этот путь не имеет директории");
        }else{
            try{
                takeInfoFromFile(args[0]);
            }catch (IOException ex){
                ex.getCause();
            }
        }
    }
    private void takeInfoFromFile(String arg) throws IOException {
        FileInputStream fis = new FileInputStream(arg);
        int i;
        while((i = fis.read()) != -1){
            System.out.print((char)i);
        }
        fis.close();
    }

    public void run3(){
        try{
            AccountingUser user = new AccountingUser();
            user.printFile();
            user.addUser("Krisa");
            user.addUser("Oleksey");
            user.addUser("Oleksandr");
            user.finalizing();
        }catch (IOException ioException){
            System.out.println("ОШИБКА!");
        }
    }

}

class AccountingUser{
    private RandomAccessFile file;

    public AccountingUser() throws FileNotFoundException {
        this.file = new RandomAccessFile("D:\\Intern\\PracticeCourses\\src\\users.txt","rw");
        System.out.println("Файл открыт для чтения!");
    }

    public void addUser(String name) throws IOException {
        file.seek(0);
        String line;
        String[] array_info;
        long point = 0;
        while((line = file.readLine()) != null){
            array_info = line.trim().split(":");
            if (array_info[0].equalsIgnoreCase(name)) {
                int number = Integer.parseInt(array_info[1]);
                number++;
                file.seek(point);
                file.writeBytes(line.replace(array_info[1],Integer.toString(number)));
                return;
            }
            point = file.getFilePointer();
        }
        file.writeBytes("\n" + name + ":1");
    }

    public void printFile() throws IOException {
        String line;
        while((line = file.readLine()) != null){
            System.out.println(line);
        }
    }

    public void finalizing() throws IOException {
        file.close();
        System.out.println("Файл закрыт!");
    }
}
