package SriEshwar.project1.Controller;

import SriEshwar.project1.Models.Student;
import SriEshwar.project1.Services.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {


    public StudentController(StudentServices studentServices) {
        this.studentServices = studentServices;
    }

    @Autowired
    private StudentServices studentServices;

    @GetMapping("/getall")
    ResponseEntity <List<Student>> getall(){
        return new ResponseEntity<>(studentServices.getallstudent(), HttpStatus.OK);
    }
    @PutMapping("/update")
    ResponseEntity <Student> updatestudent(@RequestBody Student data){
        return new ResponseEntity<>(studentServices.updatestudent(data), HttpStatus.ACCEPTED);
    }

    @GetMapping("getbyid/{id}")
    String getbyId(@PathVariable long id){
        return "AIDS with id"+id;
    }
    @PostMapping("/create")
    ResponseEntity<Student>  createtodo(@RequestBody Student body){
        return new ResponseEntity<>(studentServices.createstudent(body), HttpStatus.CREATED);
    }
    @GetMapping
    String getbyIdParam(@RequestParam long i){
        return "todo with id " + i;
    }

}