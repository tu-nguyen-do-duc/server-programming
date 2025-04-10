package fi.haagahelia.model_and_view.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import fi.haagahelia.domain.Student;

import org.springframework.ui.Model;


@Controller
public class StudentController {
    @GetMapping("/student")
    public String showStudents(Model model) {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new Student("John", "Doe");
        Student student2 = new Student("Jane", "Smith");
        Student student3 = new Student("Emily", "Jones");
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        
        model.addAttribute("studentList", studentList);
        return "student";
    }
    
}
