package it.marconi.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


//Stereotype annotation
@Controller
@RequestMapping("/")
public class HelloController {
    
    //CRUD Create Read Update Delete --> HTTP Post, Get, Put, Delete
    @GetMapping
	public String greet(){
		return "hello-world";
	}

    @GetMapping(params="lupa")
    public String greetParameter() {
        return "hello-world-param";
    }
    
    //Collegamento alla view tramite endpoint
    @GetMapping(params="Bigolo")
    public String greetModel(){
        return "hello-world-model";
    }

    //Passaggio di parametri
    @ModelAttribute("Finduskers")
    public String handlerNome(){
        return "Koksalduiner con il suo Bismagulo";
    }


}
