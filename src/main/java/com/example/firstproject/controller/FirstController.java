package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "hongpark");
        return "greetings";
    }

    @GetMapping("/bye")
    public String setYouNext(Model model) {
        model.addAttribute("nickname", "hongpark");
        return "goodbye";
    }
}
