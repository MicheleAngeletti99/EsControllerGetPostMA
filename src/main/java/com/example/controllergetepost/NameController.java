package com.example.controllergetepost;

import org.springframework.web.bind.annotation.*;

@RestController
public class NameController {

    @GetMapping("/getName")
    public String getName(@RequestParam(name = "name") String name){
        return name;
    }

    @PostMapping("/postName")
    public String postName(@RequestParam(name = "name") String name){
        StringBuilder nameString = new StringBuilder(name);
        return nameString.reverse().toString();
    }
}
