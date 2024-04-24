package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import application.repository.GeneroRepository;

@Controller
@RequestMapping("/generos")
public class generoControler {
    @Autowired
    private GeneroRepository generoRepo;
}
