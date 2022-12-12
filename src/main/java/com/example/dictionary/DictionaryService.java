package com.example.dictionary;

import java.util.HashMap;
import java.util.List;

public class DictionaryService {
    private static HashMap<String,String> hashMap;
    static {
        hashMap.put("banana","chuối");
        hashMap.put("age","Tuổi");
        hashMap.put("name","Tên");
    }
    public String searchByName(String dictionary){
        return hashMap.get(dictionary);
    }
}
