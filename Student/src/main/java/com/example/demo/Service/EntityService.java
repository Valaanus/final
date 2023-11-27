package com.example.demo.Service;
 
import java.util.List;
 
import com.example.demo.Model.student;
 
public interface EntityService {
	student saveEntity(student entity);
    student getEntityById(Long id);
    List<student> getAllEntities();
    void deleteEntity(Long id);
}