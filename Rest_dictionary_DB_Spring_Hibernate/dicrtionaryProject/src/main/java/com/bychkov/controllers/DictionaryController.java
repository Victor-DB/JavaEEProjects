package com.bychkov.controllers;

import com.bychkov.domain.Dictionary;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DictionaryController {

    public Map<String, String> map = new HashMap<String, String>() {
        {
            put("go", "идти");
            put("smile", "улыбка");
            put("fire", "гореть");
            put("sun", "солнце");
            put("green", "зеленый");
            put("wood", "лес");
        }
    };

    @GetMapping
    public String dictionary(){
        return "view.jsp";
    }

    @GetMapping("/interpreter")
    public ModelAndView asdf(HttpServletRequest request, HttpServletResponse response){
        String phrase = request.getParameter("inputWords");
        String interpreter = map.get(phrase);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("view.jsp");
        modelAndView.addObject("outputWords",interpreter);
        return modelAndView;
    }
}
