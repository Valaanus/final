package com.example.demo.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.student;

@Repository
public interface EntityRepository extends JpaRepository<student, Long> {
 
}
 