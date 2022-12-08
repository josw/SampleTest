package com.example.trans.service;

import com.example.trans.repository.ParentRepository;
import com.example.trans.repository.entity.Parent;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SecondService {

    private final ParentRepository parentRepository;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
//    @Transactional
    public void saveParent(String name) {
        Parent parent = Parent.builder().name(name).build();
        parentRepository.saveAndFlush(parent);
    }

}
