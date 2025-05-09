package main.java.university.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
  @GetMapping("/login")
  public String showLogin() {
    return "login";
  }

  @PostMapping("/login")
  public String login(@RequestParam String email, @RequestParam String password, HttpSession session, Model model) {
    if (email.equals("student1@uni.com") && password.equals("pass123")) {
      session.setAttribute("email", email);
      return "redirect:/courses";
    } else {
      model.addAttribute("error", "Invalid");
      return "login";
    }
  }
}
