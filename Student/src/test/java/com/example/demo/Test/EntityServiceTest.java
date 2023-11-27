package com.example.demo.Test;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
 
import com.example.demo.Model.student;
import com.example.demo.Repository.EntityRepository;
import com.example.demo.Service.EntityServiceImp;
 
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
 
@SpringBootTest
public class EntityServiceTest {
 
    @Mock
    private EntityRepository entityRepository;
 
    @InjectMocks
    private EntityServiceImp entityService;
 
    @Test
    public void testSaveEntity() {
        student entityToSave = new student();
        entityToSave.setName("Test Entity");
 
        student savedEntity = new student();
        savedEntity.setId(1L);
        savedEntity.setName("Test Entity");
 
        when(entityRepository.save(any(student.class))).thenReturn(savedEntity);
 
        student result = entityService.saveEntity(entityToSave);
 
        assertEquals(savedEntity.getId(), result.getId());
        assertEquals(savedEntity.getName(), result.getName());
    }
 
    @Test
    public void testGetEntityById() {
        Long entityId = 1L;
        student entity = new student();
        entity.setId(entityId);
        entity.setName("Test Entity");
 
        when(entityRepository.findById(entityId)).thenReturn(java.util.Optional.of(entity));
 
        student result = entityService.getEntityById(entityId);
 
        assertEquals(entity.getId(), result.getId());
        assertEquals(entity.getName(), result.getName());
    }
 
    @Test
    public void testGetAllEntities() {
        student entity1 = new student();
        entity1.setId(1L);
        entity1.setName("Entity 1");
 
        student entity2 = new student();
        entity2.setId(2L);
        entity2.setName("Entity 2");
 
        List<student> entities = Arrays.asList(entity1, entity2);
 
        when(entityRepository.findAll()).thenReturn(entities);
 
        List<student> result = entityService.getAllEntities();
 
        assertEquals(entities.size(), result.size());
        assertEquals(entities.get(0).getId(), result.get(0).getId());
        assertEquals(entities.get(1).getName(), result.get(1).getName());
    }
 
    @Test
    public void testDeleteEntity() {
        Long entityId = 1L;
 
        // Mocking the repository to do nothing when deleteById is called
        Mockito.doNothing().when(entityRepository).deleteById(entityId);
 
        // Calling the service method
        entityService.deleteEntity(entityId);
 
        // Verifying that deleteById was called once with the specified ID
        Mockito.verify(entityRepository, Mockito.times(1)).deleteById(entityId);
    }
}