package rocha.andre.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/users/create")
    public String create() {
        return "create";
    }

    @GetMapping("/login")
    public String bootstrap() {
        return "login";
    }

    @GetMapping("/userid")
    public String userById() {
        return "userid";
    }

    @GetMapping("/listall")
    public String listAll() {
        return "listall";
    }
}
