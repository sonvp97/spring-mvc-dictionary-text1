package com.example.controller;

import com.example.dictionary.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class DictionaryServlet{

    @GetMapping("/Dictionary")
    public String showList(){
        return "index";
    }
    @GetMapping("/Result")
    public String result(@RequestParam String english, Model model){
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("banana","chuối");
        hashMap.put("age","Tuổi");
        hashMap.put("name","Tên");
        String s = hashMap.get(english);
        if (s == null){
            s = "Không tìm thấy";
        }
        model.addAttribute("dictionary",s);
        model.addAttribute("english",english);
        return "result";
    }
}
