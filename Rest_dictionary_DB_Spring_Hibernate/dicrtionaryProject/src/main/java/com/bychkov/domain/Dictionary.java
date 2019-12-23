package com.bychkov.domain;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Dictionary {
    private String engWord;
    private ArrayList<String> ruWords = new ArrayList<>();

    public Dictionary(String eng, String ru){
        engWord = eng;

        ruWords.add(ru);
    }

    public void addWord(String ru){
        ruWords.add(ru);
    }

    @Override
    public String toString() {
        return ruWords.toString();
    }
}
