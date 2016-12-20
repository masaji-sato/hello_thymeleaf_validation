package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class TestController {


    // mapping. no setter, no public access modifier
    @GetMapping(value = "/hasgetter/test")
    String get() {
        return "test";
    }
    @PostMapping(value = "hasgetter/test")
    String post(@ModelAttribute com.example.model.hasgetter.A a, Model model) {
        return "test";
    }



    // th:object example
    @GetMapping(value = "/hasgetter/test02")
    String getTest02(@ModelAttribute com.example.model.hasgetter.A a, Model model) {
        model.addAttribute("a", new com.example.model.hasgetter.A());
        return "test02";
    }
    @PostMapping(value = "/hasgetter/test02")
    String postTest02(@ModelAttribute com.example.model.hasgetter.A a, Model model) {
        return "test02";
    }

    @GetMapping(value = "/nogetter/test02")
    String getTest02(@ModelAttribute com.example.model.nogetter.A a, Model model) {
        model.addAttribute("a", new com.example.model.nogetter.A());
        return "test02";
    }
    @PostMapping(value = "/nogetter/test02")
    String postTest02(@ModelAttribute com.example.model.nogetter.A a, Model model) {
        return "test02";
    }



    // th:text example
    @GetMapping(value = "/hasgetter/test03")
    String getTest03HasGetter(@ModelAttribute com.example.model.hasgetter.A a, Model model) {
        model.addAttribute("a", new com.example.model.hasgetter.A());
        return "test03";
    }
    @PostMapping(value = "/hasgetter/test03")
    String postTest03HasGetter(@ModelAttribute com.example.model.hasgetter.A a, Model model) {
        return "test03";
    }

    @GetMapping(value = "/nogetter/test03")
    String getTest03(@ModelAttribute com.example.model.nogetter.A a, Model model) {
        model.addAttribute("a", new com.example.model.nogetter.A());
        return "test03";
    }
    @PostMapping(value = "/nogetter/test03")
    String postTest03(@ModelAttribute com.example.model.nogetter.A a, Model model) {
        return "test03";
    }



    // th:text example
    @GetMapping(value = "/hasgetter/test04")
    String getTest04HasGetter(@ModelAttribute com.example.model.hasgetter.A a, Model model) {
        model.addAttribute("a", new com.example.model.hasgetter.A());
        return "test04";
    }
    @PostMapping(value = "/hasgetter/test04")
    String postTest04HasGetter(@ModelAttribute com.example.model.hasgetter.A a, Model model) {
        return "test04";
    }

    @GetMapping(value = "/nogetter/test04")
    String getTest04(@ModelAttribute com.example.model.nogetter.A a, Model model) {
        model.addAttribute("a", new com.example.model.nogetter.A());
        return "test04";
    }
    @PostMapping(value = "/nogetter/test04")
    String postTest04(@ModelAttribute com.example.model.nogetter.A a, Model model) {
        return "test04";
    }
}
