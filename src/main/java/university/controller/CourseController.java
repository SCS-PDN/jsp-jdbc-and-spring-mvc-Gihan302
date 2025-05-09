package main.java.university.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@Controller
public class CourseController {
  @GetMapping("/courses")
  public String showCourses(Model model) {
    List<String> courses = Arrays.asList("Math", "CS", "Chemistry");
    model.addAttribute("courses", courses);
    return "courses";
  }

  @PostMapping("/register/{id}")
  public String registerCourse(@PathVariable String id) {
    return "success";
  }
}
