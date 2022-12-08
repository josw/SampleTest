package com.example.trans.repository;

import com.example.trans.repository.entity.Parent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParentRepository extends JpaRepository<Parent, Long> {
}
