package com.example.trans.service;

import com.example.trans.repository.ChildRepository;
import com.example.trans.repository.entity.Child;
import com.example.trans.repository.entity.Parent;
import com.example.trans.repository.ParentRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class FamilyService {
    private final ParentRepository parentRepository;

    private final ChildRepository childRepository;

    private final SecondService secondService;

    public Parent getParent(Long id) {
        return parentRepository.findById(id).orElse(null);
    }

    public Parent setParent(String name) {
        Parent parent = Parent.builder().name(name).build();
        return parentRepository.save(parent);
    }

    public Child addChild(String name, Long parentId) throws Exception {
        Parent parent = getParent(parentId);
        if (parent == null) {
            throw new Exception("Parent not found");
        }

        Child child = Child.builder().name(name).parentId(parentId).build();
        return childRepository.save(child);
    }

    @Transactional
    public String relate() {

        Parent p1 = Parent.builder().name("J111").build();
        Parent p2 = Parent.builder().name("J222").build();
        Parent p3 = Parent.builder().name("J111").build();

        parentRepository.saveAndFlush(p1);
        parentRepository.saveAndFlush(p2);

        try {
            parentRepository.saveAndFlush(p3);
        } catch (Exception ex) {
            System.out.println("EX: "+ ex.getMessage());
        }
        return "OK";
    }

    @Transactional
    public String relate2() {

//        secondService.saveParent("jjjj1");
//        secondService.saveParent("jjjj2");

        Parent p1 = Parent.builder().name("J111").build();
        Parent p2 = Parent.builder().name("J222").build();
//        Parent p3 = Parent.builder().name("J111").build();

        parentRepository.saveAndFlush(p1);
        parentRepository.saveAndFlush(p2);


        try {
            secondService.saveParent("J111");
        } catch (Exception ex) {
            System.out.println("EX: "+ ex.getMessage());
        }
        return "OK";
    }

}
