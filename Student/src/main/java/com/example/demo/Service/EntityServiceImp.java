package com.example.demo.Service;
 
import java.util.List;
 
import com.example.demo.Model.student;
import com.example.demo.Repository.EntityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service
public class EntityServiceImp implements EntityService {
	
    @Autowired
    private EntityRepository entityRepository;
 
    @Override
    public student saveEntity(student entity) {
        // Additional business logic if needed
        return entityRepository.save(entity);
    }
 
    @Override
    public student getEntityById(Long id) {
        return entityRepository.findById(id).orElse(null);
    }
 
    @Override
    public List<student> getAllEntities() {
        return entityRepository.findAll();
    }
    @Override
    public void deleteEntity(Long id) {
        entityRepository.deleteById(id);
}
}