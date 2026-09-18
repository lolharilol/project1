package SriEshwar.project1.Services;

import SriEshwar.project1.Models.Student;
import SriEshwar.project1.StudentRepository;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffServices{
    @Autowired
    private StaffServices staffRepository;

    public Student createstudent (Student data){
        return staffRepository.save(data);
    }
    public List<Student> getallstudent(){
        return staffRepository.findAll();
    }
    public Student updatestudent(Student data){
        return staffRepository.save(data);
    }
}
