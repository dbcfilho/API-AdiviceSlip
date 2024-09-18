package com.example.adviceapi.controller;

import com.example.adviceapi.service.AdviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdviceController {

    @Autowired
    private AdviceService adviceService;

    @GetMapping("/")
    public String getAdvice(Model model) {
        String advice = adviceService.getAdvice();
        model.addAttribute("advice", advice);
        return "index";
    }
}
