package ar.edu.itba.paw.webapp.controller;

import ar.edu.itba.paw.interfaces.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
    private final UserService us;

    @Autowired
    public HelloWorldController(final UserService us){
        this.us = us;
    }


    @RequestMapping("/")
    public ModelAndView helloWorld() {
        final ModelAndView mav = new ModelAndView("helloworld/index");
        mav.addObject("username", us.createUser("paw@itba.edu.ar", "mysecret").getEmail());
        return mav;
    }

    @RequestMapping("/register")
    public ModelAndView register() {
        return new ModelAndView("helloworld/register");
    }
}