package rocha.andre.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/users/create")
    public String create() {
        return "user/create";
    }

    @GetMapping("/login")
    public String bootstrap() {
        return "user/login";
    }

    @GetMapping("/userid")
    public String userById() {
        return "user/userid";
    }

    @GetMapping("/listausuarios")
    public String listAll() {
        return "user/listall";
    }

    @GetMapping("/signup")
    public String signup() {
        return "user/create";
    }
}
