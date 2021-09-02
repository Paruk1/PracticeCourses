package com.alfabank.PracticalWork29;

import java.util.HashMap;

public class MyTranslator {
    private HashMap<String,String> translator;

    public HashMap<String, String> getTranslator() {
        return translator;
    }
    public void setTranslator(HashMap<String, String> translator) {
        this.translator = translator;
    }
    public MyTranslator() {
        translator = new HashMap<>();
    }

    public void addPhrase(String englishWord,String russianWord){
        translator.put(englishWord,russianWord);
    }
}
