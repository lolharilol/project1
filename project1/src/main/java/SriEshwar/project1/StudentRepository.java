package SriEshwar.project1;

import SriEshwar.project1.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository
        extends JpaRepository
        <Student, Long>{
}