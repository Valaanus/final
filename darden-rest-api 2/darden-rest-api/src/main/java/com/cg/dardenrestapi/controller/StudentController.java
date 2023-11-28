package com.cg.dardenrestapi.controller;
import java.util.ArrayList;
import java.util.List;
 
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.dardenrestapi.bean.Student;
 

 
@RestController
@RequestMapping("students")
public class StudentController {
	//http://localhost:8080/student
	//private String sri;
 
	@GetMapping("/student")
	public ResponseEntity<Student> getStudent(){
		Student student = new Student(
				1,
				"Darden",
				"Project");
		return ResponseEntity.ok()
				.header("custom-header", "Darden")
				.body(student);
	}
	 // http://localhost:8080/students
    @GetMapping
    public ResponseEntity<List<Student>> getStudents(){
        List<Student> students = new ArrayList<>();
        students.add(new Student(14, "Rajitha", "Dhatri"));
        students.add(new Student(2, "Sahithi", "Sushma"));
        students.add(new Student(3, "Maha", "Devi"));
        students.add(new Student(4, "Pravallika", "MS"));
        return ResponseEntity.ok(students);
    }
// http://localhost:8080/students/1/Dhatri/UI
    @GetMapping("{id}/{first-name}/{last-name}")
    public ResponseEntity<Student> studentPathVariable(@PathVariable("id") int studentId,
                                       @PathVariable("first-name") String firstName,
                                       @PathVariable("last-name") String lastName){
        Student student = new Student(studentId, firstName, lastName);
        return ResponseEntity.ok(student);
    }
    //spring boot RestApi with Request param
    //http://localhost:8080/students/query?id=1&firstName=Rajitha&lastName=Dhatri
    @GetMapping("student/query")
    public Student studentRequestParamVariable(@RequestParam int id,@RequestParam String firstName,@RequestParam String lastName) {
    	return new Student(id,firstName,lastName);
    }
    // Spring boot Rest API that handles HTTP post Request
    //@PostMapping and @RequestBody
    @PostMapping("students/create")
    public Student createStudent(Student student) {
    	System.out.println(student.getId());
    	System.out.println(student.getFirstName());
    	System.out.println(student.getLastName());
    	return student;
    }

 
}




	
