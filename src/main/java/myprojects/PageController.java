package myprojects;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller   // VERY IMPORTANT
public class PageController {

    @GetMapping("/signup-form")
    public String showSignupForm() {

        return "signup";   // signup.html open chestundi
    }
}