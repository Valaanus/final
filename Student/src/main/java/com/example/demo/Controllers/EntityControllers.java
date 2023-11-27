package com.example.demo.Controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
 
import com.example.demo.Model.student;
import com.example.demo.Service.EntityService;
 
import java.util.List;
 
@RestController
@RequestMapping("/entities")
public class EntityControllers {
@Autowired
private EntityService entityService;
 
@PostMapping("/add")
public ResponseEntity<student> createEntity(@RequestBody student entity) {
     student createdEntity = entityService.saveEntity(entity);
     return ResponseEntity.ok(createdEntity);
}
 
@GetMapping("/{id}")
public ResponseEntity<student> getEntityById(@PathVariable Long id) {
     student entity = entityService.getEntityById(id);
     return ResponseEntity.ok(entity);
}
 
@GetMapping
public ResponseEntity<List<student>> getAllEntities() {
     List<student> entities = entityService.getAllEntities();
     return ResponseEntity.ok(entities);
}
 
@PutMapping("/{id}")
public ResponseEntity<student> updateEntity(@PathVariable Long id, @RequestBody student updatedEntity) {
     // Ensure that the updatedEntity has the correct ID
     updatedEntity.setId(id);
     student entity = entityService.saveEntity(updatedEntity);
     return ResponseEntity.ok(entity);
}
 
@DeleteMapping("/{id}")
public ResponseEntity<Void> deleteEntity(@PathVariable Long id) {
     entityService.deleteEntity(id);
     return ResponseEntity.noContent().build();
}
}