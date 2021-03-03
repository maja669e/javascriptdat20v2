package dk.kea.javascriptdemodat20v2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/bmi")
    public String bmi() {return "bmi";}

    @GetMapping("/state")
    public String state() {return "state";}

    @GetMapping("/calculator")
    public String calculator() {return "calculator";}


}
