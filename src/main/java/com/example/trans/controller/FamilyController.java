package com.example.trans.controller;

import com.example.trans.repository.entity.Parent;
import com.example.trans.service.FamilyService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class FamilyController {

    private final FamilyService familyService;

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
