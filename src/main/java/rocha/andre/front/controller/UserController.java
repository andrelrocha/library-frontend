package rocha.andre.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/users/emprestimos")
    public String emprestimoLivro() {
        return "user/listaemprestimos";
    }

    @GetMapping("/users/create")
    public String create() {
        return "user/create";
    }

    @GetMapping("/users/userid")
    public String userById() {
        return "user/userid";
    }

    @GetMapping("/users/listausuarios")
    public String listAll() {
        return "user/listall";
    }

    @GetMapping("/users/update")
    public String updateUser() {
        return "user/update";
    }

    @GetMapping("/signup")
    public String signup() {
        return "user/create";
    }

    @GetMapping("/login")
    public String login() {
        return "user/login";
    }

    @GetMapping("/")
    public String homepage() {
        return "user/login";
    }
}
