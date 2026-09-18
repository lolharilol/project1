package SriEshwar.project1.Services;

import SriEshwar.project1.Models.Student;
import SriEshwar.project1.StudentRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices{
    @Autowired
    private StudentRepository studentRepository;

    public Student createstudent (Student data){
        return studentRepository.save(data);
    }
    public List<Student> getallstudent(){
        return studentRepository.findAll();
    }
    public Student updatestudent(Student data){
        return studentRepository.save(data);
    }
}

