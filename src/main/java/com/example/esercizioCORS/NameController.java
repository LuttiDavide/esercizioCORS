package com.example.esercizioCORS;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:2020")
public class NameController {
    @RequestMapping(method = RequestMethod.GET, path = "/name")
    @GetMapping("/name")
    public String getName(@RequestParam String name) {
        return name;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/name/reverse")
    @PostMapping("/name/reverse")
    public String reverseName(@RequestBody String name) {
        return new StringBuilder(name).reverse().toString();
    }
}
