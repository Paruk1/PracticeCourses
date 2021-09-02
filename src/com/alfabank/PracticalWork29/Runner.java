package com.alfabank.PracticalWork29;

import java.util.*;

public class Runner {
    public void run(){
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            arrayList.add("number_" + i);
        }
        System.out.println(arrayList);

        LinkedList<String> linkedList = new LinkedList<>();
        Random random = new Random();
        int index;
        for(int i = 0; i < 10; i++){
            index = random.nextInt(linkedList.size()+1);
            linkedList.add(index,"num_" + i);
        }
        System.out.println(linkedList);

        ListIterator<String> iterator = arrayList.listIterator();
        while(iterator.hasNext()){
            iterator.next(); //перекинуть итератор в конец списка
        }
        for (int i = 0; iterator.hasPrevious(); i++){
            if(i % 2 == 0){
                linkedList.add(i, iterator.previous());
            }
        }
        System.out.println(linkedList);

    }
    public void run2(){
        MyNumGenerator myNumGenerator = new MyNumGenerator(10,10);
        List list = myNumGenerator.generateList();
        Set set = myNumGenerator.generateSet();
        System.out.println(list);
        System.out.println(set);

    }
    public void run3(){
        MyTranslator myTranslator = new MyTranslator();
        myTranslator.addPhrase("first","первый");
        myTranslator.addPhrase("second","второй");
        myTranslator.addPhrase("third","третий");
        translateWord("first",myTranslator);
        translateWord("first23",myTranslator);

    }

    public void translateWord(String word,MyTranslator myTranslator){
        HashMap<String,String> hashMap = myTranslator.getTranslator();
        Set<Map.Entry<String,String>> entrySet = hashMap.entrySet();

        Iterator<Map.Entry<String,String>> iterator = entrySet.iterator();
        int i = 0;
        while (iterator.hasNext()){
            if (iterator.next().getKey().equals(word.toLowerCase())){
                System.out.println(iterator.next().getValue());
                i++;
                break;
            }
        }
        if(i == 0){
            System.out.println("Такого слова в этом словаре не существует!");
        }
    }
}
