package br.com.florzinha.florzinha.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ViewController {

    @GetMapping("/home")
    public String home() {
        return "home";
    }

    @GetMapping("/thymeleaf")
    public String thymeleaf(Model model) {
        model.addAttribute( "risos", "Amy");
        return "thymeleaf";
    }

    @GetMapping("/reqparam")
    public String reqparam(@RequestParam(name="paramURLantes", required=false, defaultValue="World") String var, Model model) {
        model.addAttribute("varHtml", var);
        return "reqparam";
    }
}
