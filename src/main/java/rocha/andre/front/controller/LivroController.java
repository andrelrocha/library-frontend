package rocha.andre.front.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LivroController {
    @GetMapping("/livros")
    public String create() {
        return "livro/listalivros";
    }

}

