package com.example.trans.controller;

import com.example.trans.repository.entity.Parent;
import com.example.trans.service.FamilyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class FamilyController {

    private final FamilyService familyService;

    @GetMapping({"", "/"})
    public List<Parent> index() {
        return familyService.getFamily();
    }

    @GetMapping("/init")
    public String init() {
        saveParent("parent3");
        saveParent("parent4");



        return "OK2";


    }

    @PutMapping("/parent")
    public Parent saveParent(@RequestParam String name) {
        return familyService.setParent(name);
    }

    @GetMapping("/parent/{id}")
    public Parent getParent(@PathVariable Long id) {
        return familyService.getParent(id);
    }

    @PutMapping("/relate")
    public String relate(){
        return familyService.relate();
    }

    @PutMapping("/relate2")
    public String relate2(){
        return familyService.relate2();
    }

}
