package it.marconi.helloworld.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("Nasello")
public class HelloModelController {
    
    //Questo metodo permette di fare un metodo unico per 
    //@modelattribute e @getmapping
    @GetMapping("Merluzzo")
    public ModelAndView greetAttribute(){
        return new ModelAndView("hello-world-model").addObject("Finduskers", "Ntondus");
    }

    //Passa un parametro tramite query string, riprendiamo il parametro finduskers e mettiamo uno di default
    //Qui possiamo scegliere noi il dato tramite parametro
    @GetMapping("Bigoluz")
    public ModelAndView greetParameter(@RequestParam(name = "Finduskers", defaultValue = "Barbospoof") String name){
        return new ModelAndView("hello-world-model").addObject("Finduskers", name);
    }
}
