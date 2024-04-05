package ac.su.dinamicstatic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {
    @RequestMapping("/")
    public String root(){
        return "this is a root page";
    }

    @RequestMapping("/greeting")
    public String greeting(@RequestParam("time") String time){
        return String.format("Hello, good %s", time);
    }
}
